package net.ddns.stathis.nettest.server;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PingServiceRouteTest extends CamelSpringTestSupport {

	@Override
	protected AbstractApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("META-INF/spring/config.xml");
	}

	@Test
	public void testSendRequest() {
		template.sendBodyAndHeader("jetty://http://localhost:9091/users/getAll", "Hello World", "HeaderName", "hi");
	}

}
