/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practice;

import java.util.Scanner;

public class Practice {

    private int[] numeros = new int[10]; // Arreglo para guardar hasta 10 números
    private int cantidad = 0;            // Variable inicilaizada en 0 para guardar la cantidad de numeros 

    // Agrega un numero al arreglo
    public void agregarNumero(int numero) {
        if (cantidad < numeros.length) {
            numeros[cantidad++] = numero;
        } else {
            System.out.println("Se ha alcanzado el límite de 10 números.");
        }
    }

    // Calcula la suma de los numeros ingresados
    public int calcularSuma() {
        int suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma += numeros[i];
        }
        return suma;
    }

    // Calcula el promedio de los numeros guardados que se guardaron
    public double calcularPromedio() {
        return cantidad == 0 ? 0 : (double) calcularSuma() / cantidad;
    }

    //El metodo prinicpal main//
    public static void main(String[] args) {
        Practice calculadora = new Practice();  //Crear un objeto de tipo clase llamado calculadora//
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos números ingresará? (entre 1-10): ");
        int totalNumeros = scanner.nextInt();   //Variables con nombres descriptivos//

        for (int i = 0; i < totalNumeros && i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            calculadora.agregarNumero(numero);
        }

        System.out.println("Suma = " + calculadora.calcularSuma());
        System.out.println("Promedio = " + calculadora.calcularPromedio());

        scanner.close();
    }
}
