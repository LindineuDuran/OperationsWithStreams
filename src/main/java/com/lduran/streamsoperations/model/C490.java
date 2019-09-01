package com.lduran.streamsoperations.model;

import java.math.BigDecimal;

public class C490
{
	private String organizacao = "";
	private String participante = "";
	private String modelo = "";
	private String CFOP = "";
	private String dataMovimento = "";
	private BigDecimal valorTotalNFe = new BigDecimal(0);
	private String operacao = "";
	private String emissao = "";
	private String cstICMS = "";
	private String modFrete = "";
	private String sufixoCFOP = "";
	private String satECF = "";
	private Double quantidade = 0.0;
	private BigDecimal valorTotal = new BigDecimal(0);
	private BigDecimal valorICMS = new BigDecimal(0);
	private BigDecimal baseICMS = new BigDecimal(0);
	private Double aliquotaICMS = 0.0;

	/**
	 *
	 */
	public C490()
	{
	}

	/**
	 * @param organizacao
	 * @param participante
	 * @param modelo
	 * @param cFOP
	 * @param dataMovimento
	 * @param valorTotalNFe
	 * @param operacao
	 * @param emissao
	 * @param cstICMS
	 * @param modFrete
	 * @param sufixoCFOP
	 * @param satECF
	 * @param quantidade
	 * @param valorTotal
	 * @param valorICMS
	 * @param baseICMS
	 * @param aliquotaICMS
	 */
	public C490(String organizacao, String participante, String modelo, String cFOP, String dataMovimento,
			BigDecimal valorTotalNFe, String operacao, String emissao, String cstICMS, String modFrete,
			String sufixoCFOP, String satECF, Double quantidade, BigDecimal valorTotal, BigDecimal valorICMS,
			BigDecimal baseICMS, Double aliquotaICMS)
	{
		this.organizacao = organizacao;
		this.participante = participante;
		this.modelo = modelo;
		CFOP = cFOP;
		this.dataMovimento = dataMovimento;
		this.valorTotalNFe = valorTotalNFe;
		this.operacao = operacao;
		this.emissao = emissao;
		this.cstICMS = cstICMS;
		this.modFrete = modFrete;
		this.sufixoCFOP = sufixoCFOP;
		this.satECF = satECF;
		this.quantidade = quantidade;
		this.valorTotal = valorTotal;
		this.valorICMS = valorICMS;
		this.baseICMS = baseICMS;
		this.aliquotaICMS = aliquotaICMS;
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
	 * @return the cFOP
	 */
	public String getCFOP()
	{
		return CFOP;
	}

	/**
	 * @param cFOP the cFOP to set
	 */
	public void setCFOP(String cFOP)
	{
		CFOP = cFOP;
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
	 * @return the cstICMS
	 */
	public String getCstICMS()
	{
		return cstICMS;
	}

	/**
	 * @param cstICMS the cstICMS to set
	 */
	public void setCstICMS(String cstICMS)
	{
		this.cstICMS = cstICMS;
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
	 * @return the sufixoCFOP
	 */
	public String getSufixoCFOP()
	{
		return sufixoCFOP;
	}

	/**
	 * @param sufixoCFOP the sufixoCFOP to set
	 */
	public void setSufixoCFOP(String sufixoCFOP)
	{
		this.sufixoCFOP = sufixoCFOP;
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

	/**
	 * @return the valorICMS
	 */
	public BigDecimal getValorICMS()
	{
		return valorICMS;
	}

	/**
	 * @param valorICMS the valorICMS to set
	 */
	public void setValorICMS(BigDecimal valorICMS)
	{
		this.valorICMS = valorICMS;
	}

	/**
	 * @return the baseICMS
	 */
	public BigDecimal getBaseICMS()
	{
		return baseICMS;
	}

	/**
	 * @param baseICMS the baseICMS to set
	 */
	public void setBaseICMS(BigDecimal baseICMS)
	{
		this.baseICMS = baseICMS;
	}

	/**
	 * @return the aliquotaICMS
	 */
	public Double getAliquotaICMS()
	{
		return aliquotaICMS;
	}

	/**
	 * @param aliquotaICMS the aliquotaICMS to set
	 */
	public void setAliquotaICMS(Double aliquotaICMS)
	{
		this.aliquotaICMS = aliquotaICMS;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "C490 [organizacao=" + organizacao + ", participante=" + participante + ", modelo=" + modelo + ", CFOP="
				+ CFOP + ", dataMovimento=" + dataMovimento + ", valorTotalNFe=" + valorTotalNFe + ", operacao="
				+ operacao + ", emissao=" + emissao + ", cstICMS=" + cstICMS + ", modFrete=" + modFrete
				+ ", sufixoCFOP=" + sufixoCFOP + ", satECF=" + satECF + ", quantidade=" + quantidade + ", valorTotal="
				+ valorTotal + ", valorICMS=" + valorICMS + ", baseICMS=" + baseICMS + ", aliquotaICMS=" + aliquotaICMS
				+ "]";
	}
}
