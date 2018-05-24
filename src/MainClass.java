
public class MainClass {

	public static void main(String[] args) {

		Ville maVille = new Ville("Nantes", 60000);
		Ville maFeteNationale = new Ville("Nantes", 60000);
		Ville maVilleEnConstruction = new Ville();
		Maire maireVille = new Maire ("Monsieur Bidule");
		Ville maVilleAvecMaire = new Ville ("Nantes", 60000, maireVille);
		Village monVillage = new Village ("Coueron", 20000);
		VilleMoyenne maVilleMoyenne = new VilleMoyenne ("Macon", 50000);
		Megalopole maMegalopole = new Megalopole ("Lyon", 800000);

		//Afficher description de maVille avec toString
		System.out.println(maVille.toString());
		
		//Que se passe-t-il le jour de la fete Nat
		//maFeteNationale.feteNationale();
		
		//Afficher recevoir personalité
		maVille.recevoirPersonalite("Ouioui", "de sa super voiture");
		
		//Afficher description maVille en modifiant nombreHabitants (getter/setter)
		maVille.setNombreHabitants(90000);
		System.out.println(maVille.toString());
		
		//Afficher maVille après exode massive (-20000 habitants)
		maVille.exodeMassive(20000);
		System.out.println(maVille.toString());
		
		//Afficher maVilleEnConstruction (constructeur par défaut)
		System.out.println(maVilleEnConstruction.toString());
		
		//Afficher maVille sans sujet personalité
		maVille.recevoirPersonalite("Barak Obama");
		
		//Afficher maVilleAvecMaire
		System.out.println(maVilleAvecMaire.toString());
		
		//Afficher maVille avec un nouveau maire
		maVille.electionMunicipale(new Maire ("Monsieur Machin"));
		System.out.println(maVille.toString());	
		//Ou alors
		maireVille = new Maire("Monsieur Machin");
		maVille.electionMunicipale(maireVille);
		System.out.println(maVille.toString());
		//Ou encore (avec utilisation getter/setter)
		maireVille= new Maire ("Monsieur Truc");
		maVille.setMaireVille(maireVille);
		System.out.println(maVille.toString());
		
		//Afficher monVillage avec override fete nat / recevoir personalité
		monVillage.feteNationale();
		monVillage.recevoirPersonalite("Trump", "de trucs vraiment pas intéressants");
		//Afficher maVilleMoyenne avec override fete nat/ recevoir personalité
		maVilleMoyenne.feteNationale();
		maVilleMoyenne.recevoirPersonalite("Macron","du développement économique");
		//Afficher maMegalopole avec override fete nat/ recevoir personalité
		maMegalopole.feteNationale();
		maMegalopole.recevoirPersonalite("Bambi", "du complexe d'Oedipe");
	
		//Afficher methode personnaliteeInviteeALaFete avec Ville
		personnaliteeInviteeALaFete (maVille, "Loanna");
		//Afficher methode personnaliteeInviteeALaFete avec Village (grace au polymorphisme)
		personnaliteeInviteeALaFete (monVillage, "PierpolJak");
		//Afficher methode personnaliteeInviteeALaFete avec Megalopole (grace au polymorphisme)
		personnaliteeInviteeALaFete (maMegalopole, "Superman");
		
		//Utiliser méthode newMusee de l'interface VilleCulturelle avec VillageCulturel
		VillageCulturel newVillageCult = new VillageCulturel ("Indre", 3000);
		System.out.println(newVillageCult.ouvrirUnMusee("de la palourde"));
		
		//Utiliser méthode newColloque de l'interface VilleCulturelle avec MegalopoleCulturelle
		MegalopoleCulturelle newMegalopoleCult = new MegalopoleCulturelle ("Paris", 90000000);
		System.out.println(newMegalopoleCult.organiserUnColloque("les collectionneurs de l'extrême"));
		
		//Utiliser méthode presentationOuvrirMusée de VillageCulturel
		System.out.println(newVillageCult.presentationOuvrirMusee("la production d'algues"));

	}
		public static void personnaliteeInviteeALaFete(Ville v, String personnalite) {
			v.recevoirPersonalite(personnalite);
			v.feteNationale();
		}
		
	
}
