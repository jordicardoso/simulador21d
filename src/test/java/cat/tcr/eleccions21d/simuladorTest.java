package cat.tcr.eleccions21d;

import static org.hamcrest.CoreMatchers.containsString;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.apache.camel.test.blueprint.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import java.io.InputStream;

public class simuladorTest extends CamelBlueprintTestSupport {

	private static final String URI_START = "direct:start";

	private static final String URI_END = "mock:result";

	@Override
	protected String getBlueprintDescriptor() {
		return "/OSGI-INF/blueprint/blueprint-simulador21d.xml";
	}

	/*
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
		result.expectedMessageCount(150);
		result.assertIsSatisfied();
		context.stop();
	}
	*/
	@Test
	public void DHondtTEST() throws Exception {
		List<Integer> votes = new ArrayList<Integer>();
		votes.add(862300); // C's
		votes.add(673285); // ERC
		votes.add(618653); // JxCat
		votes.add(494693); // PSC
		votes.add(274565); // COMÚ PODEM
		votes.add(142195);  // CUP
		votes.add(141803);  // PP
		votes.add(31157);  // PACMA
		votes.add(8479);  // CERO-VERDS
		votes.add(15560);  // Blanc
		votes.add(10315);  // Nuls

		List<Integer> mandates = DHondt.DHondtResults.compute(votes, 85);
		System.out.println(mandates);
	}
}