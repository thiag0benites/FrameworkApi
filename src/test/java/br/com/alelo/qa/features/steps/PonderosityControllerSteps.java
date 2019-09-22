package br.com.alelo.qa.features.steps;

import br.com.alelo.qa.web.actions.PonderosityControllerActions;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class PonderosityControllerSteps {
	
	protected String cenario;
	protected String cenarioVstsId;
	PonderosityControllerActions parametrizar;
	
	@Before
	public void iniciaCenario(Scenario scenario) {
		cenario = scenario.getName().toString();
		cenarioVstsId = scenario.getName().substring(0, scenario.getName().indexOf(":"));
//		parametrizar = new PonderosityControllerActions(cenarioVstsId);
	}
	
	@Dado("^que para a combinacão Tipo de Score, Canal e Produto ainda não exista parametrizacão de peso$")
	public void que_para_a_combinacão_Tipo_de_Score_Canal_e_Produto_ainda_não_exista_parametrizacão_de_peso() throws Throwable {
		System.out.println("Dado que para a combinacão Tipo de Score, Canal e Produto ainda não exista parametrizacão de peso");
	}

	@Dado("^o campo Status na requisicão for \"([^\"]*)\"$")
	public void o_campo_Status_na_requisicão_for(String status) throws Throwable {
		System.out.println("E o campo Status na requisicão for " + status);
	}

	@Dado("^que para a combinacão Tipo de Score, Canal e Produto já exista parametrizacão de peso$")
	public void que_para_a_combinacão_Tipo_de_Score_Canal_e_Produto_já_exista_parametrizacão_de_peso() throws Throwable {
		System.out.println("Dado que para a combinacão Tipo de Score, Canal e Produto já exista parametrizacão de peso");
	}

	@Dado("^que para a combinacão Tipo, Canal e Produto ainda não exista parametrizacão de peso$")
	public void que_para_a_combinacão_Tipo_Canal_e_Produto_ainda_não_exista_parametrizacão_de_peso() throws Throwable {
		System.out.println("Dado que para a combinacão Tipo, Canal e Produto ainda não exista parametrizacão de peso");
	}

	@Dado("^o peso preenchido é maior que (\\d+)$")
	public void o_peso_preenchido_é_maior_que(int peso) throws Throwable {
		System.out.println("Dado o peso preenchido é maior que " + peso);
	}
	
	@Dado("^o indicador de impeditivo está marcado com Sim$")
	public void o_indicador_de_impeditivo_está_marcado_com_Sim() throws Throwable {
		System.out.println("E o indicador de impeditivo está marcado com Sim");
	}
	
	@Dado("^o tipo de score não exista$")
	public void o_tipo_de_score_não_exista() throws Throwable {
		System.out.println("Mas o tipo de score não exista");
	}

	@Dado("^o canal não exista$")
	public void o_canal_não_exista() throws Throwable {
		System.out.println("Mas o canal não exista");
	}

	@Dado("^o produto não exista$")
	public void o_produto_não_exista() throws Throwable {
		System.out.println("Mas o produto não exista");
	}
	
	@Dado("^que na consulta de listagem apenas o Tipo de Score foi preenchido$")
	public void que_na_consulta_de_listagem_apenas_o_Tipo_de_Score_foi_preenchido() throws Throwable {
		System.out.println("Dado que na consulta de listagem apenas o Tipo de Score foi preenchido");
	}

	@Dado("^que na consulta de listagem apenas o Canal foi preenchido$")
	public void que_na_consulta_de_listagem_apenas_o_Canal_foi_preenchido() throws Throwable {
		System.out.println("Dado que na consulta de listagem apenas o Canal foi preenchido");
	}

	@Dado("^que na consulta de listagem apenas o Produto foi preenchido$")
	public void que_na_consulta_de_listagem_apenas_o_Produto_foi_preenchido() throws Throwable {
		System.out.println("Dado que na consulta de listagem apenas o Produto foi preenchido");
	}

	@Dado("^que na consulta de listagem todos os parametros foram preenchidos$")
	public void que_na_consulta_de_listagem_todos_os_parametros_foram_preenchidos() throws Throwable {
		System.out.println("Dado que na consulta de listagem todos os parametros foram preenchidos");
	}

	@Dado("^que na consulta de listagem nenhum dos parametros foi preenchido$")
	public void que_na_consulta_de_listagem_nenhum_dos_parametros_foi_preenchido() throws Throwable {
		System.out.println("Dado que na consulta de listagem nenhum dos parametros foi preenchido");		
	}
	
	@Dado("^que para os parametros preenchidos na consulta não exista nenhuma parametrizacão de peso criada$")
	public void que_para_os_parametros_preenchidos_na_consulta_não_exista_nenhuma_parametrizacão_de_peso_criada() throws Throwable {		
		System.out.println("Dado que para os parametros preenchidos na consulta não exista nenhuma parametrizacão de peso criada");		
	}
	
	@Quando("^eu chamar o servico de POST para a criacão da parametrizacão de peso com esse tipo de score, canal e produto$")
	public void eu_chamar_o_servico_de_POST_para_a_criacão_da_parametrizacão_de_peso_com_esse_tipo_de_score_canal_e_produto() throws Throwable {
		System.out.println("Quando eu chamar o servico de POST para a criacão da parametrizacão de peso com esse tipo de score, canal e produto");
	}
	
	@Quando("^eu chamar o servico de PUT para alteracão da parametrizacão de peso com esse tipo de score, canal e produto$")
	public void eu_chamar_o_servico_de_PUT_para_alteracão_da_parametrizacão_de_peso_com_esse_tipo_de_score_canal_e_produto() throws Throwable {
		System.out.println("Quando eu chamar o servico de PUT para alteracão da parametrizacão de peso com esse tipo de score, canal e produto");
	}
	
	@Quando("^eu chamar o servico GET para listagem das parametrizacões de peso existentes$")
	public void eu_chamar_o_servico_GET_para_listagem_das_parametrizacões_de_peso_existentes() throws Throwable {
		System.out.println("Quando eu chamar o servico GET para listagem das parametrizacões de peso existentes");
	}

	@Então("^a parametrizacão deve ser criada com sucesso$")
	public void a_parametrizacão_deve_ser_criada_com_sucesso() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Então a parametrizacão deve ser criada com sucesso");
	}

	@Então("^a parametrizacão não deve ser criada$")
	public void a_parametrizacão_não_deve_ser_criada() throws Throwable {
		System.out.println("Então a parametrizacão não deve ser criada");
		//parametrizar.criarParamPesoPost(ct);
	}
	
	@Então("^nenhuma alteracão será realizada$")
	public void nenhuma_alteracão_será_realizada() throws Throwable {
		System.out.println("Então nenhuma alteracão será realizada");
		//parametrizar.alteraParamPesoPut(ct);
	}

	@Então("^a alteracão será realizada com sucesso$")
	public void a_alteracão_será_realizada_com_sucesso_e_o_status_é_retornado() throws Throwable {
		System.out.println("Então a alteracão será realizada com sucesso e o status");
		//parametrizar.alteraParamPesoPut(ct);
	}
	
	@Então("^o servico deve retornar listagem conforme filtro preenchido$")
	public void o_servico_deve_retornar_listagem_conforme_filtro_preenchido() throws Throwable {
		System.out.println("Então o servico deve retornar listagem conforme filtro preenchido");
	}

	@Então("^o servico deve retornar vazio$")
	public void o_servico_deve_retornar_o_erro_encontrado() throws Throwable {
		System.out.println(cenario);
		System.out.println("Então o servico deve retornar vazio");	
//		parametrizar.consultaGet();
	}

}