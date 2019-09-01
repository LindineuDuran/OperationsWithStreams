package com.lduran.streamsoperations.service;

import java.text.NumberFormat;

import org.springframework.stereotype.Service;

import com.lduran.streamsoperations.model.ComercGroupBy;

@Service
public class ComercGroupByServiceImpl implements ComercGroupByService
{

	@Override
	public String getObjectHeader()
	{
		return "IdOrganizacao;DataDoMovimento;TotalDoItem";
	}

	@Override
	public String getObjectContent(ComercGroupBy com)
	{
		NumberFormat formatadorNumerico = NumberFormat.getNumberInstance();

		return com.getOrganizacao() + ";" + com.getDataMovimento() + ";"
				+ formatadorNumerico.format(com.getValorTotal());
	}

}
