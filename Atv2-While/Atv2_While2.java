/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv2_while2;

import java.util.Scanner;

/**
 *
 * @author baruc
 */
public class Atv2_While2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira um número para ver a tabuada: ");
        int numero = scanner.nextInt();
        int i = 1;

        while (i <= 10) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++;

        }
        
    }
}
