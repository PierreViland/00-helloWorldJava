/**
 * Classe contenant le point d'entrée du programme pour des exemples simples.
 *
 * Cette classe illustre un HelloWorld minimal ainsi qu'une méthode
 * de conversion simple.
 *
 * @file HelloWorld.java
 * @author PV
 * @version 0.0
 * @since 17/08/2026 PV
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
     * Point d'entrée du programme. C'est la méthode main
     *
     * @param args Arguments de la ligne de commande. 
     */
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        
        System.out.print("x : ");
        int x = sc.nextInt();
        
        System.out.print("y : ");
        int y = sc.nextInt();
        
        System.out.println("x " +x +"  y: " +y );
        
        int z =0;
        
        z=x;
        x=y;
        y=z;
        
        System.out.println("x " +x +"  y: " +y );*/
        
        /*Scanner sc = new Scanner(System.in);
        
        System.out.print("a : ");
        float a = sc.nextFloat();
        
        System.out.print("b : ");
        float b = sc.nextFloat();
        float resultat = (a+b)*2;
        
        System.out.print("Resultat " + resultat);*/
        Scanner sc = new Scanner(System.in);
        int opt;
        
        do{
           System.out.print("Option : ");
           opt = sc.nextInt() ;
           
           if(opt ==1){
               System.out.println("Bonjour");
           }
           else if(opt ==2){
               System.out.println("aU REVOIR");
           }
           
           
        }while(opt!=0);
           
        
        
    }
    
}
