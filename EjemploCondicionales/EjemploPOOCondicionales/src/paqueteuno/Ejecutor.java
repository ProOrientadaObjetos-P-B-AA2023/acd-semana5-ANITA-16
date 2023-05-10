
package paqueteuno;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        // objeto que permite ingresar datos por teclado
        Scanner entrada = new Scanner(System.in);

        // varibles para almacenar valores ingresados por teclado
        int opcion;

        // Proceso de discriminación en función de la opción que 
        // selecciona el usuario
        System.out.println("Que tipo de hospital desea ingesar\nOpción 1"
                + "\nOpción 2\nOpción 3");
        opcion = entrada.nextInt();

        entrada.nextLine(); // limpiar el buffer 

        // Uso de condicionales compuestos
        if (opcion == 1) {
            System.out.println("Ingrese el nombre del hospital, el numeor de camas, numeor de doctores, y presupuesto");
            Hospital hosp1 = new Hospital(entrada.next(), entrada.nextInt(),entrada.nextInt(), entrada.nextDouble());
            System.out.println(hosp1);
            
        } else {
            if (opcion == 2) {
                // Ingreso de datos para el tipo seleccionado
                System.out.println("Ingrese el nombre del hospital, el numeor de camas, numeor de doctores, y presupuesto");
                Hospital hosp2 = new Hospital(entrada.next(), entrada.nextInt(),entrada.nextInt(), entrada.nextDouble());
                
                System.out.println(hosp2);
            } else {
                if (opcion == 3) {
                    System.out.println("Ingrese el nombre del hospital, el numero de camas, numero de doctores, y presupuesto");
                    Hospital hosp3 = new Hospital(entrada.next(), entrada.nextInt(),entrada.nextInt(), entrada.nextDouble());

                    System.out.println(hosp3);
                } else {
                    System.out.println("Opción fuera de rango");
                }
            }
            
        }

    }  

}
