package com.lduran.streamsoperations.service;

import java.text.NumberFormat;

import org.springframework.stereotype.Service;

import com.lduran.streamsoperations.model.Comercial;

@Service
public class ComercialServiceImpl implements ComercialService
{

	@Override
	public String getObjectHeader()
	{
		return "IdOrganizacao;IdParticipante;IdCfop;IdModelo;IdSituacao;DataDoMovimento;TotalDoDocumentoFiscal;Operacao;"
				+ "Emissao;CstICMS;AliquotaIcms;TipoDoFrete;SufixoDoCFOP;NumeroSatEcf;QuantidadeDeDocumentos;TotalDoItem;"
				+ "ValorDesconto;ValorIcms;ValorIpi;ValorPis;ValorCofins;ValorIcmsSt;ValorPisSt;ValorCofinsSt;BaseDeCalculoIcms;"
				+ "BaseDeCalculoIcmsSt;ValorDaReducaoDaBaseDeCalculo;ValorFrete;ValorSeguro;ValorOutrasDespesasAcessorias";
	}

	@Override
	public String getObjectContent(Comercial com)
	{
		NumberFormat formatadorNumerico = NumberFormat.getNumberInstance();

		// Locale eua = Locale.US;
		// NumberFormat formatadorNumerico = NumberFormat.getNumberInstance(eua);

		return com.getOrganizacao() + ";" + com.getParticipante() + ";" + com.getCFOP() + ";" + com.getModelo() + ";"
		+ com.getSituacao() + ";" + com.getDataMovimento() + ";"
		+ formatadorNumerico.format(com.getValorTotalNFe()) + ";" + com.getOperacao() + ";" + com.getEmissao()
		+ ";" + com.getCstICMS() + ";" + formatadorNumerico.format(com.getAliquotaICMS()) + ";"
		+ com.getModFrete() + ";" + com.getSufixoCFOP() + ";" + com.getSatECF() + ";" + 1 + ";"
		+ formatadorNumerico.format(com.getValorTotal()) + ";" + formatadorNumerico.format(com.getDesconto())
		+ ";" + formatadorNumerico.format(com.getValorICMS()) + ";"
		+ formatadorNumerico.format(com.getValorIPI()) + ";" + formatadorNumerico.format(com.getValorPIS())
		+ ";" + formatadorNumerico.format(com.getValorCOFINS()) + ";"
		+ formatadorNumerico.format(com.getValorICMSST()) + ";" + formatadorNumerico.format(com.getValorPISST())
		+ ";" + formatadorNumerico.format(com.getValorCOFINSST()) + ";"
		+ formatadorNumerico.format(com.getBaseICMS()) + ";" + formatadorNumerico.format(com.getBaseICMSST())
		+ ";" + formatadorNumerico.format(com.getRedBaseCalculo()) + ";"
		+ formatadorNumerico.format(com.getFrete()) + ";" + formatadorNumerico.format(com.getSeguro()) + ";"
		+ formatadorNumerico.format(com.getOutrasDespesas());
	}

}
