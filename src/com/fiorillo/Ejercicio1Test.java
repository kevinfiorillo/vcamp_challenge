package com.fiorillo;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio1Test {
    private List<Integer> pajaros;

    @BeforeEach
    public void setUp(){
        pajaros = new ArrayList<Integer>();
    }

    @Test
    public void noHayPajaros_retornaMenosUno(){
        assertEquals(-1, Ejercicio1.pajarosMigratorios(0,pajaros));
    }

    @Test
    public void cuandoPasoUnUnicoPajaro_retornaEseTipoPajaro(){
        pajaros.add(3);
        int idPajaroMasVisto = Ejercicio1.pajarosMigratorios(1,pajaros);
        assertEquals(3,idPajaroMasVisto);
    }

    @Test
    public void cuandoPasoPajarosConVariasRecurrencias_retornaElTipoMasRepetido(){
        pajaros.add(2);
        pajaros.add(8);
        pajaros.add(2);
        pajaros.add(8);
        pajaros.add(8);

        int idPajaroMasVisto = Ejercicio1.pajarosMigratorios(5,pajaros);
        assertEquals(8,idPajaroMasVisto);
    }

    @Test
    public void cuandoPasoPajarosConMismaCantidadOcurrencias_retornaElTipoMenor(){
        pajaros.add(2);
        pajaros.add(8);
        pajaros.add(2);
        pajaros.add(8);
        pajaros.add(1);

        int idPajaroMasVisto = Ejercicio1.pajarosMigratorios(5,pajaros);
        assertEquals(2,idPajaroMasVisto);
    }

}