import java.io.*;
import java.lang.*;

//este codigo lee las palabras de cada linea de un fichero y las imprime al reves
//https://www.codeeval.com/open_challenges/104/
//public class Main {

public class word_to_digit {
	public static void main (String[] args) throws IOException {
	File file = new File(args[0]);
	BufferedReader buffer = new BufferedReader(new FileReader(file));
	String line;       
	while ((line = buffer.readLine()) != null) {		
		String[] words = line.split(";");
		String numeros="";
		String Res="";
		for (int i=0; i< words.length; i++){
	       	switch (words[i]){
	        	case "zero":
	        		Res= numeros.concat("0");
	        		System.out.print("0");	
	        		break;
	        	case "one":
	        		Res= numeros.concat("1");
	        		System.out.print("1");	
	        		break;
	        	case "two":
	        		Res= numeros + "2";
	        		System.out.print("2");	
	        		break;
	        	case "three":
	        		Res= numeros + "3";
	        		System.out.print("3");	
	        		break;
	        	case "four":
	        		Res= numeros + "4";
	        		System.out.print("4");	
        			break;
	        	case "five":
	        		Res= numeros + "5";
	        		System.out.print("5");	
	        		break;
	        	case "six":
	        		Res= numeros + "6";
	        		System.out.print("6");	
	        		break;
	        	case "seven":
		        	Res= numeros + "7";
		        	System.out.print("7");	
		        	break;
	        	case "eight":
	        		Res= numeros + "8";
	        		System.out.print("8");	
	        		break;
		        case "nine":
	        		Res= numeros + "9";
	        		System.out.print("9");	
	        		break;
	        		
			}
	
		}
		System.out.println("");
	}
	}
}
