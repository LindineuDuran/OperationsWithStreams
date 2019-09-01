package com.lduran.streamsoperations.features;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lduran.streamsoperations.model.ComercGroupBy;
import com.lduran.streamsoperations.model.Comercial;
import com.lduran.streamsoperations.service.BuildService;

@Component("lst")
public class ListHandler
{
	@Autowired
	BuildService bs;

	/**
	 * displays the contents of the list on screen
	 *
	 * @param listagem
	 */
	public void imprimeLista(List<String> listagem)
	{
		for (String linha : listagem)
		{
			System.out.println(linha);
		}
	}

	/**
	 * Format the report like CSV
	 *
	 * @param lstComercial
	 * @return
	 */
	public List<String> formataRelatorioComercial(List<Comercial> lstComercial)
	{
		List<String> relatorio = new LinkedList<>();

		if (!lstComercial.isEmpty())
		{
			String header = bs.getComercialService().getObjectHeader();
			relatorio.add(header);

			for (Comercial line : lstComercial)
			{
				relatorio.add(bs.getComercialService().getObjectContent(line));
			}
		}

		return relatorio;
	}

	/**
	 * Format the report like CSV
	 *
	 * @param lstComercial
	 * @return
	 */
	public List<String> formataRelatorioComercGroupBy(List<ComercGroupBy> lstComercial)
	{
		List<String> relatorio = new LinkedList<>();

		if (!lstComercial.isEmpty())
		{
			String header = bs.getComercGroupByService().getObjectHeader();
			relatorio.add(header);

			for (ComercGroupBy line : lstComercial)
			{
				relatorio.add(bs.getComercGroupByService().getObjectContent(line));
			}
		}

		return relatorio;
	}
}