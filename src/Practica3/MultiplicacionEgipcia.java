package Practica3;

import java.math.BigInteger;

public class MultiplicacionEgipcia implements Multiplicacion {
    private final String nombreMetodo="Multiplicación Egipcia";

    @Override
    public String nombreMetodo() {
        return nombreMetodo;
    }

    @Override
    public BigInteger multiplica(BigInteger n, BigInteger m) {
        BigInteger[] tupla=MultiplicacionEgipcia(n, m, new BigInteger("1"));
        return tupla[0];
    }
    private BigInteger[] MultiplicacionEgipcia(BigInteger n, BigInteger m, BigInteger doble1) {
        BigInteger[] tupla=new BigInteger[]{new BigInteger("0"),new BigInteger("0")};
        if(doble1.compareTo(m)==1)
            return tupla;
        if(doble1.compareTo(m)<=0){
            
        }
        return tupla;
    }
}