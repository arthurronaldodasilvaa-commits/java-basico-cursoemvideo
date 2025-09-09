/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author thurg
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.print("Qual ano você nasceu: ");
        int nasc = t.nextInt();
        int idade = 2025 - nasc;
        System.out.println("Você tem " + idade + " anos..");
        if (idade >= 18){
            System.out.println("Maior de idade!");
        }
        else{
            System.out.println("Menor de idade!");
        }
        
    }
    
}
