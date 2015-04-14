package com.assignment.test.functionalTests;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.Map;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mule.api.MuleMessage;
import org.mule.module.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;

public class TestFtpListenerFlows extends FunctionalTestCase {

	MuleClient client;

	@Before
	public void setup() {
		try {
			client = new MuleClient(muleContext);
		} catch (Exception ex) {

		}
	}

	protected String getConfigResources() {
		return "/Users/rahuja/AnypointStudio/workspace/ftpfilelistener/src/main/app/ftpfilelistener.xml";
	}
	
	@Test
	public void testSendRequestToFtpEndpoint() throws Exception {

		
		File file = new File("herd.xml");
		
		Map<String, Object> properties = null;
		
		client.dispatch("ftp://rahuja:ahujar@localhost:22/Users/rahuja/FTPLocation",
				file, properties);
	}
	
	@Test
	public void testGetResponseFromHttpEndpoint() throws Exception {

		String payload = "empty";
		Map<String, Object> properties = null;
		MuleMessage result = client.send("http://localhost:8081/getYaks",
				payload, properties);
		assertEquals(true, result.getPayloadAsString().contains("Betty"));
	}

}
