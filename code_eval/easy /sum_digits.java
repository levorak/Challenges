import java.io.*;
import java.lang.*;

//este codigo lee unos numero de un fichero y suma los digitos de cada numero
//https://www.codeeval.com/open_challenges/21/
//public class Main {
public class sum_digits {
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
       
		while ((line = buffer.readLine()) != null) {
			int sum=0;
			String[] digits = line.split("");
			//System.out.println("long="+digits.length);
			for (int i = 0; i < digits.length; i++) {
				//System.out.println(digits[i]);
				sum = sum + Integer.valueOf(digits[i]);
			}
			System.out.println(sum);
		}
	}
}
// /home/drpc/Dropbox/Wargames/code_eval/test_digitos.txt
