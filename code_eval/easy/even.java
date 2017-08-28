import java.io.*;
import java.lang.*;
//https://www.codeeval.com/open_challenges/20/


public class even{
//public class Main {
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {			
			String[] digits = line.split("");
			if(Integer.valueOf(digits[digits.length - 1]) % 2 == 0){
				System.out.println("1\n");
			}else{
				System.out.println("0\n");				
			}
		}
	}
}
