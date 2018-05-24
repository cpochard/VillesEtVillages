
public class Ville {

	protected String nom;
	protected int nombreHabitants;
	protected Maire maireVille =null;
	
	//Constructeur sans maire
	public Ville (String tmpNom, int tmpNombreHabitants) {
		nom = tmpNom;
		nombreHabitants = tmpNombreHabitants;
	}
	//Constructeur par défaut
	public Ville (){
		nom = "Pas de nom";
		nombreHabitants = 0;
	}
	
	//Constructeur complet
	public Ville (String tmpNom, int tmpNombreHabitants, Maire tmpMaireVille) {
		nom = tmpNom;
		nombreHabitants = tmpNombreHabitants;
		maireVille = tmpMaireVille;
	}

	@Override
	public String toString(){
		String message = "Ville [nom=" + nom + ", nombreHabitants=" + nombreHabitants+"]";
		if (maireVille!=null) {
			message += "Le maire de la ville est " + maireVille.nomMaire();}
		else message += "La ville n'a pas de maire"; 
	return message;
}
	public void feteNationale () {
		System.out.println("Le jour de la fête nationale les " + nombreHabitants + " habitants de " + nom + " vont voir le feu d'artifice.");
	}
	
	//Methode recevoir une personalité
	public void recevoirPersonalite(String personalite, String sujet) {
	System.out.println("La ville de " + nom + " de " + nombreHabitants + " habitants reçoit " + personalite + " qui va nous parler " + sujet + ".");	
	}
	//Surcharge recevoir une personnalité
	public void recevoirPersonalite (String personalite) {
		System.out.println("La ville de "+ nom + " de " + nombreHabitants + " habitants reçoit " + personalite + ".");
	}
	
	//Méthode "arrivée d'habitants" (avec Getter/Setter)
	public int getNombreHabitants(){
	return nombreHabitants;
	}
	public void setNombreHabitants(int newNombreHabitants) {
		nombreHabitants = newNombreHabitants;
	}
	
	//Methode "exode massive"
	public void exodeMassive (int habitantsFuyants) {
		nombreHabitants = nombreHabitants - habitantsFuyants;
	}
	
	//Methode changer de maire
	public void electionMunicipale(Maire newNomMaire) {
		maireVille = newNomMaire;
	}
	
	//Methode changer de maire avec getter/setter
	public Maire getMaireVille() {
		return maireVille;
	}
	public void setMaireVille(Maire newMaire) {
		maireVille=newMaire;
	}
}

