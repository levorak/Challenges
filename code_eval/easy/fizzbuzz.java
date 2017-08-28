import java.io.*;
import java.lang.*;

//este codigo lee unos numero de un fichero y suma los digitos de cada numero
//https://www.codeeval.com/open_challenges/21/
//public class Main {
public class fizzbuzz {
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
       
		while ((line = buffer.readLine()) != null) {
			int fizz=0;
			int buzz=0;
			int n=0;
			String aux;
	
			String[] digits = line.split(" ");
			fizz=Integer.valueOf(digits[0]);
			buzz=Integer.valueOf(digits[1]);
			n=Integer.valueOf(digits[2]);
			StringBuilder final_string = new StringBuilder(n);	

			for (int i=1; i <= n ; i++){
				if (i%fizz==0 && i%buzz==0){
					aux="FB";
					final_string.append((String) aux);
	
				}else if (i%fizz==0 && i%buzz!=0){
					aux="F";
					final_string.append((String) aux);
					
				}else if (i%fizz!=0 && i%buzz==0){
					aux="B";
					final_string.append((String) aux);					
				}else{
					final_string.append((int) i);
				}
				aux = " ";
				final_string.append((String) aux);

			} 
			System.out.println(final_string);
		}
	}
}
// /home/drpc/Dropbox/Wargames/code_eval/test_digitos.txt
