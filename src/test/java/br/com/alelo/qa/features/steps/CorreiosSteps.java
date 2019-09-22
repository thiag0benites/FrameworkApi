package br.com.alelo.qa.features.steps;

import br.com.alelo.qa.web.actions.CorreiosActions;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CorreiosSteps {
	
	protected String cenario;
	protected String idVsts;
	CorreiosActions correios;
	
	@Before
	public void iniciaCenario(Scenario scenario) {
		cenario = scenario.getName().toString();
		idVsts = scenario.getName().substring(0, scenario.getName().indexOf(":")).trim();
		correios = new CorreiosActions(idVsts);
	}
	
	@Dado("^que envio um CEP valido \"([^\"]*)\"$")
	public void que_envio_um_CEP_valido(String cep) throws Throwable {
		System.out.println(cenario);
		correios.cepUrl(cep);
	}


	@Quando("^recebo codigo de sucesso$")
	public void recebo_codigo_de_sucesso() throws Throwable {
		System.out.println(cenario);
		correios.consultaGet();
	}

	@Entao("^valido os dados do endereco$")
	public void valido_os_dados_do_endereco() throws Throwable {
		System.out.println(cenario);
		correios.validaJsonResposta();
	}

}
