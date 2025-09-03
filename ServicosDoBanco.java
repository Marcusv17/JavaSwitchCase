package com.mycompany.servicosdobanco;

import java.util.Scanner;

public class ServicosDoBanco {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    


    double saldo = 500;
try{
    System.out.print("Qual serviço você deseja? Digite de 1 a 4: ");
    int Serviço = scanner.nextInt();
    
    switch (Serviço) {
        case 1:
        System.out.println("Você deseja consultar seu saldo atual?");
        System.out.println("Seu saldo atual é de R$"+ saldo); 
        break;

        case 2:
        System.out.println("Você deseja sacar quanto dinheiro?");

        double saque = scanner.nextDouble();

        if (saque > saldo) {
        System.out.println("Não foi possível sacar esse dinheiro, verifique seu saldo novamente.");
        }else {
        System.out.println("Seu saldo após o saque é de R$"+ (saldo-saque));
        }
        break;

        case 3:
        System.out.println("Você deseja depositar quanto dinheiro?");

        double deposito = scanner.nextDouble();

        if (deposito <= 0) {
        System.out.println("Não foi possível realizar seu depósito, tente novamente com um valor maior que zero.");
        }else {
        System.out.println("Seu novo saldo é de R$"+ (saldo+deposito));
        }
        break;

        case 4:
        System.out.println("Você deseja encerrar com o atendimento?");
        break;
        
        default:
        System.out.println("Não possuímos esse serviço, digite um número de 1 a 4.");
        break;
        }
    
    }catch(Exception e) {
    System.out.println("Esse número não é válido, apenas números inteiros são aceitos.");
        
    }finally{
    System.out.println("Obrigado pela preferência!");
    }  
        }
    }