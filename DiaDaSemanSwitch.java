package com.mycompany.diadasemanswitch;

import java.util.Scanner;

public class DiaDaSemanSwitch {
    public static void main(String[] agrs) {
        
    
            Scanner inUser=new Scanner(System.in);
                System.out.print("Por favor, digite um número de 1 a 7: ");
    int diaSem = inUser.nextInt();
    
    switch (diaSem) {
        case 1:
            System.out.println("Estamos num domingo.");
        break;

        case 2:
            System.out.println("Estamos numa segunda-feira.");
        break;

        case 3:
            System.out.println("Estamos numa terça-feira.");
        break;

        case 4:
            System.out.println("Estamos numa quarta-feira.");
        break;

        case 5:
            System.out.println("Estamos numa quinta-feira.");
        break;

        case 6:
            System.out.println("Estamos numa sexta-feira.");
        break;
        
        case 7:
            System.out.println("Estamos num sábado");
        break;

        default:
            System.out.println("Esse dia da semana não existe.");
}          
    }
}