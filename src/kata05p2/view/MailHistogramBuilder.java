package kata05p2.view;

import java.util.List;
import kata05p2.model.*;

public class MailHistogramBuilder {

    public static Histogram<String> build(List<Mail> list) {
        Histogram<String> histogram = new Histogram<>();
        for (Mail mail : list) {
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }
}
