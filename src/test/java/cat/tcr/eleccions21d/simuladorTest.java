package cat.tcr.eleccions21d;

import static org.hamcrest.CoreMatchers.containsString;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.apache.camel.test.blueprint.*;
import org.junit.Test;

import java.io.InputStream;

public class simuladorTest extends CamelBlueprintTestSupport {

	private static final String URI_START = "direct:start";

	private static final String URI_END = "mock:result";

	@Override
	protected String getBlueprintDescriptor() {
		return "/OSGI-INF/blueprint/blueprint-simulador21d.xml";
	}

	@Test
	public void randomizeTEST() throws Exception {
		MockEndpoint result = getMockEndpoint(URI_END);

		context.start();
		result.expectedMessageCount(50);
		result.assertIsSatisfied();
		context.stop();
	}

	@Test
	public void elasticTEST() throws Exception {
		MockEndpoint result = getMockEndpoint(URI_END);

		context.start();
		//result.expectedMessageCount(15);
		//result.assertIsSatisfied();
		//context.stop();
	}
}