/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complejo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Prueba {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float parte_real;
        float parte_imaginaria;
        int aux = 0;
        Complejo Ejerc1;
        Complejo Ejerc2;
        Complejo respuesta;

        System.out.println("*******Bienvenido al Sistema de Operciones Aritmetica*****\n");
        
        do {
        System.out.println("Elija una operacion:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3.Salir");
        System.out.printf("Ingrese el numero de la Opcion: ");
        aux = input.nextInt();
            if (aux == 1) {
               
                System.out.println("ingrese el primer valor");
                parte_real = input.nextFloat();

                System.out.println("ingrese el segundo valor");
                parte_imaginaria = input.nextFloat();

                Ejerc1 = new Complejo(parte_real, parte_imaginaria);

                System.out.println("ingrese el primer valor");
                parte_real = input.nextFloat();

                System.out.println("ingrese el segundo valor");
                parte_imaginaria = input.nextFloat();

                Ejerc2 = new Complejo(parte_real, parte_imaginaria);

                respuesta = Ejerc1.Sumar(Ejerc2);

                System.out.printf("La suma  %s\n", respuesta.toFloatString());
            } else if (aux == 2) {

                System.out.println("ingrese el primer valor");
                parte_real = input.nextFloat();

                System.out.println("ingrese el segundo valor");
                parte_imaginaria = input.nextFloat();

                Ejerc1 = new Complejo(parte_real, parte_imaginaria);

                System.out.println("ingrese el primer valor");
                parte_real = input.nextFloat();

                System.out.println("ingrese el segundo valor");
                parte_imaginaria = input.nextFloat();

                Ejerc2 = new Complejo(parte_real, parte_imaginaria);

                respuesta = Ejerc2.Restar(Ejerc1);
                System.out.printf("La resta %s\n", respuesta.toFloatString());
            }else if(aux > 3){
                System.out.println("\nIngrese un opcion correcta\n");
            }
        } while (aux != 3);

    }
}
