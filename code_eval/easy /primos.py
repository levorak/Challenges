#!/usr/bin/python
# -*- coding: utf-8 -*-

#este programa suma los primos menores a 1000
#https://www.codeeval.com/open_challenges/4/

def main():	
	
	a=0
	for num in range (1,1000):
		div =0
		for i in range (1,num):
			if num%i == 0 :		
				div=div+1

		#print str(num)+'tiene' + str(div) +'divisores'

		if (div <= 1):
			print num
			a=a+num
	
	print a		
			
		

if __name__ == "__main__":

	main()


