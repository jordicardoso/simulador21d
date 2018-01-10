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

public class esconsTest extends CamelBlueprintTestSupport {

	private static final String URI_START = "direct:start";

	private static final String URI_END = "mock:result";

	@Override
	protected String getBlueprintDescriptor() {
		return "/OSGI-INF/blueprint/blueprint-escons21d.xml";
	}

	/*
	@Test
	public void randomizeTEST() throws Exception {
		MockEndpoint result = getMockEndpoint(URI_END);

		context.start();
		result.expectedMessageCount(50);
		result.assertIsSatisfied();
		context.stop();
	}*/

	@Test
	public void esconsTEST() throws Exception {
		MockEndpoint result = getMockEndpoint(URI_END);

		context.start();
		result.expectedMessageCount(8247);
		result.assertIsSatisfied();
		context.stop();
	}

	/*
	@Test
	public void DHondtTESTBCN() throws Exception {
		List<Integer> votes = new ArrayList<Integer>();
		votes.add(9426);  // Nuls
		votes.add(12268);  // Blanc
		votes.add(596424); // ERC
		votes.add(558323); // JxCat
		votes.add(126868);  // CUP
		votes.add(428356); // PSC
		votes.add(746693); // C's
		votes.add(121059);  // PP
		votes.add(239146); // COMÚ PODEM
		votes.add(26603);  // PACMA
		votes.add(41);  // Dialeg
		votes.add(190);  // PumJust
		votes.add(7293);  // Recortes
		votes.add(0);  // Familia
		votes.add(0);  // DN

		List<Integer> mandates = DHondt.DHondtResults.compute(votes, 85);
		System.out.println(mandates);
	}
	@Test
	public void DHondtTESTGRN() throws Exception {
		List<Integer> votes = new ArrayList<Integer>();
		votes.add(1754);  // Nuls
		votes.add(1714);  // Blanc
		votes.add(83077); // ERC
		votes.add(140587); // JxCat
		votes.add(20291);  // CUP
		votes.add(32597); // PSC
		votes.add(73983); // C's
		votes.add(10841);  // PP
		votes.add(15095); // COMÚ PODEM
		votes.add(2372);  // PACMA
		votes.add(0);  // Dialeg
		votes.add(330);  // PumJust
		votes.add(504);  // Recortes
		votes.add(0);  // Familia
		votes.add(0);  // DN

		List<Integer> mandates = DHondt.DHondtResults.compute(votes, 17);
		System.out.println(mandates);
	}

	@Test
	public void DHondtTESTLLE() throws Exception {
		List<Integer> votes = new ArrayList<Integer>();
		votes.add(923);  // Nuls
		votes.add(1249);  // Blanc
		votes.add(59803); // ERC
		votes.add(72611); // JxCat
		votes.add(11337);  // CUP
		votes.add(20219); // PSC
		votes.add(38039); // C's
		votes.add(10225);  // PP
		votes.add(8706); // COMÚ PODEM
		votes.add(1087);  // PACMA
		votes.add(0);  // Dialeg
		votes.add(322);  // PumJust
		votes.add(285);  // Recortes
		votes.add(0);  // Familia
		votes.add(0);  // DN

		List<Integer> mandates = DHondt.DHondtResults.compute(votes, 15);
		System.out.println(mandates);
	}

	@Test
	public void DHondtTESTRG() throws Exception {
		List<Integer> votes = new ArrayList<Integer>();
		votes.add(8262);  // Nuls
		votes.add(1519);  // Blanc
		votes.add(80949); // ERC
		votes.add(76068); // JxCat
		votes.add(13736);  // CUP
		votes.add(39003); // PSC
		votes.add(89665); // C's
		votes.add(14915);  // PP
		votes.add(17642); // COMÚ PODEM
		votes.add(2738);  // PACMA
		votes.add(21);  // Dialeg
		votes.add(27);  // PumJust
		votes.add(544);  // Recortes
		votes.add(0);  // Familia
		votes.add(0);  // DN

		List<Integer> mandates = DHondt.DHondtResults.compute(votes, 18);
		System.out.println(mandates);
	}*/
}