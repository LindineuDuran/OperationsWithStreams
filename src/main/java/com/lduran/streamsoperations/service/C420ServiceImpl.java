package com.lduran.streamsoperations.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.lduran.streamsoperations.model.C420;
import com.lduran.streamsoperations.util.ToolsFactory;

@Service
public class C420ServiceImpl implements C420Service
{
	/**
	 * Make a List<C420> from a List<String>
	 *
	 * @param fileContent
	 * @return
	 */
	public C420 tupleC420(String linha)
	{
		C420 c420 = new C420();

		String[] item = linha.replace(",", ".").split(";");

		if ((item.length > 0) && (item[0] != null)) {c420.setOrganizacao(item[0]);}
		if ((item.length > 1) && (item[1] != null)) {c420.setParticipante(item[1]);}
		if ((item.length > 2) && (item[2] != null)) {c420.setModelo(item[2]);}
		if ((item.length > 3) && (item[3] != null)) {c420.setDataMovimento(item[3]);}
		if ((item.length > 4) && (item[4] != null) && (ToolsFactory.getInstance().isNumeric(item[4]))) {c420.setValorTotalNFe( new BigDecimal(Double.parseDouble(item[4])).setScale(2, BigDecimal.ROUND_HALF_UP));}
		if ((item.length > 5) && (item[5] != null)) {c420.setOperacao(item[5]);}
		if ((item.length > 6) && (item[6] != null)) {c420.setEmissao(item[6]);}
		if ((item.length > 7) && (item[7] != null)) {c420.setModFrete(item[7]);}
		if ((item.length > 8) && (item[8] != null)) {c420.setSatECF(item[8]);}
		if ((item.length > 9) && (item[9] != null) && (ToolsFactory.getInstance().isNumeric(item[9]))) {c420.setQuantidade(Double.parseDouble(item[9]));}
		if ((item.length > 10) && (item[10] != null) && (ToolsFactory.getInstance().isNumeric(item[10]))) {c420.setValorTotal( new BigDecimal(Double.parseDouble(item[10])).setScale(2, BigDecimal.ROUND_HALF_UP));}

		return c420;
	}

	@Override
	/**
	 * Make a List<C420> from a List<String>
	 *
	 * @param fileContent
	 * @return
	 */
	public List<C420> getObjectList(List<String> fileContent)
	{
		List<C420> objectList = fileContent.stream().map(s -> this.tupleC420(s)).collect(Collectors.toList());
		return objectList;
	}
}
