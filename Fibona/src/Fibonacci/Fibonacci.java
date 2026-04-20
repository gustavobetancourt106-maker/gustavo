/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fibonacci;

/**
 *
 * @author LEN
 */
public class Fibonacci {

    
    // Método que imprime los primeros n números de Fibonacci
    public void generarFibonacci(int n) {

        int a = 0; // Primer número (empieza en 0)
        int b = 1; // Segundo número

        // Recorre n veces
        for (int i = 0; i < n; i++) {

            // Imprime el valor actual (ANTES de modificarlo)
            System.out.println(a);

            // Calcula el siguiente número
            int siguiente = a + b;

            // Actualiza los valores
            a = b;
            b = siguiente;
        }
    }
}