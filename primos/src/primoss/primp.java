/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primoss;

/**
 *
 * @author LEN
 */
public class primp {

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {

        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }

        // Recorre desde 2 hasta el número - 1
        for (int i = 2; i < numero; i++) {

            // Si el número es divisible entre i
            if (numero % i == 0) {
                return false; // No es primo
            }
        }

        // Si no tuvo divisores, es primo
        return true;
    }
}

