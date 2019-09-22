package br.com.alelo.qa.data.entity;

public class Massa {

	private String idVsts;
	private int idFeature;
	private int idCenario;
	private String url;
	private String tipo;
	private String status;
	private String resposta;
	
	public String getIdVsts() {
		return idVsts;
	}
	
	public void setIdVsts(String idVsts) {
		this.idVsts = idVsts;
	}
	
	public int getIdFeature() {
		return idFeature;
	}
	
	public void setIdFeature(int idFeature) {
		this.idFeature = idFeature;
	}
	
	public int getIdCenario() {
		return idCenario;
	}
	
	public void setIdCenario(int idCenario) {
		this.idCenario = idCenario;
	}
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getResposta() {
		return resposta;
	}
	
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	
}
