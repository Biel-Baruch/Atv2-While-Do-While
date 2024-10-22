/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv2_while3;

import java.util.Scanner;

/**
 *
 * @author baruc
 */
public class Atv2_While3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 37; // Número previamente definido
        int palpite;
        int tentativas = 0;

        System.out.println("Adivinhe o número entre 1 e 100:");
        while (true) {
            palpite = scanner.nextInt();
            tentativas++;
            
            if (palpite == numeroSecreto) {
                System.out.println("Você acertou! O número era " + numeroSecreto + ".");
                System.out.println("Você fez " + tentativas + " tentativas.");
                break; // Sai do loop se o número estiver correto
            } 
            
            else if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else {
                System.out.println("Muito alto! Tente novamente.");
            }
        }
        
    }
}
