package org.example;

import java.util.ArrayList;
import java.util.Formattable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //NECESITO HACER UN LISTAD DE LOS PAISES SURAMERICANOS
        //PARA CADA PAIS NECESITO ALMACENAR EL NUMERO DE:
        //MEDALLAS DE ORO
        //MEDALLAS DE PLATA
        //MEDALLAS DE BRONCE

        //SUMAR EL NUMERO DE MEDALLAS DE CADA PAIS

        //INFORMAR CUAL ES EL PAIS CON MAS MEDALLAS

        // INFORMAR CUAL ES EL PAIS CON MENOS MEDALAS

        //TERMINAR SUMANDO EL TOTAL DE MEDALLAS DE LOS PAISES SURAMERICANOS

        //////////////////////////////////////////////////////////////

        ArrayList<String> paises=new ArrayList<>();
        ArrayList<Integer>medallas=new ArrayList<>();
        Scanner lea=new Scanner(System.in);
        System.out.println("***OLIMPICOS 2024***");
        for (int i=0; i<2; i++){
            String pais;
            int sumatoriaMedallas=0;
            System.out.print("Ingrese un pais: ");
            pais=lea.nextLine();
            paises.add(pais);

            //PIDIENDO LOS DATOS DE MEDALLAS DE CADA PAIS
            System.out.println("Digita el numero de medallas de oro de "+pais+":");
            int medallasOro=lea.nextInt();
            System.out.println("Digita el numero de medallas de plata de "+pais+":");
            int medallasPlata=lea.nextInt();
            System.out.println("Digita el numero de medallas de bronce de "+pais+":");
            int medallasBronce= lea.nextInt();
            sumatoriaMedallas=medallasOro+medallasPlata+medallasBronce;
            System.out.println(pais+" obtuvo en total: "+sumatoriaMedallas+" Medallas en Paris");

            lea.nextLine();

            medallas.add(sumatoriaMedallas);


        }
        //RECORRIENDO UN ARREGLO
        int paisMayor=medallas.get(0);

        for (Integer medalla:medallas){
            if (medalla>paisMayor){
                paisMayor=medalla;
            }
        }
        System.out.println("El pais con mas medallas obtuvo un total de "+paisMayor);
        //QUIERO PREGUNTAR CUAL ES EL CAJON INDICE DONDE SE GUARDO LA CANTIDAD DE MEDALLAS MAYOR

        int indiceGanador=medallas.indexOf((paisMayor));
        System.out.println("El indice ganador es el: "+indiceGanador);

        //QUIERO OBTENER EL VALOR QUE HAY DENTRO DE UN CAJON
        System.out.println("Asi pues, el pais ganador fue: "+paises.get(indiceGanador));

        /*PAIS MENOR MEDALLAS
        int paisMenor=medallas.get(1);

        for (Integer medalla:medallas){
            if (medalla<paisMenor){
                paisMenor=medalla;
            }
        }*/git 

    }
}