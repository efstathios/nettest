package net.ddns.stathis.nettest.server;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

import com.fasterxml.jackson.core.JsonParseException;

/**
 * Route for the ping service.
 */
public class UserRestServiceRoute extends RouteBuilder {

	/**
	 * Configure a route that receives a message from the Ping endpoint and
	 * process it based on its contents.
	 * 
	 * @throws Exception
	 *             when the route could not be properly started/stopped
	 */
	@Override
	public final void configure() throws Exception {

		restConfiguration(). //
				host("localhost"). //
				component("jetty"). //
				port(9091). //
				bindingMode(RestBindingMode.xml). //
				dataFormatProperty("prettyPrint", "true");

		rest("/users"). //
				get("/getAll").outType(Users.class).route().bean(UserHandler.class, "getAll"). //
				onException(JsonParseException.class).handled(true). //
				setHeader(Exchange.HTTP_RESPONSE_CODE, constant(400)). //
				setHeader(Exchange.CONTENT_TYPE, constant("text/plain")). //
				setBody().constant("Invalid json data").endRest();

	}

}