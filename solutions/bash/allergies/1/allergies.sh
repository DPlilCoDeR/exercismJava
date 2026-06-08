#!/bin/bash

score=$1
action=$2
target_allergy=$3

# Array con los nombres de las alergias en orden exacto (del bit 0 al bit 7)
# Valores correspondientes: 1, 2, 4, 8, 16, 32, 64, 128
allergies=("eggs" "peanuts" "shellfish" "strawberries" "tomatoes" "chocolate" "pollen" "cats")

# Lista donde guardaremos las alergias detectadas
detected_allergies=()

# 1. Analizamos los bits utilizando un bucle que recorre las 8 alergias válidas
for i in "${!allergies[@]}"; do
    # Calculamos el valor del bit actual (2^i) -> 1, 2, 4, 8...
    bit_value=$((1 << i))
    
    # Operación AND binaria: Comprobamos si el bit está encendido en el score
    if (( (score & bit_value) != 0 )); then
        detected_allergies+=("${allergies[$i]}")
    fi
done

# 2. Ejecutamos la acción que nos pide el test
if [[ "$action" == "allergic_to" ]]; then
    # Comprobamos si la alergia buscada está en nuestra lista de detectadas
    # Usamos un truco rápido: concatenar el array y buscar con un patrón
    if [[ " ${detected_allergies[*]} " == *" $target_allergy "* ]]; then
        echo "true"
    else
        echo "false"
    fi

elif [[ "$action" == "list" ]]; then
    # Imprime todas las alergias del array separadas por un espacio en blanco limpio
    echo "${detected_allergies[*]}"
fi