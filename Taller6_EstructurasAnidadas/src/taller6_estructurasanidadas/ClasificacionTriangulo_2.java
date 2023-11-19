/*
Problema-2
Clasificación de un triángulo Dado tres valores que representan las longitudes de los lados de un triángulo, 
determinar su tipo. Las reglas son:
Si todos los lados son iguales, mostrar "Triángulo equilátero".
Si dos lados son iguales, mostrar "Triángulo isósceles".
Si todos los lados son diferentes, mostrar "Triángulo escaleno".
Si la suma de dos lados no es mayor que el tercer lado, mostrar "No es un triángulo". */
package taller6_estructurasanidadas;

import java.util.Scanner;

public class ClasificacionTriangulo_2 {

    public static void main(String[] args) {
        //Declaracion de variables
        double lado1, lado2, lado3, aux;
        Scanner tecla = new Scanner(System.in);
        // Entrada
        System.out.println("Ingrese el valor del lado 1: ");
        lado1 = tecla.nextDouble();
        System.out.println("Ingrese el valor del lado 2: ");
        lado2 = tecla.nextDouble();
        System.out.println("Ingrese el valor del lado 3 ");
        lado3 = tecla.nextDouble();
        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado3 + lado1 > lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("--------------------------");
                System.out.println("El triangulo es EQUILATERO");
            } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
                System.out.println("--------------------------");
                System.out.println("El triangulo es ISOSCELES");
            } else {
                System.out.println("--------------------------");
                System.out.println("El triangulo es ESCALENO");
            }
        } else {
            System.out.println("--------------------------");
            System.out.println("NO ES UN TRIANGULO");
        }
        tecla.close();
    }
}
