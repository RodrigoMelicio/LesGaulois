package personnages;

public class Romains {
		private String nom;
		private int force;
		
		public Romains(String nom, int force) {
			this.nom = nom;
			this.force = force;
		}
		public String getNom() {
			return nom;
		}
	
		public int getForce() {
			return force;
		}
		public void parler(String texte) {
			System.out.println(prendreParole() + "\"" + texte + "\"");
		}
		
		private String prendreParole() {
			return "Le romain " + nom + " : ";
		}
		
		public void recevoirCoup(int forceCoup) {
			force -= forceCoup;
			if (force<1) {
				force = 0;
				parler("J'abandonne");
			} else {
				parler("Aie");
			}		
		}	

}

