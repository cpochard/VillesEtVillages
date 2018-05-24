
public class VilleMoyenne extends Ville {

	public VilleMoyenne(String tmpNom, int tmpNombreHabitants) {
		super(tmpNom, tmpNombreHabitants);
	}

	public VilleMoyenne() {
	}

	public VilleMoyenne(String tmpNom, int tmpNombreHabitants, Maire tmpMaireVille) {
		super(tmpNom, tmpNombreHabitants, tmpMaireVille);
	}

	@Override
	public void feteNationale() {
		super.feteNationale();
		System.out.println("Quelques feux d'artifices ont été tirés et plusieurs fêtes ont eu lieu jusqu'a tard.");
	}

	@Override
	public void recevoirPersonalite(String personalite, String sujet) {
		super.recevoirPersonalite(personalite, sujet);
		System.out.println("Pour certains, sa venue fut une réussite !");
	}

}
