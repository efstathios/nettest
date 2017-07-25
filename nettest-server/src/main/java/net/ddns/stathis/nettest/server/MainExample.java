package net.ddns.stathis.nettest.server;

import org.apache.camel.main.Main;
import org.apache.camel.main.MainListenerSupport;
import org.apache.camel.main.MainSupport;

public class MainExample {

	public static void main(String[] args) throws Exception {
		MainExample example = new MainExample();
		example.boot();
	}

	public void boot() throws Exception {
		// create a Main instance
		Main main = new Main();
		// add routes
		main.addRouteBuilder(new UserRestServiceRoute());
		// run until you terminate the JVM
		main.run();
	}

	public static class Events extends MainListenerSupport {

		@Override
		public void afterStart(MainSupport main) {
			System.out.println("MainExample with Camel is now started!");
		}

		@Override
		public void beforeStop(MainSupport main) {
			System.out.println("MainExample with Camel is now being stopped!");
		}
	}
}
