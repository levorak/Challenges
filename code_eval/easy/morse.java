import java.io.*;
import java.lang.*;

//este codigo lee las palabras de cada linea de un fichero y las imprime al reves
//https://www.codeeval.com/open_challenges/104/
//public class Main {

public class morse {
	public static void main (String[] args) throws IOException {
	File file = new File(args[0]);
	BufferedReader buffer = new BufferedReader(new FileReader(file));
	String line; 
	      
	codigo = {
    'A': '.-',     'B': '-...',    'C': '-.-.',
    'D': '-..',    'E': '.',       'F': '..-.',
    'G': '--.',    'H': '....',    'I': '..',
    'J': '.---',   'K': '-.-',     'L': '.-..',
    'M': '--',     'N': '-.',      'O': '---',
    'P': '.--.',   'Q': '--.-',    'R': '.-.',
    'S': '...',    'T': '-',       'U': '..-',
    'V': '...-',   'W': '.--',     'X': '-..-',
    'Y': '-.--',   'Z': '--..',    '1': '.----',
    '2': '..---',  '3': '...--',   '4': '....-',
    '5': '.....',  '6': '-....',   '7': '--...',
    '8': '---..',  '9': '----.',   '0': '-----'
}
	
	while ((line = buffer.readLine()) != null) {		
		String[] words = line.split("  ");
		
		for (int i=0; i< words.length; i++){
			//System.out.println(words[i]);
			String[] letras= words[i].split(" ");
			for (int j=0; j< letras.length; j++){
				System.out.println(letras[j]);
				for letras[j] in codigo
				if 
				
			}
		}
	}
	}
}
		
