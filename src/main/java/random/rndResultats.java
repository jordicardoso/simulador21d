package random;

import csv.resultats;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class rndResultats implements Processor {

    private static Logger LOG = LoggerFactory.getLogger(rndResultats.class);

    public void process(Exchange exchange) throws Exception {

        List<csv.resultats> totals = (List<csv.resultats>) exchange.getIn().getBody();

        /*
        for (csv.resultats candidatura : totals) {
            Object obj = candidatura.getCandidatura();
            String codart = obj.toString();
            Random randomGenerator = new Random();

            if (!candidatura.getCandidatura().equals("CENS") && !candidatura.getCandidatura().equals("VOTANTS")){
                Integer totalCandidat = randomGenerator.nextInt(1000);
                candidatura.setresultat(totalCandidat.toString());
            }
            else{
                candidatura.setResultat("0");
            }
        }*/
        exchange.getOut().setHeaders(exchange.getIn().getHeaders());
        exchange.getOut().setBody(totals);
    }
}
