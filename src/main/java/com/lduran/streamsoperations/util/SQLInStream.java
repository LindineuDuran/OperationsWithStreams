package com.lduran.streamsoperations.util;

import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

import org.jooq.lambda.Seq;
import org.jooq.lambda.tuple.Tuple;
import org.jooq.lambda.tuple.Tuple10;
import org.springframework.stereotype.Component;

import com.lduran.streamsoperations.model.*;

@Component("sql")
public class SQLInStream
{
	/**
	 * returns the result of selectJson(List<C420>)
	 *
	 * @param c420
	 * @return
	 */
	private String tupleJSON(C420 c420)
	{
		NumberFormat formatadorDecimal = NumberFormat.getNumberInstance();

		return "C420 [organizacao=" + c420.getOrganizacao() + ", participante=" + c420.getParticipante() + ", modelo="
				+ c420.getModelo() + ", dataMovimento=" + c420.getDataMovimento() + ", valorTotalNFe="
				+ formatadorDecimal.format(c420.getValorTotalNFe()) + ", operacao=" + c420.getOperacao() + ", emissao="
				+ c420.getEmissao() + ", modFrete=" + c420.getModFrete() + ", satECF=" + c420.getSatECF()
				+ ", quantidade=" + c420.getQuantidade() + ", valorTotal="
				+ formatadorDecimal.format(c420.getValorTotal()) + "]";
	}

	/**
	 * Example of Select in Stream () Generating Output in JSON. It receives a
	 * List<C420>
	 */
	public List<String> selectJson(List<C420> objectListC420)
	{
		List<String> listagem = objectListC420.stream().map(s -> this.tupleJSON(s)).collect(Collectors.toList());
		return listagem;
	}

	/**
	 * returns the result of selectCsv(List<C420>)
	 *
	 * @param c420
	 * @return
	 */
	private String tupleCSV(C420 c420)
	{
		NumberFormat formatadorDecimal = NumberFormat.getNumberInstance();

		return c420.getOrganizacao() + ";" + c420.getParticipante() + ";" + c420.getModelo() + ";"
				+ c420.getDataMovimento() + ";" + formatadorDecimal.format(c420.getValorTotalNFe()) + ";"
				+ c420.getOperacao() + ";" + c420.getEmissao() + ";" + c420.getModFrete() + ";" + c420.getSatECF() + ";"
				+ c420.getQuantidade() + ";" + formatadorDecimal.format(c420.getValorTotal());
	}

	/**
	 * Example of Select in Stream () Generating Output in CSV. It receives a
	 * List<C420>
	 */
	public List<String> selectCsv(List<C420> objectListC420)
	{
		List<String> listagem = objectListC420.stream().map(s -> this.tupleCSV(s)).collect(Collectors.toList());
		return listagem;
	}

	/**
	 * returns the result of selectCsv(List<C490>)
	 *
	 * @param c420
	 * @return
	 */
	private String tupleCSV(C490 c490)
	{
		NumberFormat formatadorDecimal = NumberFormat.getNumberInstance();

		return c490.getOrganizacao() + ";" + c490.getParticipante() + ";" + c490.getModelo() + ";"
				+ c490.getDataMovimento() + ";" + formatadorDecimal.format(c490.getValorTotalNFe()) + ";"
				+ c490.getOperacao() + ";" + c490.getEmissao() + ";" + c490.getModFrete() + ";" + c490.getSatECF() + ";"
				+ c490.getQuantidade() + ";" + formatadorDecimal.format(c490.getValorTotal()) + ";" + c490.getCstICMS()
				+ ";" + c490.getCFOP() + ";" + c490.getSufixoCFOP() + ";" + c490.getAliquotaICMS() + ";"
				+ c490.getBaseICMS() + ";" + formatadorDecimal.format(c490.getValorICMS());
	}

	/**
	 * Example of Select in Stream () Generating Output in CSV. It receives a
	 * List<C490>
	 */
	public List<String> selectCsvC490(List<C490> objectListC490)
	{
		List<String> listagem = objectListC490.stream().map(s -> this.tupleCSV(s)).collect(Collectors.toList());
		return listagem;
	}

