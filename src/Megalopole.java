
public class Megalopole extends Ville {

	public Megalopole(String tmpNom, int tmpNombreHabitants) {
		super(tmpNom, tmpNombreHabitants);
	}

	public Megalopole() {
	}

	public Megalopole(String tmpNom, int tmpNombreHabitants, Maire tmpMaireVille) {
		super(tmpNom, tmpNombreHabitants, tmpMaireVille);
	}

	@Override
	public void feteNationale() {
		super.feteNationale();
		System.out.println("Un immense feu d'article en sons et lumières a ete tire et d'immenses beuveries ont pris place dans tous les espaces verts.");
	}

	@Override
	public void recevoirPersonalite(String personalite, String sujet) {
		super.recevoirPersonalite(personalite, sujet);
		System.out.println("Un groupe de soutient est déja en marche jusqu'à la mairie.");
	}

}
