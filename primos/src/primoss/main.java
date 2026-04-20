/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primoss;

/**
 *
 * @author LEN
 */
public class main {

    public static void main(String[] args) {

        // Se crea un objeto de la clase Primo
        primp primo = new primp();

        // Bucle que recorre del 1 al 100
        for (int i = 1; i <= 100; i++) {

            // Verifica si el número es primo
            if (primo.esPrimo(i)) {

                // Si es primo, lo imprime
                System.out.println(i);
            }
        }
    }
}
    