	/**
	 * returns the result of selectJSON(List<C490>)
	 *
	 * @param c490
	 * @return
	 */
	private String tupleJSON(C490 c490)
	{
		NumberFormat formatadorDecimal = NumberFormat.getNumberInstance();

		return "C490 [organizacao=" + c490.getOrganizacao() + ", participante=" + c490.getParticipante() + ", modelo="
				+ c490.getModelo() + ", dataMovimento=" + c490.getDataMovimento() + ", valorTotalNFe="
				+ formatadorDecimal.format(c490.getValorTotalNFe()) + ", operacao=" + c490.getOperacao() + ", emissao="
				+ c490.getEmissao() + ", modFrete=" + c490.getModFrete() + ", satECF=" + c490.getSatECF()
				+ ", quantidade=" + c490.getQuantidade() + ", valorTotal="
				+ formatadorDecimal.format(c490.getValorTotal()) + "]";
	}

	/**
	 * Example of Where in Stream () Generating Output in CSV. It receives a
	 * List<C420>
	 *
	 * @param objectListC420
	 * @return
	 */
	public List<String> whereCSV(List<C420> objectListC420)
	{
		List<String> listagem = objectListC420.stream()
				.filter(v -> v.getDataMovimento().contentEquals("24012018")
						&& v.getValorTotalNFe().toString().contentEquals("1927.00")
						&& v.getValorTotal().toString().equals("18.00"))
				.map(s -> this.tupleCSV(s)).collect(Collectors.toList());
		return listagem;
	}

	/**
	 * Example of Where in Stream () Generating Output in CSV. It receives a
	 * List<C490>
	 *
	 * @param objectListC490
	 * @return
	 */
	public List<String> whereCSV_C490(List<C490> objectListC490)
	{
		List<String> listagem = objectListC490.stream()
				.filter(v -> v.getDataMovimento().contentEquals("3012018")
						&& v.getValorTotalNFe().toString().contentEquals("1685.40")
						&& v.getValorTotal().toString().equals("663.90"))
				.map(s -> this.tupleCSV(s)).collect(Collectors.toList());
		return listagem;
	}

	/**
	 * returns the result of leftOuterJoinRetornaStrings(List<C420>, List<C490>)
	 *
	 * @param c420
	 * @param c490
	 * @return
	 */
	private String tupleRetornaString(C420 c420, C490 c490)
	{
		C420 c420Temp = new C420();
		if (c420 != null)
		{
			c420Temp = c420;
		}

		C490 c490Temp = new C490();
		if (c490 != null)
		{
			c490Temp = c490;
		}

		NumberFormat formatadorDecimal = NumberFormat.getNumberInstance();

		return c420Temp.getOrganizacao() + ";" + c420Temp.getParticipante() + ";" + c420Temp.getDataMovimento() + ";"
				+ c490Temp.getDataMovimento() + ";" + formatadorDecimal.format(c420Temp.getValorTotalNFe()) + ";"
				+ formatadorDecimal.format(c490Temp.getValorTotalNFe()) + ";" + c420Temp.getOperacao() + ";"
				+ c420Temp.getEmissao() + ";" + c420Temp.getModFrete() + ";" + c420Temp.getSatECF() + ";"
				+ c420Temp.getQuantidade() + ";" + formatadorDecimal.format(c420Temp.getValorTotal()) + ";"
				+ formatadorDecimal.format(c490Temp.getValorTotal()) + ";" + c490Temp.getCstICMS() + ";"
				+ c490Temp.getCFOP() + ";" + c490Temp.getSufixoCFOP() + ";" + c490Temp.getAliquotaICMS() + ";"
				+ c490Temp.getBaseICMS() + ";" + formatadorDecimal.format(c490Temp.getValorICMS());
	}

	/**
	 * Example of Left Outer Join using 2 streams() generating Output in CSV
	 *
	 * @param objectListC420
	 * @param objectListC490
	 * @return
	 */
	public List<String> leftOuterJoinRetornaString(List<C420> objectListC420, List<C490> objectListC490)
	{
		List<String> listagem = Seq.seq(objectListC420)
				.flatMap(v1 -> Seq.seq(objectListC490)
						.filter(v2 -> Objects.equals(v1.getDataMovimento(), v2.getDataMovimento())
								&& Objects.equals(v1.getValorTotal(), v2.getValorTotal())
								&& Objects.equals(v1.getValorTotalNFe(), v2.getValorTotalNFe()))
						.onEmpty(null).map(v2 -> this.tupleRetornaString(v1, v2)))
				.collect(Collectors.toList());

		// Inclui cabeçalho na lista
		String cabecalho = "organizaca;participante;dataMovimentoC420;dataMovimentoC490;valorTotalNFeC420;valorTotalNFeC490;operacao;emissao;modFrete;satECF;quantidade;valorTotalC420;valorTotalC490;cstICMS;CFOP;sufixoCFOP;aliquotaICMS;baseICMS;valorICMS";
		listagem.add(0, cabecalho);

		return listagem;
	}

