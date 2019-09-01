package com.lduran.streamsoperations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("buidService")
public class BuildService
{
	@Autowired
	private C420Service c420Service;

	@Autowired
	private C490Service c490Service;

	@Autowired
	private ComercialService comercialService;

	@Autowired
	private ComercGroupByService comercGroupByService;

	/**
	 * @return the c420Service
	 */
	public C420Service getC420Service()
	{
		return c420Service;
	}

	/**
	 * @return the c490Service
	 */
	public C490Service getC490Service()
	{
		return c490Service;
	}

	/**
	 * @return the c490Service
	 */
	public ComercialService getComercialService()
	{
		return comercialService;
	}

	/**
	 * @return the c490Service
	 */
	public ComercGroupByService getComercGroupByService()
	{
		return comercGroupByService;
	}
}
