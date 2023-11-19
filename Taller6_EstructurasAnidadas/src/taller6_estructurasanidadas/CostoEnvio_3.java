/*
Problema-3
Costo de envío de paquetes. Un servicio de envío cobra diferentes tarifas según la región y el peso del paquete. 
Si el peso es menor de 5 kg y la región es "local", el costo es de $5. 
Si pesa entre 5 y 10 kg, el costo es de $10 para la región "nacional". 
Para cualquier otro caso, el costo es de $15.
 */
package taller6_estructurasanidadas;

import java.util.Scanner;

public class CostoEnvio_3 {

    public static void main(String[] args) {
        double peso, costoEnvio;
        String region, local, nacional;
        Scanner tecla = new Scanner(System.in);
        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = tecla.nextDouble();
        System.out.print("Ingrese la region (local/nacional): ");
        region = tecla.next();
        costoEnvio = 0;
        if (peso < 5 && region.equalsIgnoreCase("local")) {
            costoEnvio = 5;
        } else if (peso >= 5 && peso <= 10 && region.equalsIgnoreCase("nacional")) {
            costoEnvio = 10;
        } else {
            costoEnvio = 15;
        }
        System.out.println("----------------------------------");
        System.out.println("El costo de envio es: $" + costoEnvio);
        tecla.close();
    }
}
