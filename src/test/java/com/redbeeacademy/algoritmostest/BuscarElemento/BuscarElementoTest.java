package com.redbeeacademy.algoritmostest.BuscarElemento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BuscarElementoTest {

    @Test
    void devuelvoFalse() {
        boolean result = BuscarElemento.devuelvoVerdadero(List.of(3,6,2,1,5),7);

        assertFalse(result);
    }

    @Test
    void devuelvoTrue() {
        boolean result = BuscarElemento.devuelvoVerdadero(List.of(3,6,2,1,5),2);

        assertTrue(result);
    }

    @Test
    void devuelveFalseConListaVacia() {
        boolean result = BuscarElemento.devuelvoVerdadero(List.of(),2);
        assertFalse(result);
    }

    @Test
    void devuelvoTrueConNull() {
        boolean result = BuscarElemento.devuelvoVerdadero(Arrays.asList(3,6,null,1,5),5);
        assertTrue(result);
    }
    @Test
    void devuelvoFalseConNull() {
        boolean result = BuscarElemento.devuelvoVerdadero(Arrays.asList(3,6,null,1,5),8);
        assertFalse(result);
    }

    @Test
    void devuelvoTrueValorBuscadoNull() {
        boolean result = BuscarElemento.devuelvoVerdadero(Arrays.asList(3,6,null,1,5),null);
        assertTrue(result);
    }
}
