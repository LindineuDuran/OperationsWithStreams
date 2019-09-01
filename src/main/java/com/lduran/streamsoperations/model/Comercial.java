package com.lduran.streamsoperations.model;

import java.math.BigDecimal;

public class Comercial
{
	private String organizacao = "";
	private String participante = "";
	private String transportador = "";
	private String idOperacao = "";
	private String status = "";
	private String modelo = "";
	private String situacao = "";
	private String vendedor = "";
	private String grupoProduto = "";
	private String tipoProduto = "";
	private String familiaProduto = "";
	private String codiMunicipio = "";
	private String cep = "";
	private String condicaoPgto = "";
	private String pedidoVenda = "";
	private String produto = "";
	private String CFOP = "";
	private String dataEmissao = "";
	private String dataMovimento = "";
	private BigDecimal valorTotalNFe = new BigDecimal(0);
	private String operacao = "";
	private String natOp = "";
	private String emissao = "";
	private String cEnq = "";
	private String cstIPI = "";
	private String cstICMS = "";
	private String cstCOFINS = "";
	private String cstPIS = "";
	private String modBC = "";
	private BigDecimal tributacaoTotal = new BigDecimal(0);
	private String pagamento = "";
	private String modFrete = "";
	private String sufixoCFOP = "";
	private String satECF = "";
	private String tipoDocumento = "";
	private String itemPedidoVenda = "";
	private Double quantidade = 0.0;
	private BigDecimal precoTabela = new BigDecimal(0);
	private BigDecimal totalTabela = new BigDecimal(0);
	private BigDecimal precoUnitario = new BigDecimal(0);
	private BigDecimal valorTotal = new BigDecimal(0);
	private Double percentualDesconto = 0.0;
	private BigDecimal desconto = new BigDecimal(0);
	private BigDecimal valorICMS = new BigDecimal(0);
	private BigDecimal valorIPI = new BigDecimal(0);
	private BigDecimal valorCOFINS = new BigDecimal(0);
	private BigDecimal valorPIS = new BigDecimal(0);
	private BigDecimal valorICMSST = new BigDecimal(0);
	private BigDecimal valorPISST = new BigDecimal(0);
	private BigDecimal valorCOFINSST = new BigDecimal(0);
	private BigDecimal baseICMS = new BigDecimal(0);
	private BigDecimal baseICMSST = new BigDecimal(0);
	private BigDecimal baseIPI = new BigDecimal(0);
	private BigDecimal baseCOFINS = new BigDecimal(0);
	private BigDecimal basePIS = new BigDecimal(0);
	private BigDecimal redBaseCalculo = new BigDecimal(0);
	private Double aliquotaICMS = 0.0;
	private Double aliquotaRedBC = 0.0;
	private Double aliquotaIPI = 0.0;
	private Double aliquotaCOFINS = 0.0;
	private Double aliquotaPIS = 0.0;
	private Double aliquotaICMSST = 0.0;
	private BigDecimal frete = new BigDecimal(0);
	private BigDecimal seguro = new BigDecimal(0);
	private BigDecimal outrasDespesas = new BigDecimal(0);
	private BigDecimal custo = new BigDecimal(0);

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
	 * @return the transportador
	 */
	public String getTransportador()
	{
		return transportador;
	}

	/**
	 * @param transportador the transportador to set
	 */
	public void setTransportador(String transportador)
	{
		this.transportador = transportador;
	}

	/**
	 * @return the idOperacao
	 */
	public String getIdOperacao()
	{
		return idOperacao;
	}

	/**
	 * @param idOperacao the idOperacao to set
	 */
	public void setIdOperacao(String idOperacao)
	{
		this.idOperacao = idOperacao;
	}

