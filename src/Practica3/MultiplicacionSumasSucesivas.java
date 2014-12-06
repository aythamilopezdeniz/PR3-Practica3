package Practica3;

import java.math.BigInteger;

public class MultiplicacionSumasSucesivas implements Multiplicacion {
    private final String nombreMetodo="Multiplicación Sumas Sucesivas";

    @Override
    public String nombreMetodo() {
        return nombreMetodo;
    }

    @Override
    public BigInteger multiplica(BigInteger n, BigInteger m) {
        if (n.compareTo(BigInteger.ONE)==1)
            return m.add(multiplica(n.subtract(BigInteger.ONE), m));
        else if (n.compareTo(BigInteger.ZERO)==0)
            return BigInteger.ZERO;
        else
            return m;
    }
}