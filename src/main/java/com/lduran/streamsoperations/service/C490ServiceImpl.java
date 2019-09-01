package com.lduran.streamsoperations.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lduran.streamsoperations.model.C490;
import com.lduran.streamsoperations.util.ToolsFactory;

@Service
public class C490ServiceImpl implements C490Service
{

	@Override
	/**
	 * Gera a lista de Objetos para a lista<String> fornecida
	 *
	 * @param fileContent
	 * @return
	 */
	public List<C490> getObjectList(List<String> fileContent)
	{
		List<C490> objectList = new ArrayList<>();

		for (String linha : fileContent)
		{
			C490 c490 = new C490();

			if (!linha.contains("IdOrganizacao"))
			{
				String[] item = linha.replace(",", ".").split(";");

				if ((item.length > 0) && (item[0] != null))
				{
					c490.setOrganizacao(item[0]);
				}
				if ((item.length > 1) && (item[1] != null))
				{
					c490.setParticipante(item[1]);
				}
				if ((item.length > 2) && (item[2] != null))
				{
					c490.setCFOP(item[2]);
				}
				if ((item.length > 3) && (item[3] != null))
				{
					c490.setModelo(item[3]);
				}
				if ((item.length > 4) && (item[4] != null))
				{
					c490.setDataMovimento(item[4]);
				}
				if ((item.length > 5) && (item[5] != null) && (ToolsFactory.getInstance().isNumeric(item[5])))
				{
					c490.setValorTotalNFe(
							new BigDecimal(Double.parseDouble(item[5])).setScale(2, BigDecimal.ROUND_HALF_UP));
				}
				if ((item.length > 6) && (item[6] != null))
				{
					c490.setOperacao(item[6]);
				}
				if ((item.length > 7) && (item[7] != null))
				{
					c490.setEmissao(item[7]);
				}
				if ((item.length > 8) && (item[8] != null))
				{
					c490.setCstICMS(item[8]);
				}
				if ((item.length > 9) && (item[9] != null) && (ToolsFactory.getInstance().isNumeric(item[9])))
				{
					c490.setAliquotaICMS(Double.parseDouble(item[9]));
				}
				if ((item.length > 10) && (item[10] != null))
				{
					c490.setModFrete(item[10]);
				}
				if ((item.length > 11) && (item[11] != null))
				{
					c490.setSufixoCFOP(item[11]);
				}
				if ((item.length > 12) && (item[12] != null))
				{
					c490.setSatECF(item[12]);
				}
				if ((item.length > 13) && (item[13] != null) && (ToolsFactory.getInstance().isNumeric(item[13])))
				{
					c490.setQuantidade(Double.parseDouble(item[13]));
				}
				if ((item.length > 14) && (item[14] != null) && (ToolsFactory.getInstance().isNumeric(item[14])))
				{
					c490.setValorTotal(
							new BigDecimal(Double.parseDouble(item[14])).setScale(2, BigDecimal.ROUND_HALF_UP));
				}
				if ((item.length > 15) && (item[15] != null) && (ToolsFactory.getInstance().isNumeric(item[15])))
				{
					c490.setValorICMS(
							new BigDecimal(Double.parseDouble(item[15])).setScale(2, BigDecimal.ROUND_HALF_UP));
				}
				if ((item.length > 16) && (item[16] != null) && (ToolsFactory.getInstance().isNumeric(item[16])))
				{
					c490.setBaseICMS(
							new BigDecimal(Double.parseDouble(item[16])).setScale(2, BigDecimal.ROUND_HALF_UP));
				}

				objectList.add(c490);
			}
		}

		return objectList;
	}

}
