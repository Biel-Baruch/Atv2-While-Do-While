/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv2_while4;

import java.util.Scanner;

/**
 *
 * @author baruc
 */
public class Atv2_While4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número inteiro positivo N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Por favor, insira um número positivo.");
        } else {
            System.out.println("Números pares de 1 a " + N + ":");
            int i = 1;
            
            while (i <= N) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
                i++;
                
            }
        }
    }
}
