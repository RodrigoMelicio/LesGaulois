package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		Druide panoramix = new Druide("Panoramix");

		asterix.parler("Bonjour Obélix.");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");

		Romain minus = new Romain("Minus", 6);
		System.out.println("Dans la forêt " + asterix + " et " + obelix + " tombent nez à nez sur le romain "
				+ minus.getNom() + ".");

		panoramix.fabriquerPotion(10, 2);
		panoramix.booster(asterix);

		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}
	}
}
