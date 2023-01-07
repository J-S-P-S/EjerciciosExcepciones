package com.jsps.pooexcepciones.ejemplo;

public class Calculadora {

    public double dividir(int n, int d) throws Div0Exception {
        if(d == 0){
            throw new Div0Exception("No se puede dividir por zero");
        }
        return n / (double) d;
    }

    public double dividir(String n, String d)
            throws Div0Exception, FormatoNumException {
        try{
            int num = Integer.parseInt(n);
            int div = Integer.parseInt(d);
            return this.dividir(num,div);
        }catch (NumberFormatException e){
            throw new FormatoNumException("Debe ingresar un número en el numerador y divisor");
        }
    }

}