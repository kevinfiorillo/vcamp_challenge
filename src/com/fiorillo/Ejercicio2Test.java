package com.fiorillo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio2Test {

    @Test
    public void dadaUnaNotaMenorA38_retornaElMismoNumero(){

        assertEquals(37,Ejercicio2.redondearUnaNota(37));
        assertEquals(20,Ejercicio2.redondearUnaNota(20));
        assertEquals(1,Ejercicio2.redondearUnaNota(1));
    }

    @Test
    public void dadaUnaNotaConDiferenciaMenorA3ConElSiguienteMultiploDe5_retornaElSiguienteMultiplo(){
        assertEquals(85, Ejercicio2.redondearUnaNota(84));
        assertEquals(95, Ejercicio2.redondearUnaNota(93));
        assertEquals(40, Ejercicio2.redondearUnaNota(38));

    }

    @Test
    public void notaConDiferenciaNoMenorA3DelSiguienteMultiploDe5_retornaElMismoNumero(){
        assertEquals(82, Ejercicio2.redondearUnaNota(82));
        assertEquals(91, Ejercicio2.redondearUnaNota(91));
        assertEquals(40, Ejercicio2.redondearUnaNota(40));
        assertEquals(57, Ejercicio2.redondearUnaNota(57));
        assertEquals(29, Ejercicio2.redondearUnaNota(29));
    }

    @Test
    public void redondeaSegunProfesorUnArregloDeNotas(){

        int [] notas = Ejercicio2.redondearNota((new int[]{84,29,57}));
        int nota1 = notas[0];
        int nota2 = notas[1];
        int nota3 = notas[2];

        assertEquals(85, nota1);
        assertEquals(29, nota2);
        assertEquals(57, nota3);
    }

}