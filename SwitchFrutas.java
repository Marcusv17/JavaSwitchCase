package com.mycompany.switchfrutas;

import java.util.Scanner;

public class SwitchFrutas {
    public static void main(String[] agrs) {
        
    
            Scanner inUser=new Scanner(System.in);
    System.out.println("Qual fruta você irá escolher? ");
    int resposta=inUser.nextInt();
    
            switch(resposta){
            case 1:
                System.out.println("Maça");
                break;
            case 2:
                System.out.println("Banana");
                break;
            case 3:
                System.out.println("Laranja");
                break;
            case 99:
                System.out.println("Parabéns! Você achou a fruta secreta Abacaxi!");
                break;
            
            default:
                System.out.println("Valor de entrada invalido "); 
    }          
    }
}