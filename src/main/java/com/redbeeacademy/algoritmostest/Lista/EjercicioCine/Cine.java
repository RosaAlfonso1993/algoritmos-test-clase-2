package com.redbeeacademy.algoritmostest.Lista.EjercicioCine;

import java.text.DecimalFormat;
import java.util.List;

/*
Un cine de un pueblo nos pide que generemos una aplicacion para controlar las personas de una cola.
La edad de las personas de la cola se generan aleatoriamente entre 5 y 60 años (edad minima 5 - maxímo 60).
La capacidad de la sala es de 50 personas.
Deberemos mostrar:

1) la cantidad total recaudada
2) cuantas personas entraron por cada rango de edad
3) promedio de edad por cada estreno

Precios por edad
entre 5 y 10 años ->  $100
entre 11 y 17 años -> $150
de 18 en adelante -> $200

Tenemos la clase Persona, donde vamos a usarla para modelar edad, y las propiedades que crean convenientes
 */



public class Cine {

    public static double cantidadTotalRecaudada(List<Persona> personas){
        double cantidadTotal = 0;
        if(!personas.isEmpty()){
            for(int i = 0; i < personas.size();i++){
                if(personas.get(i) != null){
                    if(personas.get(i).getEdad() >= 5 && personas.get(i).getEdad() <= 10){
                        cantidadTotal += 100;
                    }
                    if(personas.get(i).getEdad() >= 11 && personas.get(i).getEdad() <= 17){
                        cantidadTotal += 150;
                    }
                    if(personas.get(i).getEdad() >= 18){
                        cantidadTotal += 200;
                    }
                }
            }
            return cantidadTotal;
        }
        return cantidadTotal;
    }

    public static Integer cantidadPersonas(List<Persona> personas){
        Integer cantidadPersonas = 0;
        if(!personas.isEmpty()){
            for (int i = 0; i < personas.size();i++){
                if(personas.get(i) != null){
                    cantidadPersonas++;
                }
            }
        }
        return cantidadPersonas;
    }

    public static double promedioEdad(List<Persona> personas){
        double promedio = 0;
        double totalEdades = 0;
        if(!personas.isEmpty()){
            for (int i = 0; i < personas.size();i++){
                if(personas.get(i) != null){
                    totalEdades += personas.get(i).getEdad();
                }
            }
        }
        promedio = Math.round(totalEdades/cantidadPersonas(personas)*100.0)/100.0;
        return promedio;
    }
}
