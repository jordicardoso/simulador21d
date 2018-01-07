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
	*/
	@Test
	public void esconsTEST() throws Exception {
		MockEndpoint result = getMockEndpoint(URI_END);

		context.start();
		result.expectedMessageCount(8247);
		result.assertIsSatisfied();
		context.stop();
	}

	@Test
	public void DHondtTESTBCN() throws Exception {
		List<Integer> votes = new ArrayList<Integer>();
		votes.add(9231);  // Nuls
		votes.add(11996);  // Blanc
		votes.add(584584); // ERC
		votes.add(547334); // JxCat
		votes.add(124065);  // CUP
		votes.add(419691); // PSC
		votes.add(731352); // C's
		votes.add(118720);  // PP
		votes.add(234132); // COMÚ PODEM
		votes.add(26206);  // PACMA
		votes.add(1);  // Dialeg
		votes.add(190);  // PumJust
		votes.add(7151);  // Recortes
		votes.add(0);  // Familia
		votes.add(0);  // DN

		List<Integer> mandates = DHondt.DHondtResults.compute(votes, 85);
		System.out.println(mandates);
	}
	@Test
	public void DHondtTESTGRN() throws Exception {
		List<Integer> votes = new ArrayList<Integer>();
		votes.add(1694);  // Nuls
		votes.add(1675);  // Blanc
		votes.add(81399); // ERC
		votes.add(137687); // JxCat
		votes.add(19939);  // CUP
		votes.add(32000); // PSC
		votes.add(72537); // C's
		votes.add(10597);  // PP
		votes.add(14826); // COMÚ PODEM
		votes.add(2332);  // PACMA
		votes.add(0);  // Dialeg
		votes.add(328);  // PumJust
		votes.add(490);  // Recortes
		votes.add(0);  // Familia
		votes.add(0);  // DN

		List<Integer> mandates = DHondt.DHondtResults.compute(votes, 17);
		System.out.println(mandates);
	}

	@Test
	public void DHondtTESTRG() throws Exception {
		List<Integer> votes = new ArrayList<Integer>();
		votes.add(8115);  // Nuls
		votes.add(1377);  // Blanc
		votes.add(73868); // ERC
		votes.add(69615); // JxCat
		votes.add(12483);  // CUP
		votes.add(35578); // PSC
		votes.add(81920); // C's
		votes.add(13570);  // PP
		votes.add(16292); // COMÚ PODEM
		votes.add(2474);  // PACMA
		votes.add(21);  // Dialeg
		votes.add(27);  // PumJust
		votes.add(502);  // Recortes
		votes.add(0);  // Familia
		votes.add(0);  // DN

		List<Integer> mandates = DHondt.DHondtResults.compute(votes, 18);
		System.out.println(mandates);
	}

	@Test
	public void DHondtTESTLLE() throws Exception {
		List<Integer> votes = new ArrayList<Integer>();
		votes.add(910);  // Nuls
		votes.add(1220);  // Blanc
		votes.add(58507); // ERC
		votes.add(71381); // JxCat
		votes.add(11138);  // CUP
		votes.add(19810); // PSC
		votes.add(37371); // C's
		votes.add(10053);  // PP
		votes.add(8528); // COMÚ PODEM
		votes.add(1060);  // PACMA
		votes.add(0);  // Dialeg
		votes.add(318);  // PumJust
		votes.add(282);  // Recortes
		votes.add(0);  // Familia
		votes.add(0);  // DN

		List<Integer> mandates = DHondt.DHondtResults.compute(votes, 15);
		System.out.println(mandates);
	}
}