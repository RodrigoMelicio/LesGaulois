package personnages;

public class Village {
	private String nom;
	private Gaulois chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private static final int NB_VILLAGEOIS_MAX= 30;
	
	public Village(String nom, Gaulois chef) {
		this.nom = nom;
		this.chef = chef;
		chef.setVillage(this);
		this.villageois = new Gaulois[NB_VILLAGEOIS_MAX];
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		if (nbVillageois < NB_VILLAGEOIS_MAX) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
			gaulois.setVillage(this);
		} else {
			System.out.println("Le village est plein !");
		}
	}
	
	
	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois > 0 && numVillageois <= nbVillageois) {
			return villageois[nbVillageois - 1];
		} else {
			System.out.println("Il n'y a pas autant d'habitants dans notre village");
			return null;
		}
	}
	
	
	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
	}
	

		

}
