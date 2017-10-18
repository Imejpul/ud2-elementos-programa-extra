package com.imejpul;

public class Main {

    public static void main(String[] args) {

        //Ejemplo
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }

        System.out.println("");

        System.out.println("----------");
        //primera figura
        for (int i = 0; i < 5; i++) {
            System.out.print("* ");
        }

        System.out.println("");

        System.out.println("----------");
        //segunda figura
        int contador = 5;

        while (contador > 0) {

            for (int i = 0; i < 5; i++) {
                System.out.print("*");

            }

            System.out.println("");
            contador--;
        }

        System.out.println("----------");
        //tercera figura
        contador = 5;
        int cantidadFigurasLinea = 1;

        while (contador > 0) {

            for (int i = 0; i < cantidadFigurasLinea; i++) {
                System.out.print("*");

            }

            cantidadFigurasLinea++;
            System.out.println("");
            contador--;
        }

        System.out.println("----------");
        //cuarta figura
        contador = 5;
        cantidadFigurasLinea = 5;

        while (contador > 0) {

            for (int i = 0; i < cantidadFigurasLinea; i++) {
                System.out.print("*");

            }

            cantidadFigurasLinea--;
            System.out.println("");
            contador--;
        }

        System.out.println("----------");
        //quinta figura
        contador = 5;
        cantidadFigurasLinea = 1;
        int cantidadEspacios = 0;

        while (contador > 0) {

            for (int i = 0; i < cantidadFigurasLinea; i++) {
                for(int cont = 0; cont < cantidadEspacios; cont++){
                    System.out.print(" ");
                }
                cantidadEspacios++;
                System.out.print("*");

            }

            System.out.println("");
            contador--;
        }

        System.out.println("----------");
        //sexta figura
        contador = 0;

        while (contador < 5){

            if ( (contador > 0) && (contador < 4) ){
                System.out.print("*" + "   " + "*");

            } else {

                for (int i = 0; i < 5; i++) {
                    System.out.print("*");
                }
            }

            System.out.println("");
            contador++;

        }






    }
}