	/**
	 * @return the status
	 */
	public String getStatus()
	{
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status)
	{
		this.status = status;
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
	 * @return the situacao
	 */
	public String getSituacao()
	{
		return situacao;
	}

	/**
	 * @param situacao the situacao to set
	 */
	public void setSituacao(String situacao)
	{
		this.situacao = situacao;
	}

	/**
	 * @return the vendedor
	 */
	public String getVendedor()
	{
		return vendedor;
	}

	/**
	 * @param vendedor the vendedor to set
	 */
	public void setVendedor(String vendedor)
	{
		this.vendedor = vendedor;
	}

	/**
	 * @return the grupoProduto
	 */
	public String getGrupoProduto()
	{
		return grupoProduto;
	}

	/**
	 * @param grupoProduto the grupoProduto to set
	 */
	public void setGrupoProduto(String grupoProduto)
	{
		this.grupoProduto = grupoProduto;
	}

	/**
	 * @return the tipoProduto
	 */
	public String getTipoProduto()
	{
		return tipoProduto;
	}

	/**
	 * @param tipoProduto the tipoProduto to set
	 */
	public void setTipoProduto(String tipoProduto)
	{
		this.tipoProduto = tipoProduto;
	}

	/**
	 * @return the familiaProduto
	 */
	public String getFamiliaProduto()
	{
		return familiaProduto;
	}

	/**
	 * @param familiaProduto the familiaProduto to set
	 */
	public void setFamiliaProduto(String familiaProduto)
	{
		this.familiaProduto = familiaProduto;
	}

	/**
	 * @return the codiMunicipio
	 */
	public String getCodiMunicipio()
	{
		return codiMunicipio;
	}

	/**
	 * @param codiMunicipio the codiMunicipio to set
	 */
	public void setCodiMunicipio(String codiMunicipio)
	{
		this.codiMunicipio = codiMunicipio;
	}

	/**
	 * @return the cep
	 */
	public String getCep()
	{
		return cep;
	}

	/**
	 * @param cep the cep to set
	 */
	public void setCep(String cep)
	{
		this.cep = cep;
	}

	/**
	 * @return the condicaoPgto
	 */
	public String getCondicaoPgto()
	{
		return condicaoPgto;
	}

	/**
	 * @param condicaoPgto the condicaoPgto to set
	 */
	public void setCondicaoPgto(String condicaoPgto)
	{
		this.condicaoPgto = condicaoPgto;
	}

	/**
	 * @return the pedidoVenda
	 */
	public String getPedidoVenda()
	{
		return pedidoVenda;
	}

	/**
	 * @param pedidoVenda the pedidoVenda to set
	 */
	public void setPedidoVenda(String pedidoVenda)
	{
		this.pedidoVenda = pedidoVenda;
	}

	/**
	 * @return the produto
	 */
	public String getProduto()
	{
		return produto;
	}

	/**
	 * @param produto the produto to set
	 */
	public void setProduto(String produto)
	{
		this.produto = produto;
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
	 * @return the dataEmissao
	 */
	public String getDataEmissao()
	{
		return dataEmissao;
	}

	/**
	 * @param dataEmissao the dataEmissao to set
	 */
	public void setDataEmissao(String dataEmissao)
	{
		this.dataEmissao = dataEmissao;
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
	 * @return the natOp
	 */
	public String getNatOp()
	{
		return natOp;
	}

	/**
	 * @param natOp the natOp to set
	 */
	public void setNatOp(String natOp)
	{
		this.natOp = natOp;
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
	 * @return the cEnq
	 */
	public String getcEnq()
	{
		return cEnq;
	}

	/**
	 * @param cEnq the cEnq to set
	 */
	public void setcEnq(String cEnq)
	{
		this.cEnq = cEnq;
	}

	/**
	 * @return the cstIPI
	 */
	public String getCstIPI()
	{
		return cstIPI;
	}

	/**
	 * @param cstIPI the cstIPI to set
	 */
	public void setCstIPI(String cstIPI)
	{
		this.cstIPI = cstIPI;
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
	 * @return the cstCOFINS
	 */
	public String getCstCOFINS()
	{
		return cstCOFINS;
	}

	/**
	 * @param cstCOFINS the cstCOFINS to set
	 */
	public void setCstCOFINS(String cstCOFINS)
	{
		this.cstCOFINS = cstCOFINS;
	}

	/**
	 * @return the cstPIS
	 */
	public String getCstPIS()
	{
		return cstPIS;
	}

	/**
	 * @param cstPIS the cstPIS to set
	 */
	public void setCstPIS(String cstPIS)
	{
		this.cstPIS = cstPIS;
	}

	/**
	 * @return the modBC
	 */
	public String getModBC()
	{
		return modBC;
	}

	/**
	 * @param modBC the modBC to set
	 */
	public void setModBC(String modBC)
	{
		this.modBC = modBC;
	}

	/**
	 * @return the tributacaoTotal
	 */
	public BigDecimal getTributacaoTotal()
	{
		return tributacaoTotal;
	}

	/**
	 * @param tributacaoTotal the tributacaoTotal to set
	 */
	public void setTributacaoTotal(BigDecimal tributacaoTotal)
	{
		this.tributacaoTotal = tributacaoTotal;
	}

	/**
	 * @return the pagamento
	 */
	public String getPagamento()
	{
		return pagamento;
	}

	/**
	 * @param pagamento the pagamento to set
	 */
	public void setPagamento(String pagamento)
	{
		this.pagamento = pagamento;
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
	 * @return the tipoDocumento
	 */
	public String getTipoDocumento()
	{
		return tipoDocumento;
	}

	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(String tipoDocumento)
	{
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * @return the itemPedidoVenda
	 */
	public String getItemPedidoVenda()
	{
		return itemPedidoVenda;
	}

	/**
	 * @param itemPedidoVenda the itemPedidoVenda to set
	 */
	public void setItemPedidoVenda(String itemPedidoVenda)
	{
		this.itemPedidoVenda = itemPedidoVenda;
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
	 * @return the precoTabela
	 */
	public BigDecimal getPrecoTabela()
	{
		return precoTabela;
	}

	/**
	 * @param precoTabela the precoTabela to set
	 */
	public void setPrecoTabela(BigDecimal precoTabela)
	{
		this.precoTabela = precoTabela;
	}

	/**
	 * @return the totalTabela
	 */
	public BigDecimal getTotalTabela()
	{
		return totalTabela;
	}

	/**
	 * @param totalTabela the totalTabela to set
	 */
	public void setTotalTabela(BigDecimal totalTabela)
	{
		this.totalTabela = totalTabela;
	}

	/**
	 * @return the precoUnitario
	 */
	public BigDecimal getPrecoUnitario()
	{
		return precoUnitario;
	}

	/**
	 * @param precoUnitario the precoUnitario to set
	 */
	public void setPrecoUnitario(BigDecimal precoUnitario)
	{
		this.precoUnitario = precoUnitario;
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
	 * @return the percentualDesconto
	 */
	public Double getPercentualDesconto()
	{
		return percentualDesconto;
	}

	/**
	 * @param percentualDesconto the percentualDesconto to set
	 */
	public void setPercentualDesconto(Double percentualDesconto)
	{
		this.percentualDesconto = percentualDesconto;
	}

	/**
	 * @return the desconto
	 */
	public BigDecimal getDesconto()
	{
		return desconto;
	}

	/**
	 * @param desconto the desconto to set
	 */
	public void setDesconto(BigDecimal desconto)
	{
		this.desconto = desconto;
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
	 * @return the valorIPI
	 */
	public BigDecimal getValorIPI()
	{
		return valorIPI;
	}

	/**
	 * @param valorIPI the valorIPI to set
	 */
	public void setValorIPI(BigDecimal valorIPI)
	{
		this.valorIPI = valorIPI;
	}

	/**
	 * @return the valorCOFINS
	 */
	public BigDecimal getValorCOFINS()
	{
		return valorCOFINS;
	}

	/**
	 * @param valorCOFINS the valorCOFINS to set
	 */
	public void setValorCOFINS(BigDecimal valorCOFINS)
	{
		this.valorCOFINS = valorCOFINS;
	}

	/**
	 * @return the valorPIS
	 */
	public BigDecimal getValorPIS()
	{
		return valorPIS;
	}

	/**
	 * @param valorPIS the valorPIS to set
	 */
	public void setValorPIS(BigDecimal valorPIS)
	{
		this.valorPIS = valorPIS;
	}

	/**
	 * @return the valorICMSST
	 */
	public BigDecimal getValorICMSST()
	{
		return valorICMSST;
	}

	/**
	 * @param valorICMSST the valorICMSST to set
	 */
	public void setValorICMSST(BigDecimal valorICMSST)
	{
		this.valorICMSST = valorICMSST;
	}

	/**
	 * @return the valorPISST
	 */
	public BigDecimal getValorPISST()
	{
		return valorPISST;
	}

	/**
	 * @param valorPISST the valorPISST to set
	 */
	public void setValorPISST(BigDecimal valorPISST)
	{
		this.valorPISST = valorPISST;
	}

	/**
	 * @return the valorCOFINSST
	 */
	public BigDecimal getValorCOFINSST()
	{
		return valorCOFINSST;
	}

	/**
	 * @param valorCOFINSST the valorCOFINSST to set
	 */
	public void setValorCOFINSST(BigDecimal valorCOFINSST)
	{
		this.valorCOFINSST = valorCOFINSST;
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
	 * @return the baseICMSST
	 */
	public BigDecimal getBaseICMSST()
	{
		return baseICMSST;
	}

	/**
	 * @param baseICMSST the baseICMSST to set
	 */
	public void setBaseICMSST(BigDecimal baseICMSST)
	{
		this.baseICMSST = baseICMSST;
	}

	/**
	 * @return the baseIPI
	 */
	public BigDecimal getBaseIPI()
	{
		return baseIPI;
	}

	/**
	 * @param baseIPI the baseIPI to set
	 */
	public void setBaseIPI(BigDecimal baseIPI)
	{
		this.baseIPI = baseIPI;
	}

	/**
	 * @return the baseCOFINS
	 */
	public BigDecimal getBaseCOFINS()
	{
		return baseCOFINS;
	}

	/**
	 * @param baseCOFINS the baseCOFINS to set
	 */
	public void setBaseCOFINS(BigDecimal baseCOFINS)
	{
		this.baseCOFINS = baseCOFINS;
	}

	/**
	 * @return the basePIS
	 */
	public BigDecimal getBasePIS()
	{
		return basePIS;
	}

	/**
	 * @param basePIS the basePIS to set
	 */
	public void setBasePIS(BigDecimal basePIS)
	{
		this.basePIS = basePIS;
	}

	/**
	 * @return the redBaseCalculo
	 */
	public BigDecimal getRedBaseCalculo()
	{
		return redBaseCalculo;
	}

	/**
	 * @param redBaseCalculo the redBaseCalculo to set
	 */
	public void setRedBaseCalculo(BigDecimal redBaseCalculo)
	{
		this.redBaseCalculo = redBaseCalculo;
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

	/**
	 * @return the aliquotaRedBC
	 */
	public Double getAliquotaRedBC()
	{
		return aliquotaRedBC;
	}

	/**
	 * @param aliquotaRedBC the aliquotaRedBC to set
	 */
	public void setAliquotaRedBC(Double aliquotaRedBC)
	{
		this.aliquotaRedBC = aliquotaRedBC;
	}

	/**
	 * @return the aliquotaIPI
	 */
	public Double getAliquotaIPI()
	{
		return aliquotaIPI;
	}

	/**
	 * @param aliquotaIPI the aliquotaIPI to set
	 */
	public void setAliquotaIPI(Double aliquotaIPI)
	{
		this.aliquotaIPI = aliquotaIPI;
	}

	/**
	 * @return the aliquotaCOFINS
	 */
	public Double getAliquotaCOFINS()
	{
		return aliquotaCOFINS;
	}

	/**
	 * @param aliquotaCOFINS the aliquotaCOFINS to set
	 */
	public void setAliquotaCOFINS(Double aliquotaCOFINS)
	{
		this.aliquotaCOFINS = aliquotaCOFINS;
	}

	/**
	 * @return the aliquotaPIS
	 */
	public Double getAliquotaPIS()
	{
		return aliquotaPIS;
	}

	/**
	 * @param aliquotaPIS the aliquotaPIS to set
	 */
	public void setAliquotaPIS(Double aliquotaPIS)
	{
		this.aliquotaPIS = aliquotaPIS;
	}

	/**
	 * @return the aliquotaICMSST
	 */
	public Double getAliquotaICMSST()
	{
		return aliquotaICMSST;
	}

	/**
	 * @param aliquotaICMSST the aliquotaICMSST to set
	 */
	public void setAliquotaICMSST(Double aliquotaICMSST)
	{
		this.aliquotaICMSST = aliquotaICMSST;
	}

	/**
	 * @return the frete
	 */
	public BigDecimal getFrete()
	{
		return frete;
	}

	/**
	 * @param frete the frete to set
	 */
	public void setFrete(BigDecimal frete)
	{
		this.frete = frete;
	}

	/**
	 * @return the seguro
	 */
	public BigDecimal getSeguro()
	{
		return seguro;
	}

	/**
	 * @param seguro the seguro to set
	 */
	public void setSeguro(BigDecimal seguro)
	{
		this.seguro = seguro;
	}

	/**
	 * @return the outrasDespesas
	 */
	public BigDecimal getOutrasDespesas()
	{
		return outrasDespesas;
	}

	/**
	 * @param outrasDespesas the outrasDespesas to set
	 */
	public void setOutrasDespesas(BigDecimal outrasDespesas)
	{
		this.outrasDespesas = outrasDespesas;
	}

	/**
	 * @return the custo
	 */
	public BigDecimal getCusto()
	{
		return custo;
	}

	/**
	 * @param custo the custo to set
	 */
	public void setCusto(BigDecimal custo)
	{
		this.custo = custo;
	}

	@Override
	public String toString()
	{
		return "Comercial [organizacao=" + this.organizacao + ", participante=" + this.participante + ", transportador="
				+ this.transportador + ", idOperacao=" + this.idOperacao + ", status=" + this.status + ", modelo="
				+ this.modelo + ", situacao=" + this.situacao + ", vendedor=" + this.vendedor + ", grupoProduto="
				+ this.grupoProduto + ", tipoProduto=" + this.tipoProduto + ", familiaProduto=" + this.familiaProduto
				+ ", codiMunicipio=" + this.codiMunicipio + ", cep=" + this.cep + ", condicaoPgto=" + this.condicaoPgto
				+ ", pedidoVenda=" + this.pedidoVenda + ", produto=" + this.produto + ", CFOP=" + this.CFOP
				+ ", dataEmissao=" + this.dataEmissao + ", dataMovimento=" + this.dataMovimento + ", operacao="
				+ this.operacao + ", natOp=" + this.natOp + ", emissao=" + this.emissao + ", cEnq=" + this.cEnq
				+ ", cstIPI=" + this.cstIPI + ", cstICMS=" + this.cstICMS + ", cstCOFINS=" + this.cstCOFINS
				+ ", cstPIS=" + this.cstPIS + ", modBC=" + this.modBC + ", tributacaoTotal=" + this.tributacaoTotal
				+ ", pagamento=" + this.pagamento + ", modFrete=" + this.modFrete + ", sufixoCFOP=" + this.sufixoCFOP
				+ ", satECF=" + this.satECF + ", tipoDocumento=" + this.tipoDocumento + ", itemPedidoVenda="
				+ this.itemPedidoVenda + ", quantidade=" + this.quantidade + ", precoTabela=" + this.precoTabela
				+ ", totalTabela=" + this.totalTabela + ", precoUnitario=" + this.precoUnitario + ", valorTotal="
				+ this.valorTotal + ", percentualDesconto=" + this.percentualDesconto + ", desconto=" + this.desconto
				+ ", valorICMS=" + this.valorICMS + ", valorIPI=" + this.valorIPI + ", valorCOFINS=" + this.valorCOFINS
				+ ", valorPIS=" + this.valorPIS + ", valorICMSST=" + this.valorICMSST + ", valorPISST="
				+ this.valorPISST + ", valorCOFINSST=" + this.valorCOFINSST + ", baseICMS=" + this.baseICMS
				+ ", baseICMSST=" + this.baseICMSST + ", baseIPI=" + this.baseIPI + ", baseCOFINS=" + this.baseCOFINS
				+ ", basePIS=" + this.basePIS + ", redBaseCalculo=" + this.redBaseCalculo + ", aliquotaICMS="
				+ this.aliquotaICMS + ", aliquotaRedBC=" + this.aliquotaRedBC + ", aliquotaIPI=" + this.aliquotaIPI
				+ ", aliquotaCOFINS=" + this.aliquotaCOFINS + ", aliquotaPIS=" + this.aliquotaPIS + ", aliquotaICMSST="
				+ this.aliquotaICMSST + ", frete=" + this.frete + ", seguro=" + this.seguro + ", outrasDespesas="
				+ this.outrasDespesas + ", custo=" + this.custo + "]";
	}
}
