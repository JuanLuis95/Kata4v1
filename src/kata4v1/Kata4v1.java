
package kata4v1;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Kata4v1 {

    public static void main(String[] args) throws FileNotFoundException {
      String name = "C:\\Users\\usuario\\Downloads\\email.txt";
      ArrayList <String> mailArray = MailListReader.read(name);
      Histogram <String> histogram =  MailHistogramBuilder.build (mailArray);
      new HistogramDisplay(histogram).execute();
    }
}
