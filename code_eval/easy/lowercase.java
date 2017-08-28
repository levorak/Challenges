import java.io.*;
import java.lang.*;
//https://www.codeeval.com/open_challenges/20/


public class lowercase{
//public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;

        while ((line = buffer.readLine()) != null) {
            System.out.println(line.toLowerCase());
        }
    }
}
