package personnages;

public class Druide {
	private String nom;
	private int forcePotion;

	public Druide(String nom) {
		this.nom = nom;
	}

	public void parler(String texte) {
		System.out.println("Le Druide " + nom + " : \"" + texte + "\"");
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
		this.forcePotion = forcePotion;
		System.out.println("Le druide " + nom + " prépare une potion de force " + forcePotion);
	}

	public void booster(Gaulois gaulois) {
		gaulois.boirePotion(forcePotion);
	}

	public String getNom() {
		return nom;
	}
}