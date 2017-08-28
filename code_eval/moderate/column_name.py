#!/usr/bin/python
# -*- coding: utf-8 -*-
import sys

archivo = open(sys.argv[1],"r")
lista = archivo.readlines()  
codigo = {
"1":"A",
"2":"B",
"3":"C",
"4":"D",
"5":"E",
"6":"F",
"7":"G",
"8":"H",
"9":"I",
"10":"J",
"11":"K",
"12":"L",
"13":"M",
"14":"N",
"15":"O",
"16":"P",
"17":"Q",
"18":"R",
"19":"S",
"20":"T",
"21":"U",
"22":"V",
"23":"W",
"24":"X",
"25":"Y",
"26":"Z"
}

j=0
#while (j < len(lista)):
for c in str(lista[1]):
	a = str(lista[1])
	if a in codigo:
		print (codigo[a])
	#j=j+1
	
