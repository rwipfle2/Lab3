import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.Arrays;

public class WebScraper {

        /**
         * Retrieve contents from a URL and return them as a string.
         *
         * @param url url to retrieve contents from
         * @return the contents from the url as a string, or an empty string on error
         */
        public static String urlToString(final String url) {
            Scanner urlScanner;
            try {
                urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
            } catch (IOException e) {
                return "";
            }
            String contents = urlScanner.useDelimiter("\\A").next();
            urlScanner.close();
            System.out.println("Contents are: " + contents);
            return contents;
        }


public static int wordcount(String input){
          String[] array = input.split(" ");
          return array.length;

    }

    public static int onewordcount(String input, String word){
        int count = 0;
            String[] array = input.split(" ");
            for (int i = 0; i < array.length; i++){
                if (array[i] == word)
                    count++;
            }
            return count;
    }


    public static void main(String[] unused) {
            String url = "http://erdani.com/tdpl/hamlet.txt";
            String word = "Prince";
           String output = urlToString (url);
            System.out.println("The numbers of words is: " + wordcount(output));
            System.out.println("The number of counts for " + word + " is: " + onewordcount(output, word));
        System.out.println("Ran");
       //
        //
        // System.out.println(output);


    }


}
