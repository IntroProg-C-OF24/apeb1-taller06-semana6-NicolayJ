/*
Problema-5
Determinar el tipo de operación matemática. Dado un número del 1 al 4 que representa una operación matemática básica 
(suma, resta, multiplicación, división), muestra el nombre de la operación correspondiente. 
Por ejemplo, si el usuario ingresa 1, debe mostrar "Suma"; si ingresa 2, debe mostrar "Resta", y así sucesivamente. 
 */
package taller6_estructurasanidadas;

import java.util.Scanner;

public class OperacionMatematica_5 {

    public static void main(String[] args) {
        int num;
        Scanner tecla = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 4");
        num = tecla.nextInt();
        String operacion;
        switch (num) {
            case 1:
                operacion = "SUMA";
                break;
            case 2:
                operacion = "RESTA";
                break;
            case 3:
                operacion = "MULTIPLICACION";
                break;
            case 4:
                operacion = "DIVISION";
                break;
            default:
                operacion = "Operacion no valida, ingrese nuevamente un numero";
                break;
        }
        System.out.println("--------------------------------------");
        System.out.println("La operacion correspondiente es " + operacion);
    }
}
