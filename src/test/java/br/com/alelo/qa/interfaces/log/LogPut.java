package br.com.alelo.qa.interfaces.log;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public interface LogPut {

	/**
	 * @param step
	 * @param url
	 * @param response
	 */
	static void logPut(String step, Object url, Object response) {
		BasicConfigurator.configure();
		PropertyConfigurator.configure("conf/logPut.properties");
		Logger.getLogger("").info(step + System.lineSeparator() + "PUT: " + url + System.lineSeparator() + "Resultado: "
				+ response + System.lineSeparator());
	}
}