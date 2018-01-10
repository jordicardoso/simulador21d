package process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import csv.resultats;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class arrayVots implements Processor {

    public void process(Exchange exchange) throws Exception {

        int numPartits = 10;
        resultats oldBody = (resultats) exchange.getIn().getBody();
        List<Integer> partits = new ArrayList<Integer>(numPartits);
        partits.add(oldBody.getvjxc());
        partits.add(oldBody.getverc());
        partits.add(oldBody.getvcup());
        partits.add(oldBody.getvcs());
        partits.add(oldBody.getvpsc());
        partits.add(oldBody.getvcom());
        partits.add(oldBody.getvppc());
        partits.add(oldBody.getvpacma());
        partits.add(oldBody.getvrecortes());
        partits.add(oldBody.getvpumjust());

        exchange.getOut().setHeaders(exchange.getIn().getHeaders());
        exchange.getOut().setBody(partits);
    }
}
