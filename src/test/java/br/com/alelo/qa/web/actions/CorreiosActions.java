package br.com.alelo.qa.web.actions;

import org.junit.Assert;

import br.com.alelo.qa.data.dao.MassaDao;
import br.com.alelo.qa.data.entity.Massa;
import br.com.alelo.qa.interfaces.api.IUtils;
import br.com.alelo.qa.interfaces.api.IValidacoes;
import br.com.alelo.qa.interfaces.api.Requisicao;
import br.com.alelo.qa.interfaces.log.Log;
import br.com.alelo.qa.interfaces.log.LogPost;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CorreiosActions implements Requisicao, Log, IValidacoes, IUtils{
	
	MassaDao massaDao = new MassaDao();
	Massa massa;
	protected Response resposta;
	
	public CorreiosActions(String idVsts) {
		massa = massaDao.getMassa(idVsts);
	}

	public void cepUrl(String cep) {
		massa.setUrl(massa.getUrl().replace("?", cep));
	}
	
	public void consultaGet() {

		resposta = get(massa.getUrl(), "", ContentType.JSON);
		
		LogPost.logPost("Descricao", massa.getUrl(), resposta.getBody().asString());
		validarStatusCode(resposta, Integer.parseInt(massa.getStatus()));
	}
	
	public void validaJsonResposta() {
		String jsonResposta = resposta.asString();
		Assert.assertEquals(massa.getResposta(), jsonResposta);
	}
	
}
