#!/bin/bash
while IFS='' read -r line || [[ -n "$line" ]]; do
	MYVAR= echo $line | wc -w
	echo $MYVAR
##	for word in $line
 #  	do
  #      	echo $word
   # 	done
done < "$1"


