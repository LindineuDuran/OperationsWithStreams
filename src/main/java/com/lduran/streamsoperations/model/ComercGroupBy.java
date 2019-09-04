package com.lduran.streamsoperations.model;

public class ComercGroupBy
{
	private String organizacao = "";
	private String dataMovimento = "";
	private Double valorTotal = 0.0;

	/**
	 * @param organizacao
	 * @param dataMovimento
	 * @param valorTotal
	 */
	public ComercGroupBy(String organizacao, String dataMovimento, Double valorTotal)
	{
		this.organizacao = organizacao;
		this.dataMovimento = dataMovimento;
		this.valorTotal = valorTotal;
	}

	/**
	 * @return the organizacao
	 */
	public String getOrganizacao()
	{
		return this.organizacao;
	}

	/**
	 * @return the dataMovimento
	 */
	public String getDataMovimento()
	{
		return this.dataMovimento;
	}

	/**
	 * @return the valorTotal
	 */
	public Double getValorTotal()
	{
		return this.valorTotal;
	}

	@Override
	public String toString()
	{
		return "ComercGroupBy [organizacao=" + this.organizacao + ", dataMovimento=" + this.dataMovimento
				+ ", valorTotal=" + this.valorTotal + "]";
	}
}