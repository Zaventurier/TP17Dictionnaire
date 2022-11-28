package tp17Dictionnaire;

//Imports de class
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
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

        System.out.println("1) Afficher le panier avec toString() :");

        System.out.println(panier.toString());

        System.out.println("2) Taille du panier :");

        System.out.println(panier.size());

        System.out.println("3) Afficher le noms des fruits dans le désordre :");
        for(String fruits : panier.keySet()){
            System.out.println(fruits);
        }

        System.out.println("4) Affichage des quantités : ");

        for(int fruits : panier.values()){
            System.out.println(fruits);
        }




    }
}