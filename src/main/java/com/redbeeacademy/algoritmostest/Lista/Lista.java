package com.redbeeacademy.algoritmostest.Lista;
/*
Realizar los siguientes métodos:
1) Guarde un numero en una lista
2) Intercambie el elemento de la posicion 2 por la posicion 4.
3) Un metodo recibe una lista de numeros y un numero, la funcion debe agregar el numero al inicio de la lista
4) Calcular el promedio de los elementos de una lista
5) Eliminar la posicion donde se encuentre el valor maximo de la lista
6) Dadas dos listas, crear una nueva con los elementos que se repitan en ambas
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lista {

    public static Integer isNull(Integer num){
        return Objects.requireNonNullElse(num,0);
    }

    public static List<Integer> guardarEnLista(Integer numero){
        List<Integer> lista = new ArrayList<>();
        lista.add(isNull(numero));
        return lista;
    }

    public static List<Integer> intercambiar(List<Integer> lista){
        List<Integer> listaNueva = new ArrayList<>();
        for(int i = 0; i<lista.size();i++){
            if(lista.get(i) != null){
                listaNueva.add(lista.get(i));
            }
        }
        Integer elemento = listaNueva.get(2);
        listaNueva.add(2, listaNueva.get(4));
        listaNueva.remove(3);
        listaNueva.add(4,elemento);
        listaNueva.remove(5);
        return listaNueva;
    }

    public static List<Integer> agregarElementoAlInicio(List<Integer> lista, Integer numero){
        List<Integer> listaNueva = new ArrayList<>();
        for(int i = 0; i<lista.size();i++){
            if(lista.get(i) != null){
                listaNueva.add(lista.get(i));
            }
        }
        listaNueva.add(0,numero);
        return listaNueva;
    }

    public static Double promedioLista(List<Integer> lista){
        double total = 0;
        Integer totalElementosEnListaSinNull = 0;
        for(int i = 0; i<lista.size();i++){
            if(lista.get(i) != null){
                totalElementosEnListaSinNull++;
                total += lista.get(i);
            }
        }
        return total/totalElementosEnListaSinNull;
    }

    public static List<Integer> eliminarMaximo(List<Integer> lista){
        List<Integer> newList = new ArrayList<>();
        Integer max = 0;
        if(!lista.isEmpty()){
            for(int i = 0; i<lista.size();i++){
                if(lista.get(i) != null ){
                    newList.add(lista.get(i));
                    if (lista.get(i) > max) {
                        max = lista.get(i);
                    }
                }
            }
        }
        newList.remove(newList.indexOf(max));
        return newList;
    }

    public static List<Integer> repetidos(List<Integer> a, List<Integer> b){
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < a.size();i++){
            if(b.contains(a.get(i))){
                newList.add(a.get(i));
            }
        }
        return newList;
    }

}
