package com.mycompany.meiodetransporte;

import java.util.Scanner;

public class MeioDeTransporte {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
  
try{
    System.out.print("Qual meio de transporte você irá utilizar?: ");
    int Passagem = scanner.nextInt();
    
    String tipoPassagem = "";
    double valor = 0;
    
    switch (Passagem) {
        case 1:
        tipoPassagem = "Ônibus Urbano";
        valor = 4.40;
        System.out.println("Você deseja comprar a passagem para o Ônibus Urbano?");
        break;

        case 2:
        tipoPassagem = "Metrô";
        valor = 5.00;
        System.out.println("Você deseja comprar a passagem para o Metrô?");
        break;

        case 3:
        tipoPassagem = "Trem Intermunicipal";
        valor = 6.50;
        System.out.println("Você deseja comprar a passagem para o Trem Intermunicipal?");
        break;

        case 4:
        tipoPassagem = "Ônibus Rodoviário";
        valor = 12.00;
        System.out.println("Você deseja comprar a passagem para o Ônibus Rodoviário?");
        break;
        
        default:
        System.out.println("Esse número é inválido.");
        break;
        }
    
        System.out.print("Quantas passagens você precisa?: ");
        int quantidade = scanner.nextInt();
 
    
        double valorFinal = quantidade*valor;
        System.out.println("Você precisa pagar R$"+ valorFinal);
    
    }catch(Exception e) {
    System.out.println("Esse valor não é válido, tente novamente com outro valor.");
        
    }finally{
    System.out.println("Obrigado pela prefêrencia!.");
    }
   
        
        }
    }