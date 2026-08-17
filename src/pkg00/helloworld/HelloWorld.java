/**
 * Classe contenant le point d'entrée du programme pour des exemples simples.
 *
 * Cette classe illustre un HelloWorld minimal ainsi qu'une méthode
 * de conversion simple.
 *
 * @file HelloWorld.java
 * @author PV
 * @version 0.0
 * @since 17/08/2026
 * @see pkg00.helloworld.HelloWorld#test(float)
 */
package pkg00.helloworld;
import java.util.Scanner;
/**
 * Classe principale contenant la méthode main.
 *
 * @author pierre
 */
public class HelloWorld {

    /**
     * Point d'entrée du programme.
     *
     * @param args Arguments de la ligne de commande. 
     */
    public static void main(String[] args) {
        System.out.println("Affichage d'un message dans la console\nsur plusieurs lignes");
        
        Scanner sc = new Scanner(System.in);
        int monAge = 0;

        System.out.print("Quel est votre age ? : ");
        monAge = sc.nextInt();

        System.out.println("Vous avez " + monAge + " an(s)");
        
        
    }
    
   
}
