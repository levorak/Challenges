#!/usr/bin/python
# -*- coding: utf-8 -*-
import sys

archivo = open(sys.argv[1],'r')
lista = archivo.readlines()  
j=0
while (j < len(lista)):

	limite=int(lista[j])

	for num in range (1,limite):
		div =0
		for i in range (1,num):
			if num%i == 0 :		
				div=div+1

		#print str(num)+'tiene' + str(div) +'divisores'

		if (div <= 1):
			sys.stdout.write(str(num))
			sys.stdout.write(",")			
	j=j+1
	print ""


archivo.close  # cierra archivo
