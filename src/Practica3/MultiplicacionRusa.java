package Practica3;

import java.math.BigInteger;

public class MultiplicacionRusa implements Multiplicacion {
    private final String nombreMetodo="Multiplicación Rusa";

    @Override
    public String nombreMetodo() {
        return nombreMetodo;
    }

    @Override
    public BigInteger multiplica(BigInteger n, BigInteger m) {
        BigInteger tupla [] = new BigInteger[2];
        if(n.compareTo(new BigInteger("1"))>=0){
            if (n.mod(new BigInteger("2"))!=BigInteger.ZERO){
                tupla[0] = n.divide(new BigInteger("2"));
                tupla[1] = m.multiply(new BigInteger("2"));
                return m.add(multiplica(tupla[0], tupla[1]));
            }
            else{
                tupla[0]=n.divide(new BigInteger("2"));
                tupla[1]=m.multiply(new BigInteger("2"));
                return multiplica(tupla[0], tupla[1]);
            }
        }
        return BigInteger.ZERO;
    }
}