package Practica3;

import java.math.BigInteger;

public class Practica3 {

    public static void main(String[] args) {
        int[] v={6,10,555,8000,16000,320000};
        final int constante = 10;
        String imprimir = "------";
        float[] tiempo_suma=new float[3];
        float[] tiempo_rusa=new float [6];
        float[] tiempo_egipcia=new float[6];
        BigInteger[] resultado_suma=new BigInteger[3];
        BigInteger[] resultado_rusa=new BigInteger[3];
        BigInteger[] resultado_egipcia=new BigInteger[3];
        for(int i=0;i<3;i++){
            double antes=System.currentTimeMillis();
            resultado_suma[i]=new MultiplicacionSumasSucesivas().multiplica(
                    BigInteger.valueOf(v[i]), BigInteger.valueOf((constante)));
            double despues=System.currentTimeMillis();
            tiempo_suma[i]=(float)((despues-antes)/1000);
            antes=System.currentTimeMillis();
            resultado_rusa[i]=new MultiplicacionRusa().multiplica(
                    BigInteger.valueOf(v[i]),BigInteger.valueOf((constante)));
            despues=System.currentTimeMillis();
            tiempo_rusa[i]=(float)((despues-antes)/1000);
            antes=System.currentTimeMillis();
            resultado_egipcia[i]=new MultiplicacionEgipcia().multiplica(
                    BigInteger.valueOf(v[i]),BigInteger.valueOf((constante)));
            despues=System.currentTimeMillis();
            tiempo_egipcia[i]=(float)((despues-antes)/1000);
        }
        for(int i=3;i<6;i++){
            double antes=System.currentTimeMillis();
            new MultiplicacionRusa().multiplica(
                    BigInteger.valueOf(v[i]),BigInteger.valueOf((constante)));
            double despues=System.currentTimeMillis();
            tiempo_rusa[i]=(float)((despues-antes)/1000);
            antes=System.currentTimeMillis();
            new MultiplicacionEgipcia().multiplica(
                    BigInteger.valueOf(v[i]),BigInteger.valueOf((constante)));
            despues=System.currentTimeMillis();
            tiempo_egipcia[i]=(float)((despues-antes)/1000);
         }
         System.out.println("Tamaño de las ristras    Tiempo Sumas    Tiempo rusa    Tiempo Egipcia");
         for(int i=0;i<v.length;i++) {
            if(i>2){
              System.out.printf("%21d    %13s    %12f    %14f\n", 
                    v[i],imprimir,tiempo_rusa[i],tiempo_egipcia[i]);
                
            }else{
            System.out.printf("%21d    %13f    %12f    %14f\n", 
                    v[i], tiempo_suma[i],tiempo_rusa[i],tiempo_egipcia[i]);
            }
     
          }
          System.out.println("Tamaño de las ristras      Resultados Sumas      Resultados rusa      Resultados Egipcia");
          for(int i=0;i<3;i++) {
              System.out.printf("%21d    %13s    %12s    %14s\n", v[i],resultado_suma[i].toString(),
                      resultado_rusa[i].toString(),resultado_egipcia[i].toString());
          }
    }
}