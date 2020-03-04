package com.adrian.calculadorabasica;

import java.util.Scanner;

public class CalculadoraBasica {
    
    public static void main(String[] args){
        int opcion, numero1, numero2, resultado;
        boolean repetir;
        do{
            numero1 = 0;
            numero2 = 0;
            resultado = 0;
            opcion = 0;
            repetir = false;
            Scanner escaner = new Scanner(System.in);
            System.out.println("Calculadora básica\n");
            System.out.println("Escriba el número 1: ");
            numero1 = escaner.nextInt();
            System.out.println("Escriba el número 2: ");
            numero2 = escaner.nextInt();
            System.out.println("Elija una opción: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("Opción escogida: ");

            opcion = escaner.nextInt();
            
            /*
            if (opcion < 1 && opcion > 4){
                System.out.println("Opción no válida.");
                repetir = true;
            } else {
                if (opcion == 1){
                    resultado = numero1+numero2;
                }
                if (opcion == 2){
                    resultado = numero1-numero2;
                }
                if (opcion == 3){
                    resultado = numero1*numero2;
                }
                if (opcion == 4){
                    resultado = numero1/numero2;
                }
            }
            */
            
            switch (opcion){
                case 1: resultado = numero1+numero2; break;
                case 2: resultado = numero1-numero2; break;
                case 3: resultado = numero1*numero2; break;
                case 4: resultado = numero1/numero2; break;
                default: System.out.println("Opción no válida.");
                        repetir = true;
                        break;
            }
            if (!repetir){
                System.out.println("El resultado de la operación es: "+resultado);
                System.out.println("¿Calcular otro numero? s/n : ");
                if ("s".equals(escaner.next())){
                repetir = true;
                }
            }
        }while(repetir == true);
    }
}
