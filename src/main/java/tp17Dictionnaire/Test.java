package tp17Dictionnaire;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        HashMap<String, Integer> panier = new HashMap<String, Integer>();

        panier.put("orange", 5);
        panier.put("citron", 1);
        panier.put("pomme", 6);
        panier.put("poire", 3);
        panier.put("fraise", 2);
        panier.put("ananas", 1);
        panier.put("myrtille", 3);
        panier.put("kiwi", 4);
        panier.put("framboise", 2);


        for (Map.Entry map : panier.entrySet()) {
            System.out.println(map + " kg");
        }



    }
}