	/**
	 * returns the result of leftOuterJoinRetornaComercial()
	 *
	 * @param c420
	 * @param c490
	 * @return
	 */
	private Comercial tupleRetornaComercial(C420 c420, C490 c490)
	{
		C420 c420Temp = new C420();
		if (c420 != null)
		{
			c420Temp = c420;
		}

		C490 c490Temp = new C490();
		if (c490 != null)
		{
			c490Temp = c490;
		}

		Comercial com = new Comercial();

		com.setOrganizacao(c420Temp.getOrganizacao());
		com.setParticipante(c420Temp.getParticipante());
		com.setCFOP(c490Temp.getCFOP());
		com.setDataMovimento(c420Temp.getDataMovimento());
		com.setValorTotalNFe(c420Temp.getValorTotalNFe().doubleValue());
		com.setOperacao(c420Temp.getOperacao());
		com.setEmissao(c420Temp.getEmissao());
		com.setCstICMS(c490Temp.getCstICMS());
		com.setModFrete(c420Temp.getModFrete());
		com.setSufixoCFOP(c490Temp.getSufixoCFOP());
		com.setSatECF(c420Temp.getSatECF());
		com.setQuantidade(c420Temp.getQuantidade());
		com.setValorTotal(c420Temp.getValorTotal().doubleValue());
		com.setValorICMS(c490Temp.getValorICMS().doubleValue());
		com.setBaseICMS(c490Temp.getBaseICMS().doubleValue());
		com.setAliquotaICMS(c490Temp.getAliquotaICMS());

		return com;
	}

	/**
	 * Example of Left Outer Join using 2 streams() generating Output in
	 * List<Comercial>
	 *
	 * @param objectListC420
	 * @param objectListC490
	 * @return
	 */
	public List<Comercial> leftOuterJoinRetornaComercial(List<C420> objectListC420, List<C490> objectListC490)
	{
		List<Comercial> listagem = Seq.seq(objectListC420)
				.flatMap(v1 -> Seq.seq(objectListC490)
						.filter(v2 -> Objects.equals(v1.getDataMovimento(), v2.getDataMovimento())
								&& Objects.equals(v1.getValorTotal(), v2.getValorTotal())
								&& Objects.equals(v1.getValorTotalNFe(), v2.getValorTotalNFe()))
						.onEmpty(null).map(v2 -> this.tupleRetornaComercial(v1, v2)))
				.collect(Collectors.toList());

		return listagem;
	}

	public List<Comercial> leftOuterJoinJooqRetornaString(List<C420> objectListC420, List<C490> objectListC490)
	{
		Seq<C420> s1 = Seq.seq(objectListC420);
		Seq<C490> s2 = Seq.seq(objectListC490);

		List<Comercial> listagem = s1
				.leftOuterJoin(s2,
						(t, u) -> Objects.equals(t.getDataMovimento(), u.getDataMovimento())
								&& Objects.equals(t.getValorTotal(), u.getValorTotal())
								&& Objects.equals(t.getValorTotalNFe(), u.getValorTotalNFe()))
				.map(t -> this.tupleRetornaComercial(t.v1, t.v2)).toList();

		return listagem;
	}

	/**
	 * Example of Aggregation of the Quantity Column, of type Double, in the
	 * Organization Column
	 *
	 * @param lstComercial
	 * @return
	 */
	public Map<String, Double> totalQuantidadeForOrganizacao(List<Comercial> lstComercial)
	{
		return lstComercial.stream().collect(
				Collectors.groupingBy(Comercial::getOrganizacao, Collectors.summingDouble(Comercial::getQuantidade)));
	}

