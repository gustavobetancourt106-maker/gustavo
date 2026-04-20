/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.anagrama;

/**
 *
 * @author LEN
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // Se crea un objeto Scanner para leer lo que escribe el usuario
        Scanner scanner = new Scanner(System.in);

        // Se crea un objeto de la clase Anagrama
        Anagrama anagrama = new Anagrama();

        // Se pide al usuario la primera palabra
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = scanner.nextLine(); // Lee la palabra

        // Se pide la segunda palabra
        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = scanner.nextLine(); // Lee la palabra

        // Se evalúa si son anagramas
        if (anagrama.esAnagrama(palabra1, palabra2)) {
            System.out.println("Si es anagrama"); // Si es verdadero
        } else {
            System.out.println("No es anagrama"); // Si es falso
        }

        // Se cierra el Scanner
        scanner.close();
    }
}