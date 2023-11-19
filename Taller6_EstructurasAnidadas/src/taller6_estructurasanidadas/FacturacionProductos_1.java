/*
Problema-1
Facturación de 2 productos: La empresa Amazon.com le contrata como desarrollador de Sistemas Informáticos 
para programar su sistema de compras online, el cual calcule el precio total de la compra para un cliente. 
Para ello, se necesita utilizar estructuras secuenciales y de selección (if simple, doble y/o anidadas), 
sin aplicar ciclos repetitivos.

Requisitos:
1. La empresa inicialmente venderá solo 2 tipos de productos distintos, a costos variantes.
2. Al costo total de la factura, se debe incluir los gastos por concepto de transporte/envío del paquete, 
del cual no se aplican ningún tipo de descuentos o impuestos dada la excepción descrita en el punto 
3. El objetivo es presentar al usuario los detalles de su compra: costos, impuestos, descuentos, 
monto final dadas las siguientes condiciones: 
a. Si el subtotal de la compra (sin descuentos o gastos de envío), 
supera los $1000, se le otorga un 20% de descuento; y si es al menos los $1000 el descuento es como mínimo 5%. 
b. Adicional, si la compra es mayor a $5000, el envío será gratuito. 
c. El IVA del 10% se debe aplicar a todos los artículos antes de agregar cualquier tipo de descuesto o promoción.
4. A continuación, algunos ejemplos de una factura modelo:
 */
package taller6_estructurasanidadas;

import java.util.Scanner;

public class FacturacionProductos_1 {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int cantidadIpad, cantidadIphone, precioIpad, precioIphone, envio;
        double subtotal, iva, subtotalIva, descuento, total, montoFactura;
        System.out.println("Ingrese la cantidad de Ipad que va a adquirir: ");
        cantidadIpad = tecla.nextInt();
        System.out.println("Ingrese el precio de Ipad a adquirir:");
        precioIpad = tecla.nextInt();
        System.out.println("Ingrese la cantidad de Iphone que va a adquirir: ");
        cantidadIphone = tecla.nextInt();
        System.out.println("Ingrese el precio del Iphone a adquirir:");
        precioIphone = tecla.nextInt();
        System.out.println("Ingrese el gasto de envio: ");
        envio = tecla.nextInt();
        int totalPrecioIpad = cantidadIpad * precioIpad;
        int totalPrecioIphone = cantidadIphone * precioIphone;
        subtotal = totalPrecioIpad + totalPrecioIphone;
        iva = subtotal * 0.12;
        subtotalIva = subtotal + iva;
        if (subtotalIva > 1000) {
            descuento = subtotalIva * 0.2;
        } else {
            descuento = subtotalIva * 0.05;
        }
        if (subtotalIva > 5000) {
            envio = 0; // Envío gratuito
        }
        total = subtotalIva - descuento + envio;
        montoFactura = subtotalIva - descuento + envio;
        System.out.println("-----------------------------------------");
        System.out.println("El precio total del Ipad es: " + totalPrecioIpad);
        System.out.println("El precio total del Iphone es: " + totalPrecioIphone);
        System.out.println("El Subtotal es de: " + subtotal);
        System.out.println("El IVA tiene un total de: " + iva);
        System.out.println("El SubTotal + IVA es: " + subtotalIva);
        System.out.println("El total con descuento es de: " + descuento);
        System.out.println("Gastos de envio es de: " + envio);
        System.out.println("EL MONTO FACTURA ES DE: " + montoFactura);
        tecla.close();
    }
}
