/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv2_dowhile4;

import java.util.Scanner;

/**
 *
 * @author baruc
 */
public class Atv2_doWhile4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contadorImpares = 0;

        do {
        System.out.print("Insira um número inteiro (0 para sair): ");
        numero = scanner.nextInt();

        if (numero != 0 && numero % 2 != 0) {
                contadorImpares++;
            }

        } 
        
        while (numero != 0);
        System.out.println("Você inseriu " + contadorImpares + " números ímpares.");
        
    }
}
