package personnages;

import tableaux.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village; 

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void setVillage(Village village) {
		this.village = village;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Gaulois " + nom + " : ";
	}

	@Override
	public String toString() {
		return nom;
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3 * effetPotion);
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		System.out.println(nom + " boit une potion et sa force est multipliée par " + effetPotion);
	}

	public void sePresenter() {
        if (village != null) {
        	System.out.println(village.getChef());
            if (village.getChef() == this) {
                System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + 
                                   ". Je suis le chef du village " + village.getNom() + ".\"");
            } else {
                System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + 
                                   ". J'habite le village " + village.getNom() + ".\"");
            }
        } else {
            System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + 
                               ". Je voyage de villages en villages.\"");
        }
    }
}