package com.mycompany.jogofavswitch;

import java.util.Scanner;

public class JogoFavSwitch {
    public static void main(String[] agrs) {
        
    
            Scanner inUser=new Scanner(System.in);
  

    System.out.println("Por favor, digite um número de 1 a 5. ");
    int resp=inUser.nextInt();
    
            switch(resp){
            case 1:
                System.out.println("Você gosta de Minecraft?");
                break;
            case 2:
                System.out.println("Você gosta de FIFA?");
                break;
            case 3:
                System.out.println("Você gosta de Fortnite?");
                break;
            case 4:
                System.out.println("Você gosta de COD? (Call of Duty)");
                break;
            case 5:
                System.out.println("Você gosta de The Sims?");
                break;
            
            default:
                System.out.println("Seu jogo favorito não foi encontrado. "); 


    }          
    }
}
