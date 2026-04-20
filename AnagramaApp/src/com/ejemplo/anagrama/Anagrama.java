/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.anagrama;

/**
 *
 * @author LEN
 */
import java.util.Arrays;
public class Anagrama {
    // Método que recibe dos palabras y devuelve true o false
    public boolean esAnagrama(String palabra1, String palabra2) {

        // Convierte ambas palabras a minúsculas
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();

        // Si son exactamente iguales, no es anagrama
        if (palabra1.equals(palabra2)) {
            return false;
        }

        // Convierte las palabras en arreglos de caracteres
        char[] arr1 = palabra1.toCharArray();
        char[] arr2 = palabra2.toCharArray();

        // Ordena los arreglos alfabéticamente
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compara si los arreglos son iguales
        return Arrays.equals(arr1, arr2);
    }
}