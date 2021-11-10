package com.fiorillo;

public class Ejercicio3 {
    public static String viajarEnElTiempo(int anio, int dias){
        int[] meses = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        int mes=0;
        int dia=0;
        int acumulador = 0;
        int acumuladorAnterior;

        boolean esAnioTransicion = anio == 1918;

        if(esBisiesto(anio) && !esAnioTransicion){
            meses[2] = 29;
        }else if(esAnioTransicion){
            meses[2] = 15;
        }

        for (int i = 1; i <= 12; i++) {

            acumuladorAnterior = acumulador;
            acumulador = acumulador + meses[i];

            if (acumulador >= dias) {
                mes = i;
                if (mes == 1) {
                    dia = dias;
                } else {
                    dia = dias - acumuladorAnterior;
                    if(esAnioTransicion && mes == 2){
                        dia += 13;
                    }
                }
                break;
            }
        }

        return formatearNumero(dia)+ "."+formatearNumero(mes)+"."+anio;
    }

    private static boolean esBisiesto(int anio){

        if(anio < 1918){
            return anio % 4 == 0;
        }else{
            return (anio % 400 == 0) || (anio % 4 == 0 && (anio % 100 != 0));
        }

    }

    private static String formatearNumero(int numero){
        if(numero<10){
            return "0"+numero;
        } else {
            return String.valueOf(numero);
        }
    }
}
