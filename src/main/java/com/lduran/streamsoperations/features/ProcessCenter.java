package com.lduran.streamsoperations.features;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

import org.jooq.lambda.tuple.Tuple6;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.lduran.streamsoperations.model.*;
import com.lduran.streamsoperations.service.BuildService;
import com.lduran.streamsoperations.util.*;

@Component
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

	@Bean
	public void start()
	{
		// ========================
		// read the first text file
		// ========================
		List<String> fileContent = new LinkedList<>();
		try
		{
			// remember to change the file path
			fileContent = fh.readFile("C:\\GitHub\\OperationsWithStreams\\C420.txt");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		// =====================================
		// Make a List<C420> from a List<String>
		// =====================================
		C420 c420 = new C420();
		List<C420> objectListC420 = new ArrayList<>();
		if (fileContent.size() > 0)
		{
			objectListC420 = bs.getC420Service().getObjectList(fileContent);
		}

		// =========================
		// read the second text file
		// =========================
		try
		{
			// remember to change the file path
			fileContent = fh.readFile("C:\\GitHub\\OperationsWithStreams\\C490.txt");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		// =====================================
		// Make a List<C490> from a List<String>
		// =====================================
		C490 c490 = new C490();
		List<C490> objectListC490 = new ArrayList<>();
		if (fileContent.size() > 0)
		{
			objectListC490 = bs.getC490Service().getObjectList(fileContent);
		}

		// =======================================================================
		// Example of Select in Stream () Generating Output in JSON. It receives a
		// List<C420>
		// =======================================================================
		List<String> lstResult = sql.selectJson(objectListC420);
		System.out.println("Shows the result of select in a List<C420>!");
		lst.imprimeLista(lstResult);

		System.out.print("Aperte qualquer tecla: ");
		String operacao = "";
		try
		{
			operacao = leOperacao();
		}
		catch (NumberFormatException | IOException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

//		// =======================================================================
//		// Example of Select in Stream () Generating Output in CSV. It receives a
//		// List<C420>
//		// =======================================================================
//		lstResult = sql.selectCsv(objectListC420);
//		System.out.println("Shows the result of select in a List<C420>!");
//		lst.imprimeLista(lstResult);
//
//		System.out.print("Aperte qualquer tecla: ");
//		try
//		{
//			operacao = leOperacao();
//		}
//		catch (NumberFormatException | IOException e1)
//		{
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//
//		// ======================================================================
//		// Example of Select in Stream () Generating Output in CSV. It receives a
//		// List<C490>
//		// ======================================================================
//		lstResult = sql.selectCsvC490(objectListC490);
//		System.out.println("Shows the result of select in a List<C490>!");
//		lst.imprimeLista(lstResult);
//
//		// ==================================
//		// Saves the lstResult in a text file
//		// ==================================
//		try
//		{
//			// remember to change the file path
//			fh.writeStream("C:\\GitHub\\OperationsWithStreams\\ResultadoC490Processada.txt", lstResult);
//		}
//		catch (IOException e)
//		{
//			e.printStackTrace();
//		}
//
//		System.out.print("Aperte qualquer tecla: ");
//		try
//		{
//			operacao = leOperacao();
//		}
//		catch (NumberFormatException | IOException e1)
//		{
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}

		// =======================================================
		// Example of Where in Stream () Generating Output in CSV.
		// It receives a List<C420>
		// =======================================================
		lstResult = sql.whereCSV(objectListC420);
		System.out.println("Shows the result of where in a List<C420>!");
		lst.imprimeLista(lstResult);

		System.out.print("Aperte qualquer tecla: ");
		try
		{
			operacao = leOperacao();
		}
		catch (NumberFormatException | IOException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// =======================================================
		// Example of Where in Stream () Generating Output in CSV.
		// It receives a List<C490>
		// =======================================================
		lstResult = sql.whereCSV_C490(objectListC490);
		System.out.println("Shows the result of where in a List<C490>!");
		lst.imprimeLista(lstResult);

		System.out.print("Aperte qualquer tecla: ");
		try
		{
			operacao = leOperacao();
		}
		catch (NumberFormatException | IOException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// ======================================================================
		// Example of Left Outter Join using 2 streams() generating Output in CSV
		// ======================================================================
		lstResult = sql.leftOuterJoinRetornaString(objectListC420, objectListC490);
		System.out.println("Shows the result of Left Outer Join!");
		lst.imprimeLista(lstResult);

		// ==================================
		// Saves the lstResult in a text file
		// ==================================
		try
		{
			// remember to change the file path
			fh.writeStream("C:\\GitHub\\OperationsWithStreams\\ResultadoC420xC490.txt", lstResult);
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.print("Aperte qualquer tecla: ");
		try
		{
			operacao = leOperacao();
		}
		catch (NumberFormatException | IOException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// ========================================================================
		// Example of Left Outter Join using 2 streams() generating List<Comercial>
		// ========================================================================
		List<Comercial> lstComercial = sql.leftOuterJoinRetornaComercial(objectListC420, objectListC490);

		// ==========================
		// Format the report like CSV
		// ==========================
		lstResult = lst.formataRelatorioComercial(lstComercial);
		lst.imprimeLista(lstResult);

		// ==================================
		// Saves the lstResult in a text file
		// ==================================
		try
		{
			// remember to change the file path
			fh.writeStream("C:\\GitHub\\OperationsWithStreams\\ResultadoC420xC490_Objeto.txt", lstResult);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		System.out.print("Aperte qualquer tecla: ");
		try
		{
			operacao = leOperacao();
		}
		catch (NumberFormatException | IOException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// =====================================================================
		// Example of Aggregation of the Quantity Column, of type Double, in the
		// Organization Column
		// =====================================================================
		Map<String, Double> teste = sql.totalQuantidadeForOrganizacao(lstComercial);

		// ===============================================
		// Simple Totalization of a BigDecimal Type Column
		// ===============================================
		BigDecimal sum = sql.totalValor(lstComercial);

		// ===========================================================
		// Example of Aggregating a BigDecimal Column into Two Columns
		// ===========================================================
		List<ComercGroupBy> listagemGroupBy = sql.totalValorForOrgaAndDatMov(lstComercial);

		// ==========================
		// Format the report like CSV
		// ==========================
		lstResult = lst.formataRelatorioComercGroupBy(listagemGroupBy);
		lst.imprimeLista(lstResult);

		// ==================================
		// Saves the lstResult in a text file
		// ==================================
		try
		{
			// remember to change the file path
			fh.writeStream("C:\\GitHub\\OperationsWithStreams\\ResultadoGroupBy.txt", lstResult);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		// More powerful aggregation, totaling multiple columns, grouping into several
		// other columns
		Map<Object, Tuple6<BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal>> map = sql
				.MultiColumnAgregation(lstComercial);
		map.entrySet().forEach(System.out::println);

		System.out.println("End of Process!!!");
	}

	/**
	 * Este metodo e responsavel por retornar a op�ao de menu do usuario
	 */
	public static String leOperacao() throws IOException, NumberFormatException
	{
		// Utiliza o metodo estatico da classe Teclado para ler a op�ao digitada
		// pelo usuario
		String op = Teclado.le();
		return op;
	}
}
