/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv2_dowhile3;

import java.util.Scanner;

/**
 *
 * @author baruc
 */
public class Atv2_doWhile3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Insira um número para iniciar a contagem regressiva: ");
        numero = scanner.nextInt();

        do {
        System.out.println(numero);
        numero--;
        } 
        
        while (numero > 0);
        System.out.println("Contagem regressiva finalizada!");
        
    }
}
