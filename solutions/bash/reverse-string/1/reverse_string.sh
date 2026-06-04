#!/usr/bin/env bash

var=$1
len="${#var}"   
i=0   
rev=""

while (( i<len )); 
    do rev="${var:i++:1}$rev"; 
done

echo "$rev"
