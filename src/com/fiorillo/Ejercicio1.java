package com.fiorillo;

import java.util.HashMap;
import java.util.List;

public class Ejercicio1 {

    public static int pajarosMigratorios(int cantidadPajaros, List<Integer> arregloPajaros){

        int idMasRepeticiones = -1;
        int maxTiposPajaros = -1;


        HashMap<Integer,Integer> contador = new HashMap<Integer,Integer>(cantidadPajaros);

        for (int tipo :
                arregloPajaros) {
            if(!contador.containsKey(tipo)){
                contador.put(tipo,1);
            }else{
                contador.put(tipo, contador.get(tipo) + 1);
            }
            if(contador.get(tipo) > maxTiposPajaros){
                maxTiposPajaros = contador.get(tipo);
                idMasRepeticiones = tipo;
            }else if(contador.get(tipo) == maxTiposPajaros && tipo < idMasRepeticiones ){
                idMasRepeticiones = tipo;
            }
        }
        return idMasRepeticiones;

    }

}
