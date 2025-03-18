package personnages;
import tableaux.Village;

public class Gaulois {
    private String nom;
    private int force;
    private int effetPotion = 1;
    private Village village; // Référence au village

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

    // Implémentation de sePresenter()
    public void sePresenter() {
        System.out.print("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + ". ");
        if (village == null) {
            System.out.println("Je voyage de villages en villages.\"");
        } else if (village.getChef() == this) {
            System.out.println("Je suis le chef du village " + village.getNom() + ".\"");
        } else {
            System.out.println("J'habite le village " + village.getNom() + ".\"");
        }
    }
}