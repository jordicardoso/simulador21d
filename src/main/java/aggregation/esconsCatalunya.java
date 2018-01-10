package aggregation;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class esconsCatalunya implements AggregationStrategy {

    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        if (oldExchange == null) {
            return newExchange;
        }

        List<Integer> oldBody = (List<Integer>) oldExchange.getIn().getBody();
        List<Integer> newBody = (List<Integer>) newExchange.getIn().getBody();

        List<Integer> result = IntStream.range(0, oldBody.size())
                .mapToObj(i -> oldBody.get(i) + newBody.get(i))
                .collect(Collectors.toList());

        oldExchange.getOut().setBody(result);

        return oldExchange;
    }
}
