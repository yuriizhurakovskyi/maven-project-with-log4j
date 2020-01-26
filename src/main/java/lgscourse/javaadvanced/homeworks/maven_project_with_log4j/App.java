package lgscourse.javaadvanced.homeworks.maven_project_with_log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class App {
	private static Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		logger.debug("Debug Message!");
		logger.info("Info Message!");
		logger.trace("Trace Message!");
		logger.warn("Warn Message!");
		logger.error("Error Message!");
		logger.fatal("Fatal Error Message!");
	}
}
