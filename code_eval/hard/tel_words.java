import java.io.*;
import java.lang.*;
 
//public class Main {
public class tel_words {
	public static void main (String[] args) throws IOException {
		String[] t0 = {"0"};
		String[] t1 = {"1"};
		String[] t2 = {"a","b","c"};
		String[] t3 = {"d","e","f"};
		String[] t4 = {"g","h","i"};
		String[] t5 = {"j","k","l"};
		String[] t6 = {"m","n","o"};
		String[] t7 = {"p","q","r","s"};
		String[] t8 = {"t","u","v"};
		String[] t9 = {"w","x","y","z"};
        
		String[] letras1 = {};
		String[] letras2 = {};
		String[] letras3 = {};
		String[] letras4 = {};
		String[] letras5 = {};
		String[] letras6 = {};
		String[] letras7 = {};
		String[] temporal = {};
				
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String entrada;
        
		while ((entrada = buffer.readLine()) != null) {
    	char[] numeros = entrada.toCharArray(); // Siempre son 7
			for( int i = 0; i < 7; i++ ){
				switch( numeros[i] ){
				case '0':
					temporal = t0;
					break;
				case '1':
					temporal = t1;
					break;
				case '2':
					temporal = t2;
					break;
				case '3':
					temporal = t3;
					break;
				case '4':
					temporal = t4;
					break;
				case '5':
					temporal = t5;
					break;
				case '6':
					temporal = t6;
					break;
				case '7':
					temporal = t7;
					break;
				case '8':
					temporal = t8;
					break;
				case '9':
					temporal = t9;
					break;
			}
			switch( i ){
				case 0:
					letras1 = temporal;
					break;
				case 1:
					letras2 = temporal;
					break;
				case 2:
					letras3 = temporal;
					break;
				case 3:
					letras4 = temporal;
					break;
				case 4:
					letras5 = temporal;
					break;
				case 5:
					letras6 = temporal;
					break;
				case 6:
					letras7 = temporal;
					break;
			}
		}
            
		int combinacionesTotal = letras1.length * letras2.length * letras3.length * letras4.length* letras5.length * letras6.length * letras7.length;
					
		String ld1;
		String ld2;
		String ld3;
		String ld4;
		String ld5;
		String ld6;
		String ld7;
		
		String letrasConcat;
		
		for( int c = 0; c < combinacionesTotal; c ++ ){
			ld1 = letras1[c/(letras7.length*letras6.length*letras5.length*letras4.length*letras3.length*letras2.length) % letras1.length];	
			ld2 = letras2[c/(letras7.length*letras6.length*letras5.length*letras4.length*letras3.length) % letras2.length];
			ld3 = letras3[c/(letras7.length*letras6.length*letras5.length*letras4.length) % letras3.length];
			ld4 = letras4[c/(letras7.length*letras6.length*letras5.length) % letras4.length];
			ld5 = letras5[c/(letras7.length*letras6.length) % letras5.length];
			ld6 = letras6[c/(letras7.length) % letras6.length];
			ld7 = letras7[c % letras7.length ];
			letrasConcat = ld1 + ld2 + ld3 + ld4 + ld5 + ld6 + ld7;
			System.out.print(letrasConcat);
			if( c != combinacionesTotal-1 ){
				System.out.print(",");
			}
		}
		System.out.print("\n");
		}
		System.out.print("\n");
		
	}

}
