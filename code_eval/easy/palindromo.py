#!/usr/bin/python
# -*- coding: utf-8 -*-

#este programa suma los primos menores a 1000
#https://www.codeeval.com/open_challenges/2/

def main():	
	mynum=0
	for num in range (1,1000):
		div=0	
		a = str(num)
		listaa = []
		for digit in a:
    			listaa.append (int(digit))			
		listab=list(reversed(listaa))
		if (listaa == listab):
			for i in range (1,num):
				if num%i == 0 :	
					div=div+1
			if (div <= 1):
				mynum=num

	print mynum
		
if __name__ == "__main__":

	main()

