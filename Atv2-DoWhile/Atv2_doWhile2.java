/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv2_dowhile2;

import java.util.Scanner;

/**
 *
 * @author baruc
 */
public class Atv2_doWhile2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        do {
            System.out.print("Insira a temperatura em Celsius (ou 0 para sair): ");
            celsius = scanner.nextDouble();

            if (celsius != 0) {
                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
            }

        }
        
        while (celsius != 0);
        System.out.println("Saindo do programa.");
        
    }
}
