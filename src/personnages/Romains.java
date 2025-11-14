package personnages;

public class Romains {
		private String nom;
		private int force;
		private Equipement[] equipements = new Equipement[2];
		private int nbEquipement = 0;

		
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

		public Equipement[] recevoirCoup(int forceCoup) {
			Equipement[] equipementEjecte = null;
			forceCoup = calculResistanceEquipement(forceCoup);
			force -= forceCoup;
			if (force == 0) {
			parler("Aïe");
			}
			else {
				equipementEjecte = ejecterEquipement();
				parler("J'abandonne...");
			}
			return equipementEjecte;
			}

		private int calculResistanceEquipement(int forceCoup) {
			String texte = "Ma force est de " + this.force + ", et la force du coup est de" + forceCoup;
			int resistanceEquipement = 0;
			String texte2 = "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			if (nbEquipement != 0) {
			texte = texte + texte2;
			int i = 0;
			while (i++ < nbEquipement) {
			if ((equipements[i] != null &&
			equipements[i].equals(Equipement.BOUCLIER))) {
			resistanceEquipement += 8;
			} else {
			System.out.println("Equipement casque");
			resistanceEquipement += 5;
			}
			}
			texte = + resistanceEquipement + "!";
			}
			parler(texte);
			forceCoup -= resistanceEquipement;
			return forceCoup;
			}
		
		
		private Equipement[] ejecterEquipement() {
			Equipement[] equipementEjecte = new Equipement[nbEquipement];
			System.out.println("L'équipement de " + nom.toString() + " s'envole sous la force du coup.");
			//TODO
			int nbEquipementEjecte = 0;
			for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == null) {
			continue;
			} else {
			equipementEjecte[nbEquipementEjecte] = equipements[i];
			nbEquipementEjecte++;
			equipements[i] = null;
			}
			}
			return equipementEjecte;
			}

		
		
		
		public void sEquiper(Equipement equipement) {
			
		}

}

