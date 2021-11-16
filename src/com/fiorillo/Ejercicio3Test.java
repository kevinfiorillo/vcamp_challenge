package com.fiorillo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio3Test {
    @Test
    public void cuandoAnioEsDespues1919YNoBisiesto_retornaDiaGregoriano(){

        assertEquals("02.02.2021", Ejercicio3.viajarEnElTiempo(2021,33));
        assertEquals("01.03.2021", Ejercicio3.viajarEnElTiempo(2021,60));
        assertEquals("02.03.2021", Ejercicio3.viajarEnElTiempo(2021,61));
        assertEquals("08.11.2021", Ejercicio3.viajarEnElTiempo(2021,312));

    }

    @Test
    public void cuandoAnioEsDespues1919YEsBisiesto_retornaDiaGregoriano(){
        assertEquals("01.01.2020", Ejercicio3.viajarEnElTiempo(2020,1));

        assertEquals("02.02.2020", Ejercicio3.viajarEnElTiempo(2020,33));
        assertEquals("29.02.2020", Ejercicio3.viajarEnElTiempo(2020,60));
        assertEquals("01.03.2020", Ejercicio3.viajarEnElTiempo(2020,61));
        assertEquals("08.11.2016", Ejercicio3.viajarEnElTiempo(2016,313));
    }
    @Test
    public void cuandoAnioEs1918YEsBisiesto_retornaDiaCorrecto(){
        assertEquals("01.01.1918", Ejercicio3.viajarEnElTiempo(1918,1));

        assertEquals("14.02.1918", Ejercicio3.viajarEnElTiempo(1918,32));
        assertEquals("15.02.1918", Ejercicio3.viajarEnElTiempo(1918,33));
        assertEquals("28.02.1918", Ejercicio3.viajarEnElTiempo(1918,46));
        assertEquals("01.03.1918", Ejercicio3.viajarEnElTiempo(1918,47));
        assertEquals("04.03.1918", Ejercicio3.viajarEnElTiempo(1918,50));
    }

    @Test
    public void cuandoAnioEsAntes1918YEsBisiesto_retornaDiaGregoriano(){
        assertEquals("08.11.1800", Ejercicio3.viajarEnElTiempo(1800,313));

    }

    @Test
    public void deberiaDevolverLaFechaExactaDelDiaDelProgramadorDeAnioNormalYBisiesto(){
        assertEquals("13.09.2021", Ejercicio3.viajarEnElTiempo(2021,256));
        assertEquals("12.09.2020", Ejercicio3.viajarEnElTiempo(2020,256));
    }

    @Test
    public void deberiaDevolverLaFechaExactaDelUltimoDiaDelAnio(){
        assertEquals("31.12.2021", Ejercicio3.viajarEnElTiempo(2021,365));
        assertEquals("31.12.2020", Ejercicio3.viajarEnElTiempo(2020,366));
    }



}