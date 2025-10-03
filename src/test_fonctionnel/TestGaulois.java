package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romains;

public class TestGaulois {

	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois("Astérix", 8);
        Gaulois obelix = new Gaulois("Obélix", 16);
        Romains minus = new Romains("Minus", 6);
        
        asterix.parler("Bonjour " + obelix + " !");
        obelix.parler("Bonjour " + asterix + " !Ca te dirais d'aller chasser des sangliers ?");
        asterix.parler("Oui très bonne idée.");
        
        System.out.println("Dans la fôret" + asterix + " et " + obelix + " tombez nez a nez sur le romain " + minus);
        
        for(int i = 0; i<3; i++){
        	asterix.frapper(minus);
        }
    }
}
