package com.jsps.pooexcepciones.ejemplo;

import javax.swing.*;

public class MainExcepciones {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        String n = JOptionPane.showInputDialog("Ingrese n: ");
        String d = JOptionPane.showInputDialog("Ingrese d: ");

        try {
            double division = cal.dividir(n,d);
            System.out.println(division);
        } catch(FormatoNumException fne){
            System.err.println("Se detecto una excepción: ingrese un valor numérico: " + fne.getMessage());
            fne.printStackTrace(System.out); //Traza completa que especifica donde ocurre/lanza la excepción.
        }
        catch (Div0Exception ae) {
            System.err.println("Error no se puede dividir por zero: " + ae.getMessage());
            main(args);
        } finally {
            System.out.println("Estructura opcional, el código se ejecuta siempre independiente de si se captura o no la excepción");
            System.out.println("Cerrar un archivo, cerrar conexión a la base de datos, etc...");
        }
        System.out.println("Continuar con el flujo de la aplicación");
    }
}