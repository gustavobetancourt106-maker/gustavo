/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.fizzbuzz;

/**
 *
 * @author LEN
 */
public class FizzBuzz {

    // Método que recibe un número y devuelve un String
    public String evaluarNumero(int numero) {

        // Si el número es múltiplo de 3 y de 5
        if (numero % 3 == 0 && numero % 5 == 0) {
            return "fizzbuzz"; // retorna "fizzbuzz"
        } 
        // Si es múltiplo solo de 3
        else if (numero % 3 == 0) {
            return "fizz"; // retorna "fizz"
        } 
        // Si es múltiplo solo de 5
        else if (numero % 5 == 0) {
            return "buzz"; // retorna "buzz"
        } 
        // Si no es múltiplo de ninguno
        else {
            return String.valueOf(numero); // convierte el número a texto
        }
    }
}

