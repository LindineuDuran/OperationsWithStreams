package com.lduran.streamsoperations.features;

import java.io.IOException;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.lduran.streamsoperations.model.*;
import com.lduran.streamsoperations.service.BuildService;
import com.lduran.streamsoperations.util.*;

@Component
/**
 * Common SQL Clauses and Their Equivalents in Java 8 Streams
 * https://blog.jooq.org/2015/08/13/common-sql-clauses-and-their-equivalents-in-java-8-streams/
 *
 * Java Code Examples for org.jooq.lambda.Seq
 * https://www.programcreek.com/java-api-examples/index.php?api=org.jooq.lambda.Seq
 *
 * @author lindineu.duran
 *
 */
public class ProcessCenter
{
	@Autowired
	FileHandler fh;

	@Autowired
	BuildService bs;

	@Autowired
	SQLInStream sql;

	@Autowired
	ListHandler lst;

	// remember to change the file path
	String Diretory = "C:\\GitHub\\OperationsWithStreams\\";

	@Bean
	public void start()
	{
		// ========================
		// read the first text file
		// ========================
		List<String> fileContent = new LinkedList<>();
		try
		{
			fileContent = this.fh.readFile(Diretory + "C420.txt");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		// =====================================
		// Make a List<C420> from a List<String>
		// =====================================
		List<C420> objectListC420 = new ArrayList<>();
		if (fileContent.size() > 0)
		{
			objectListC420 = this.bs.getC420Service().getObjectList(fileContent);
		}

		// =========================
		// read the second text file
		// =========================
		try
		{
			fileContent = this.fh.readFile(Diretory + "C490.txt");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		// =====================================
		// Make a List<C490> from a List<String>
		// =====================================
		List<C490> objectListC490 = new ArrayList<>();
		if (fileContent.size() > 0)
		{
			objectListC490 = this.bs.getC490Service().getObjectList(fileContent);
		}

		// =======================================================================
		// Example of Select in Stream () Generating Output in JSON. It receives a
		// List<C420>
		// =======================================================================
		List<String> lstResult = this.sql.selectJson(objectListC420);
		System.out.println("Shows the result of select in a List<C420>!");
		this.lst.imprimeLista(lstResult);

		// =======================================================================
		// Example of Select in Stream () Generating Output in CSV. It receives a
		// List<C420>
		// =======================================================================
		lstResult = this.sql.selectCsv(objectListC420);
		System.out.println("Shows the result of select in a List<C420>!");
		this.lst.imprimeLista(lstResult);

		// ======================================================================
		// Example of Select in Stream () Generating Output in CSV. It receives a
		// List<C490>
		// ======================================================================
		lstResult = this.sql.selectCsvC490(objectListC490);
		System.out.println("Shows the result of select in a List<C490>!");
		this.lst.imprimeLista(lstResult);

		// ==================================
		// Saves the lstResult in a text file
		// ==================================
		try
		{
			this.fh.writeStream(Diretory + "ResultadoC490Processada.txt", lstResult);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		// =======================================================
		// Example of Where in Stream () Generating Output in CSV.
		// It receives a List<C420>
		// =======================================================
		lstResult = this.sql.whereCSV(objectListC420);
		System.out.println("Shows the result of where in a List<C420>!");
		this.lst.imprimeLista(lstResult);

		// =======================================================
		// Example of Where in Stream () Generating Output in CSV.
		// It receives a List<C490>
		// =======================================================
		lstResult = this.sql.whereCSV_C490(objectListC490);
		System.out.println("Shows the result of where in a List<C490>!");
		this.lst.imprimeLista(lstResult);

		// ======================================================================
		// Example of Left Outter Join using 2 streams() generating Output in CSV
		// ======================================================================
		lstResult = this.sql.leftOuterJoinRetornaString(objectListC420, objectListC490);
		System.out.println("Shows the result of Left Outer Join!");
		this.lst.imprimeLista(lstResult);

		// ==================================
		// Saves the lstResult in a text file
		// ==================================
		try
		{
			this.fh.writeStream(Diretory + "ResultadoC420xC490.txt", lstResult);
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ========================================================================
		// Example of Left Outter Join using 2 streams() generating List<Comercial>
		// ========================================================================
		List<Comercial> lstComercial = this.sql.leftOuterJoinRetornaComercial(objectListC420, objectListC490);

		// ==========================================================================================
		// Example of Left Outter Join using 2 streams() generating List<Comercial> with
		// JOOQ Library
		// ==========================================================================================
		List<Comercial> lstComercialJOOQ = this.sql.leftOuterJoinJooqRetornaString(objectListC420, objectListC490);

		// ==========================
		// Format the report like CSV
		// ==========================
		lstResult = this.lst.formataRelatorioComercial(lstComercialJOOQ);
		this.lst.imprimeLista(lstResult);

		// ==================================
		// Saves the lstResult in a text file
		// ==================================
		try
		{
			this.fh.writeStream(Diretory + "ResultadoC420xC490_Objeto.txt", lstResult);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		// =====================================================================
		// Example of Aggregation of the Quantity Column, of type Double, in the
		// Organization Column
		// =====================================================================
		Map<String, Double> teste = this.sql.totalQuantidadeForOrganizacao(lstComercial);

		// ===========================================================
		// Example of Aggregating a BigDecimal Column into Two Columns
		// ===========================================================
		List<ComercGroupBy> listagemGroupBy = this.sql.totalValorForOrgaAndDatMov(lstComercial);

		// ==========================
		// Format the report like CSV
		// ==========================
		lstResult = this.lst.formataRelatorioComercGroupBy(listagemGroupBy);
		this.lst.imprimeLista(lstResult);

		// ==================================
		// Saves the lstResult in a text file
		// ==================================
		try
		{
			this.fh.writeStream(Diretory + "ResultadoGroupBy.txt", lstResult);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		// ==========================================================================================
		// More powerful aggregation, totaling multiple columns, grouping into several
		// other columns
		// ==========================================================================================
		lstResult = this.sql.MultiColumnAgregation(lstComercial);

		// ==================================
		// Saves the lstResult in a text file
		// ==================================
		try
		{
			this.fh.writeStream(Diretory + "ResultadoMultiColumnAgregation.txt", lstResult);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		System.out.println("End of Process!!!");
	}
}
