package br.com.alelo.qa.data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.alelo.integrations.db.DBConnection;
import br.com.alelo.qa.data.entity.Massa;

public class MassaDao {

	public Massa getMassa(String idVsts) {
		
		Massa massa = new Massa();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT ID_FEATURE, ID_CENARIO, URL_ENVIO, TIPO_ENVIO, STATUS_RESPOSTA, RESPOSTA FROM parametros ");
		sql.append("WHERE ID_CENARIO = (SELECT ID_CENARIO FROM cenario WHERE ID_VSTS = ?)");
		
        Connection conn = DBConnection.getConnection();
        
        PreparedStatement comando;
        
		try {
			
			comando = conn.prepareStatement(sql.toString());
			comando.setString(1,idVsts);
			ResultSet resultado = comando.executeQuery();
 
			while (resultado.next()) {
				massa.setIdVsts(idVsts);
				massa.setIdFeature(resultado.getInt("ID_FEATURE"));
				massa.setIdCenario(resultado.getInt("ID_CENARIO"));
				massa.setUrl(resultado.getString("URL_ENVIO"));
				massa.setTipo(resultado.getString("TIPO_ENVIO"));
				massa.setStatus(resultado.getString("STATUS_RESPOSTA"));
				massa.setResposta(resultado.getString("RESPOSTA"));
			}

			resultado.close();
			comando.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
       
        try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return massa;
	}
	
}
