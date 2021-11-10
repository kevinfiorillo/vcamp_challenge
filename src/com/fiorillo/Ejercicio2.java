package com.fiorillo;

public class Ejercicio2 {
    public static int[] redondearNota(int[] notas){
        for (int i = 0; i < notas.length; i++) {
            notas[i] = redondearUnaNota(notas[i]);
        }
        return notas;
    }


    public static int redondearUnaNota(int nota) {
        if(nota<38){
            return nota;
        }else{
            int diferencia = 5 - (nota % 5);
            if(diferencia < 3){
                return nota + diferencia;
            }else{
                return nota;
            }
        }
    }


}
