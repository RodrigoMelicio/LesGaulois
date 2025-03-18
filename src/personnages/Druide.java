package personnages;

import objets.Chaudron;

public class Druide {
	private String nom;
	private Chaudron chaudron  = new Chaudron();

	public Druide(String nom) {
		this.nom = nom;
	}

	public void parler(String texte) {
		System.out.println("Le Druide " + nom + " : \"" + texte + "\"");
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		System.out.println("Le druide " + nom + " prépare une potion de force " + forcePotion);
	}

	public void booster(Gaulois gaulois) {
		String nomGaulois = gaulois.getNom();
		if (chaudron.resterPotion()) {
			if ("Obélix".equals(nomGaulois)) {
				gaulois.parler("Non, " + nomGaulois + " Non!...Et tu le sais trés bien !");
			} else {
				int forcePotion = chaudron.prendreLouche();
				gaulois.boirePotion(forcePotion);
				gaulois.parler("Tiens " + nomGaulois + " un peu de potion logique.");
			}
		} else {
			gaulois.parler("Désole " + nomGaulois + "il n'y a plus une seulz goute de potion.");
		}
	}

	public String getNom() {
		return nom;
	}
}