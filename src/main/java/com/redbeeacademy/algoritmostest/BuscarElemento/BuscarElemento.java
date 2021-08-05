package com.redbeeacademy.algoritmostest.BuscarElemento;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class BuscarElemento {

    public static boolean devuelvoVerdadero(List<Integer> lista, Integer buscado){
        boolean encontrado = false;
        Integer contador = 0;
        if(!lista.isEmpty()){
            while(!encontrado && contador<lista.size()){
                if(buscado == lista.get(contador)){
                    encontrado = true;
                }
                contador++;
            }
        }
        return encontrado;
    }
}
