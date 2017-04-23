import java.io.*;
import java.lang.*;

//este codigo lee unos numero de un fichero y los suma
//https://www.codeeval.com/open_challenges/24/
//public class Main {
public class sum_integers {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
	int sum=0;
       
        while ((line = buffer.readLine()) != null) {      		

                sum = sum + Integer.valueOf(line);
         }
            
	System.out.println(sum);
            
        }
}
// /home/drpc/Dropbox/Wargames/code_eval/test_digitos.txt
