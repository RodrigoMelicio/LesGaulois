package personnages;

import objets.Chaudron;

public class Druide {
	private String nom;
	private int forcePotion;
	private Chaudron chaudron;

	public Druide(String nom) {
		this.nom = nom;
		this.chaudron = new Chaudron();
	}

	public void parler(String texte) {
		System.out.println("Le Druide " + nom + " : \"" + texte + "\"");
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
		this.forcePotion = forcePotion;
		chaudron.remplirChaudron(quantite, forcePotion);
		System.out.println("Le druide " + nom + " prépare une potion de force " + forcePotion);
	}

	public void booster(Gaulois gaulois) {
		if (chaudron.resterPotion()) {
			chaudron.prendreLouche();
			gaulois.boirePotion(forcePotion);
		} else {
			System.out.println("Le Druide " + nom + " : \"Désolé, plus de potion !\"");
		}
	}

	public String getNom() {
		return nom;
	}
}