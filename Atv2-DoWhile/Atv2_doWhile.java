/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv2_dowhile;

import java.util.Scanner;

/**
 *
 * @author baruc
 */
public class Atv2_doWhile {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibe o menu
            System.out.println("Menu:");
            System.out.println("1. Adicionar");
            System.out.println("2. Remover");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu Adicionar.");
                    break;
                
                case 2:
                    System.out.println("Você escolheu Remover.");
                    break;
                
                case 3:
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        
        while (opcao != 3);
        
    }
}
