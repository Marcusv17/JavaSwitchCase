package com.mycompany.faixaetaria;

import java.util.Scanner;

public class FaixaEtaria {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
   
    
try{
    System.out.println("Escolha uma das faixas etárias:"); 
    System.out.println("1: Criança (0 a 12)");
    System.out.println("2: Adolescente (13 a 17)");
    System.out.println("3: Adulto (18 a 59)");
    System.out.println("4: Idoso (60+)");
    
    int opcao = scanner.nextInt();
    
    System.out.println();

    System.out.print("Digite sua idade: ");
    int idade = scanner.nextInt();
    
    System.out.println();

switch (opcao) {
        case 1:
        if (idade <= 12) {
        System.out.println("Você é uma criança. Você está na faixa etária infantil.");
        }else {
        System.out.println("A idade digitada não faz parte da faixa etária escolhida.");
        }
        break;

        case 2:
        if (idade >= 13 && idade <= 17) {
            System.out.println("Você é um adolescente. Você está na faixa etária juvenil.");
        }else {
            System.out.println("A idade digitada não faz parte da faixa escolhida.");
        }
        break;

        case 3:
        if (idade >= 18 && idade <= 59) {
            System.out.println("Você é um adulto. Você está na faixa etária adulta.");
        }else {
            System.out.println("A idade digitada não faz parte da faixa escolhida.");
        }
        break;

        case 4:
        if (idade >= 60) {
            System.out.println("Você é um idoso. Você está na faixa etária idosa.");
        }else {
            System.out.println("A idade digitada não faz parte da faixa escolhida.");
        }
        break;

        default:
        System.out.println("Essa opção não existe. Digite de 1 a 4.");
        break;
        }

    }catch(Exception e) {
    System.out.println("Valor inválido.");
        
    }finally{
    scanner.close();
    System.out.println("Obrigado pela preferência!");
    }
        
        }
    }
