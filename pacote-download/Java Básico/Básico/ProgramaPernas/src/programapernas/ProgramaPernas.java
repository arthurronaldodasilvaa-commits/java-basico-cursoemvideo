/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author thurg
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas pernas? ");
        int perna = tec.nextInt();
        String tipo;
        System.out.print("Isso é um(a) ");
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        
   /* OU VOCÊ PODE USAR TAMBÉM ASSIM!
    *    tipo = switch (perna) {
    *        case 1 -> "Saci";
    *        case 2 -> "Bípede";
    *        case 3 -> "Tripé";
    *        case 4 -> "Quadrúpede";
    *        case 6 -> "Aranha";
    *        default -> "ET";
    *    };
    */
        
        System.out.println(tipo);
    }
    
}
