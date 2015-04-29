package ch.isb.sib.sparql.tutorial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A simple Spring Boot application for educative purpose in learning SPARQL
 * 
 * @author Daniel Teixeira http://github.com/ddtxra
 *
 */
@SpringBootApplication
public class Application {
	
	private static final Log logger = LogFactory.getLog(Application.class);

	public static String FOLDER = "default";

	public static void main(String[] args) {
		
		if(args.length > 0){
			FOLDER = args[0];
		}
		logger.info("Reading from " + FOLDER);
		
		SpringApplication.run(Application.class, args);
		String port = null;
		if(System.getProperty("server.port") == null) {
			port = "8080";
			logger.info("Taking default port 8080. You can change the port by adding a jvm option -Dserver.port=8090");
		}else {
			port = System.getProperty("server.port");
			logger.info("server.port option found. Taking port " + port);
		}
		
		String serverUrl = "http://localhost:" + port; // path to your new file

		logger.info("Server started at " + serverUrl);

	}

}