#include <stdio.h>

//este programa imprime los numero impares de 1-99
//https://www.codeeval.com/open_challenges/25/

int main(void){

	for (int n=1;n<=99; n++){ 
			if(n%2 !=0){
				printf("%i\n",n);
			}
	}
}
