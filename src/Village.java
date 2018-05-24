
public class Village extends Ville {


	public Village(String tmpNom, int tmpNombreHabitants) {
		super(tmpNom, tmpNombreHabitants);
	}

	public Village() {
	}

	public Village(String tmpNom, int tmpNombreHabitants, Maire tmpMaireVille) {
		super(tmpNom, tmpNombreHabitants, tmpMaireVille);
	}
	
	@Override
	public void feteNationale() {
		super.feteNationale();
	System.out.println("La municipalité a fait peter 3 petards et tout le monde s'est retrouvé sur le stade.");
	}

	@Override
	public void recevoirPersonalite(String personalite, String sujet) {
		super.recevoirPersonalite(personalite, sujet);
		System.out.println("Malheureusement peu de gens étaients présents");
	}
}
