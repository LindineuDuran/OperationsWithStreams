package com.lduran.streamsoperations.model;

import java.math.BigDecimal;

public class C420
{
	private String organizacao = "";
	private String participante = "";
	private String modelo = "";
	private String dataMovimento = "";
	private BigDecimal valorTotalNFe = new BigDecimal(0);
	private String operacao = "";
	private String emissao = "";
	private String modFrete = "";
	private String satECF = "";
	private Double quantidade = 0.0;
	private BigDecimal valorTotal = new BigDecimal(0);

	/**
	 *
	 */
	public C420()
	{
	}

	/**
	 * @param organizacao
	 * @param participante
	 * @param modelo
	 * @param dataMovimento
	 * @param valorTotalNFe
	 * @param operacao
	 * @param emissao
	 * @param modFrete
	 * @param satECF
	 * @param quantidade
	 * @param valorTotal
	 */
	public C420(String organizacao, String participante, String modelo, String dataMovimento, BigDecimal valorTotalNFe,
			String operacao, String emissao, String modFrete, String satECF, Double quantidade, BigDecimal valorTotal)
	{
		this.organizacao = organizacao;
		this.participante = participante;
		this.modelo = modelo;
		this.dataMovimento = dataMovimento;
		this.valorTotalNFe = valorTotalNFe;
		this.operacao = operacao;
		this.emissao = emissao;
		this.modFrete = modFrete;
		this.satECF = satECF;
		this.quantidade = quantidade;
		this.valorTotal = valorTotal;
	}

	/**
	 * @return the organizacao
	 */
	public String getOrganizacao()
	{
		return organizacao;
	}

	/**
	 * @param organizacao the organizacao to set
	 */
	public void setOrganizacao(String organizacao)
	{
		this.organizacao = organizacao;
	}

	/**
	 * @return the participante
	 */
	public String getParticipante()
	{
		return participante;
	}

	/**
	 * @param participante the participante to set
	 */
	public void setParticipante(String participante)
	{
		this.participante = participante;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo()
	{
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}

	/**
	 * @return the dataMovimento
	 */
	public String getDataMovimento()
	{
		return dataMovimento;
	}

	/**
	 * @param dataMovimento the dataMovimento to set
	 */
	public void setDataMovimento(String dataMovimento)
	{
		this.dataMovimento = dataMovimento;
	}

	/**
	 * @return the valorTotalNFe
	 */
	public BigDecimal getValorTotalNFe()
	{
		return valorTotalNFe;
	}

	/**
	 * @param valorTotalNFe the valorTotalNFe to set
	 */
	public void setValorTotalNFe(BigDecimal valorTotalNFe)
	{
		this.valorTotalNFe = valorTotalNFe;
	}

	/**
	 * @return the operacao
	 */
	public String getOperacao()
	{
		return operacao;
	}

	/**
	 * @param operacao the operacao to set
	 */
	public void setOperacao(String operacao)
	{
		this.operacao = operacao;
	}

	/**
	 * @return the emissao
	 */
	public String getEmissao()
	{
		return emissao;
	}

	/**
	 * @param emissao the emissao to set
	 */
	public void setEmissao(String emissao)
	{
		this.emissao = emissao;
	}

	/**
	 * @return the modFrete
	 */
	public String getModFrete()
	{
		return modFrete;
	}

	/**
	 * @param modFrete the modFrete to set
	 */
	public void setModFrete(String modFrete)
	{
		this.modFrete = modFrete;
	}

	/**
	 * @return the satECF
	 */
	public String getSatECF()
	{
		return satECF;
	}

	/**
	 * @param satECF the satECF to set
	 */
	public void setSatECF(String satECF)
	{
		this.satECF = satECF;
	}

	/**
	 * @return the quantidade
	 */
	public Double getQuantidade()
	{
		return quantidade;
	}

	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(Double quantidade)
	{
		this.quantidade = quantidade;
	}

	/**
	 * @return the valorTotal
	 */
	public BigDecimal getValorTotal()
	{
		return valorTotal;
	}

	/**
	 * @param valorTotal the valorTotal to set
	 */
	public void setValorTotal(BigDecimal valorTotal)
	{
		this.valorTotal = valorTotal;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "C420 [organizacao=" + organizacao + ", participante=" + participante + ", modelo=" + modelo
				+ ", dataMovimento=" + dataMovimento + ", valorTotalNFe=" + valorTotalNFe + ", operacao=" + operacao
				+ ", emissao=" + emissao + ", modFrete=" + modFrete + ", satECF=" + satECF + ", quantidade="
				+ quantidade + ", valorTotal=" + valorTotal + "]";
	}
}
