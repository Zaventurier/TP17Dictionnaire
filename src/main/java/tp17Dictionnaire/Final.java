package tp17Dictionnaire;

import java.util.HashMap;
import java.util.Scanner;

public class Final {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Instantiation du panier
        HashMap<String, Integer> panier = new HashMap<String, Integer>();

        //Ajout des fruits et des quantités (en kg) dans le panier

        panier.put("orange", 5);
        panier.put("citron", 1);
        panier.put("pomme", 6);
        panier.put("poire", 3);
        panier.put("fraise", 2);
        panier.put("ananas", 1);
        panier.put("myrtille", 3);
        panier.put("kiwi", 4);
        panier.put("framboise", 2);

        //Affichage du menu + saisit de l'exercice

        System.out.println("Saisir un numéro d'exercice (1-11) :");
        int numExo = sc.nextInt();

        switch (numExo){
            case 1:
                System.out.println("Exercice N°1 :");
                break;
            case 2:
                System.out.println("Exercice N°2 :");
                break;
            case 3:
                System.out.println("Exercice N°3 :");
                break;
            case 4:
                System.out.println("Exercice N°4 :");
                break;
            case 5:
                System.out.println("Exercice N°5 :");
                break;
            case 6:
                System.out.println("Exercice N°6 :");
        }
    }
}