	/**
	 * Example of Aggregating a BigDecimal Column into Two Columns
	 *
	 * @param lstComercial
	 * @return
	 */
	public List<ComercGroupBy> totalValorForOrgaAndDatMov(List<Comercial> lstComercial)
	{
		List<ComercGroupBy> listagem = lstComercial.stream()
				.collect(Collectors.groupingBy(Comercial::getOrganizacao,
						Collectors.groupingBy(Comercial::getDataMovimento,
								Collectors.summingDouble(Comercial::getValorTotal))))
				.entrySet().stream()
				.flatMap(e1 -> e1.getValue().entrySet().stream()
						.map(e2 -> new ComercGroupBy(e1.getKey(), e2.getKey(), e2.getValue())))
				.collect(Collectors.toList());

		return listagem;
	}

	/**
	 * Tupla das colunas do GroupBy
	 *
	 * @param organizacao
	 * @param participante
	 * @param CFOP
	 * @param modelo
	 * @param situacao
	 * @param dataMovimento
	 * @param operacao
	 * @param emissao
	 * @param cstICMS
	 * @param aliquotaICMS
	 * @param modFrete
	 * @param satECF
	 * @return
	 */
	private Object tupleBigger(String organizacao, String participante, String CFOP, String modelo, String situacao,
			String dataMovimento, String operacao, String emissao, String cstICMS, Double aliquotaICMS, String modFrete,
			String satECF)
	{
		return organizacao + ";" + participante + ";" + CFOP + ";" + modelo + ";" + situacao + ";" + dataMovimento + ";"
				+ operacao + ";" + emissao + ";" + cstICMS + ";" + aliquotaICMS + ";" + modFrete + ";" + satECF;
	}

	/**
	 * Multiple Column Aggregation with Double Values
	 *
	 * @param lstComercial
	 * @return
	 */
	public List<String> MultiColumnAgregation(List<Comercial> lstComercial)
	{
		Map<Object, Tuple10<Double, Double, Double, Double, Double, Double, Double, Double, Double, Double>> map =

				// Seq is like a Stream, but sequential only, and with more features
				Seq.seq(lstComercial)

						// Seq.groupBy() is just short for Stream.collect(Collectors.groupingBy(...))
						.groupBy(a -> this.tupleBigger(a.getOrganizacao(), a.getParticipante(), a.getCFOP(),
								a.getModelo(), a.getSituacao(), a.getDataMovimento(), a.getOperacao(), a.getEmissao(),
								a.getCstICMS(), a.getAliquotaICMS(), a.getModFrete(), a.getSatECF()),

								// ... because once you have tuples, why not add tuple-collectors?
								Tuple.collectors(Collectors.summingDouble(Comercial::getValorTotal),
										Collectors.summingDouble(Comercial::getDesconto),
										Collectors.summingDouble(Comercial::getValorICMS),
										Collectors.summingDouble(Comercial::getValorIPI),
										Collectors.summingDouble(Comercial::getValorPIS),
										Collectors.summingDouble(Comercial::getValorCOFINS),
										Collectors.summingDouble(Comercial::getValorICMSST),
										Collectors.summingDouble(Comercial::getValorPISST),
										Collectors.summingDouble(Comercial::getValorCOFINSST),
										Collectors.summingDouble(Comercial::getBaseICMS)));

		List<String> lstResult = map.entrySet().stream().map(m -> m.getKey() + ";" + m.getValue())
				.collect(Collectors.toList());
		lstResult = lstResult.stream().map(line -> line.replaceAll(", ", ";")).collect(Collectors.toList());
		lstResult = lstResult.stream().map(line -> line.replaceAll("\\(", "")).collect(Collectors.toList());
		lstResult = lstResult.stream().map(line -> line.replaceAll("\\)", "")).collect(Collectors.toList());
		lstResult.add(0,
				"IdOrganizacao;IdParticipante;IdCfop;IdModelo;IdSituacao;DataDoMovimento;Operacao;Emissao;CstICMS;AliquotaIcms;TipoDoFrete;NumeroSatEcf;TotalDoItem;ValorDesconto;ValorICMS;ValorIPI;ValorPIS;ValorCOFINS;ValorICMSSt;ValorPISSt;ValorCOFINSSt;BaseDeCalculoICMS;BaseDeCalculoICMSST;ValorDaReducaoDaBaseDeCalculo;ValorFrete;ValorSeguro;ValorOutrasDespesasAcessorias");

		return lstResult;
	}
}
