package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        Random r = new Random();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Introduzca número de apuestas: ");

        int apuestas = Integer.parseInt(br.readLine());

        int contador = 1;

        while (contador < (apuestas + 1)) {

            int eleccionUno;
            int eleccionDos;
            int eleccionTres;
            int eleccionCuatro;
            int eleccionCinco;


            final int LIMITE_NUM = 50;

            //-------------------------Números--------------------------------------

            eleccionUno = r.nextInt(LIMITE_NUM) + 1;

            do {

                eleccionDos = r.nextInt(LIMITE_NUM) + 1;

            } while (eleccionDos == eleccionUno);

            do {

                eleccionTres = r.nextInt(LIMITE_NUM) + 1;

            } while ((eleccionTres == eleccionUno) || (eleccionTres == eleccionDos));

            do {

                eleccionCuatro = r.nextInt(LIMITE_NUM) + 1;

            }
            while ((eleccionCuatro == eleccionUno) || (eleccionCuatro == eleccionDos) || (eleccionCuatro == eleccionTres));

            do {

                eleccionCinco = r.nextInt(LIMITE_NUM) + 1;

            }
            while ((eleccionCinco == eleccionUno) || (eleccionCinco == eleccionDos) || (eleccionCinco == eleccionTres) || (eleccionCinco == eleccionCuatro));

            System.out.println("----------Apuesta " + contador + "----------");
            System.out.println(eleccionUno + " - " + eleccionDos + " - " + eleccionTres + " - " + eleccionCuatro + " - " + eleccionCinco);


            //-------------------------Estrellas-------------------------------------

            int estrellaUno;
            int estrellaDos;
            final int LIMITE_STAR = 12;

            estrellaUno = r.nextInt(LIMITE_STAR) + 1;

            do {

                estrellaDos = r.nextInt(LIMITE_STAR) + 1;

            } while (estrellaDos == estrellaUno);

            System.out.println("Estrellas: " + estrellaUno + " - " + estrellaDos);

            //----------------------------------------------------------------------

            contador++;

        }


    }
}
