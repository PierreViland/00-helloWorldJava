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
        System.out.println("Hello World by PV on github!");
        
    }
    
    /**
     * Convertit un nombre flottant en entier.La conversion est réalisée via un cast explicite.   *
     * @param a Valeur flottante à convertir.
     * @return Valeur entière résultante.
     */
    public int test(float a)
    {
        return (int)a;
    }
}
