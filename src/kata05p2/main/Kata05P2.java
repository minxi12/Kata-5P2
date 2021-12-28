package kata05p2.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata05p2.model.Histogram;
import kata05p2.model.Mail;
import kata05p2.view.*;

public class Kata05P2{

    public static void main(String[] args) throws IOException {
        MailListReaderBD obj = new MailListReaderBD();
        ArrayList<Mail> email = (ArrayList<Mail>) obj.read("mail.db");
        new HistogramDisplay(MailHistogramBuilder.build(email)).execute();
    }
}
