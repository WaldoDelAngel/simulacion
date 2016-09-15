/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_Congruenciales;

import java.util.Scanner;

/**
 *
 * @author waldo
 */
public class mixto {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int x = 0, a = 0, c = 0, m = 0, controlPeriodo = 0;
        boolean band = true;

        System.err.println("************ GENERADOR CONGRUENCIAL MIXTO ************"
                + "\n\tIntroduce los valores que se te piden\n");
        
        // Lectura de datos (Validamos la entrada de datos en consola)
        System.out.print("La semilla 'x': ");
        do {            
            try {
                x = Leer.nextInt();
                band = false;
            } catch (Exception e) {
                Leer.nextLine();
                System.err.print("Dato inválido!\nIntroduce nuevamente 'x': ");
            }
        } while (band);

        band = true;
        System.out.print("El multiplicador 'a': ");
        do {            
            try {
                a = Leer.nextInt();
                band = false;
            } catch (Exception e) {
                Leer.nextLine();
                System.err.print("Dato inválido!\nIntroduce nuevamente 'a': ");
            }
        } while (band);

        band = true;
        System.out.print("La constante aditiva 'c': ");
        do {            
            try {
                c = Leer.nextInt();
                band = false;
            } catch (Exception e) {
                Leer.nextLine();
                System.err.print("Dato inválido!\nIntroduce nuevamente 'c': ");
            }
        } while (band);

        band = true;
        System.out.print("El módulo 'm': ");
        do {            
            try {
                m = Leer.nextInt();
                band = false;
            } catch (Exception e) {
                Leer.nextLine();
                System.err.print("Dato inválido!\nIntroduce nuevamente 'm': ");
            }
        } while (band);

        band = true;
        System.out.print("El número de iteraciones deseadas: ");
        do {            
            try {
                controlPeriodo = Leer.nextInt();
                band = false;
            } catch (Exception e) {
                Leer.nextLine();
                System.err.print("Dato inválido!\nIntroduce nuevamente el número de iteraciones: ");
            }
        } while (band);
        
        // Comprobamos que los datos iniciales sean los correctos
        if ((m > x && m > a && m > c) && (x > 0 && a > 0 && c > 0)) {

            // Imprimimos las columnas de la tabla de los números pseudoaleatorios
            System.out.println("---------------------------------------------------");
            System.out.println("n\t" + "Xn\t" + "[" + a + "(Xn)+" + c
                    + "]/" + m + "\t" + "Xn+1\t" + "# uniformes");
            System.out.println("---------------------------------------------------\n");

            // Imprimimos los resultados de la tabla
            System.out.println(Proceso.resolucion(x, a, c, m, 0, "", controlPeriodo));
        }
    }

}
