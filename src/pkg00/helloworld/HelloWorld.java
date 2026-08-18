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
import java.util.InputMismatchException;
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
        /*System.out.println("Affichage d'un message dans la console\nsur plusieurs lignes");
        
        Scanner sc = new Scanner(System.in);
        
        int monAge = 0;

        System.out.print("Quel est votre age ? : ");
        monAge = sc.nextInt();

        try {
            System.out.println("Vous avez " + monAge + " an(s)");
        } catch (InputMismatchException e) {
            System.out.println("Erreur : vous devez saisir un entier !");
            sc.nextLine(); // vider le buffer
        }
                      
        

        System.out.print("Saisir x : ");
        int x = sc.nextInt();

        System.out.print("Saisir y : ");
        int y = sc.nextInt();

        System.out.println("Avant permutation : x=" + x + " y=" + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("Après permutation : x=" + x + " y=" + y);
        
        
        
        String texte = "Bonjour";

        System.out.println(texte.getClass());
        System.out.println(((Object) texte).getClass().getSimpleName());*/
        
       /* Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un caractère : ");
        char c = sc.next().charAt(0);

        int code = (int) c;
        System.out.println("Caractère saisi : " + c);
        System.out.println("ASCII décimal     : " + code);
        System.out.println("ASCII hexadécimal : " + Integer.toHexString(code));
        System.out.println("ASCII binaire     : " + Integer.toBinaryString(code));*/
        
        int a = -21430, b = 4872;

        System.out.println("a+b = " + (a+b));
        System.out.println("a-b = " + (a-b));
        System.out.println("a*b = " + (a*b));
        System.out.println("a/b = " + (a/b));
        System.out.println("a%b = " + (a%b));
    }
    
   
}
