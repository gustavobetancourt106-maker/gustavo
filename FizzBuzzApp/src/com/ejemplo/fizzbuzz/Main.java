/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.fizzbuzz;

/**
 *
 * @author LEN
 */
public class Main {

    public static void main(String[] args) {

        // Se crea un objeto de la clase FizzBuzz
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Ciclo que va del 1 al 100
        for (int numero = 1; numero <= 100; numero++) {

            // Se llama al método evaluarNumero y se imprime el resultado
            System.out.println(fizzBuzz.evaluarNumero(numero));
        }
    }
}
