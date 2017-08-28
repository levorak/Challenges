#!/usr/bin/python
# -*- coding: utf-8 -*-
import sys

#conversor a codigo morse
#https://www.codeeval.com/open_challenges/116/

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
mensaje = ".- ...- ..---"
resultado = []
for c in mensaje:
	if c in codigo:
		resultado.append(codigo[c])
	elif c == ' ':
		resultado.append('  ')
return ' '.join(resultado)


