package br.com.alelo.integrations.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.alelo.utils.PropertiesFile;

public class DBConnection {

	private static final String USUARIO = "root";
	private static final String SENHA = "";
	private static String DRIVER = "com.mysql.jdbc.Driver";
	static String status = "";

	public static Connection getConnection() {
		try {
			PropertiesFile props = new PropertiesFile();
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName(DRIVER);
			Connection conn = 
					DriverManager.getConnection(
						//"jdbc:mysql://10.150.41.150:3306/" + props.getValor("db"),
//						"framework",
//						"testes@123"
						"jdbc:mysql://127.0.0.1:3306/" + props.getValor("db"),
						USUARIO,
						SENHA
					);
			return conn;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
