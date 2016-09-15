/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_Congruenciales;

/**
 *
 * @author waldo
 */
public class Proceso {

    /**
     * Generador congruencial mixto. Método que resuelve la relación de
     * recurrencia xn+1 = [a(xn) + c] mod m.
     *
     * @param x La semilla (x > 0).
     * @param a El multiplicador (a > 0).
     * @param c Constante aditiva (c > 0).
     * @param m El módulo (m > x && m > a && m > c).
     * @param n Contador para el método recursivo.
     * @param var Se almacena los datos generados con un formato predeterminado.
     * @param controlPeriodo Permite maximizar o minimizar el periodo del generador.
     * @return Retorna una tabla de números pseudoaleatorios.
     */
    public static String resolucion(int x, int a, int c, int m, int n, String var, int controlPeriodo) {
        if (n < m && n < controlPeriodo) {
            // Se almacena en var desde la columna 'n' hasta (ax + c) % m.
            var += n + "\t" + x + "\t" + (((a * x) + c) / m) + " + "
                    + (((a * x) + c) % m) + "/" + m;

            // Se calcula la relación de recurrencia.
            x = ((a * x) + c) % m;

            // En var se almacenan Xn + 1 y el número uniforme correpondiente.
            var += "\t\t" + x + "\t" + x + "/" + m + "\n";

            // Se incrementa n en uno.
            n++;

            // Se llama a la misma función.
            return resolucion(x, a, c, m, n, var, controlPeriodo);
        } else {
            // Retorna la variable var cuando el periodo
            // del generador haya concluido.
            return var;
        }
    }
}



// (n < m) && (n < ControlDelPeriodo)
// (0 < 8) && (0 < 10)
// ...
// (7 < 8) && (7 < 10)
// (8 < 8) && (8 < 10)
