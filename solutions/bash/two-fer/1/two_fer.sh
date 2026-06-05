#!/usr/bin/env bash

var=$1

if [[ -z $var ]]
then
    echo "One for you, one for me."
else
    echo "One for ${var}, one for me."
fi