import java.io.*;
import java.lang.*;

//este codigo abre un fichero y lee los numeros separados por comas y encuentra el minimo multiplo del primer numero que sea mayor o igual al segundo numero
//https://www.codeeval.com/open_challenges/62/

//public class Main {
public class modulus {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        double N = 0;
        double M = 0;
	double div=0;
	double mod , mod2,div1;
       
        while ((line = buffer.readLine()) != null) {
            line = line.trim();       
            N = Integer.parseInt(line.split(",")[0]);
            M = Integer.parseInt(line.split(",")[1]);
            div = Math.floor(N/M);
	    mod=N-(div*M); 

		int i = (int)mod;	    


            System.out.println(i);
        }
    }
}

// /home/drpc/Dropbox/Wargames/code_eval/test_multiplos.txt
