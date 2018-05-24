
public class MegalopoleCulturelle extends Megalopole implements VilleCulturelle {

	public MegalopoleCulturelle(String tmpNom, int tmpNombreHabitants) {
		super(tmpNom, tmpNombreHabitants);
		// TODO Auto-generated constructor stub
	}

	public MegalopoleCulturelle() {
		// TODO Auto-generated constructor stub
	}

	public MegalopoleCulturelle(String tmpNom, int tmpNombreHabitants, Maire tmpMaireVille) {
		super(tmpNom, tmpNombreHabitants, tmpMaireVille);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ouvrirUnMusee(String newMusee) {
		String s = "Le nouveau musée " + newMusee + " va ouvrir.";
		return s;
	}

	@Override
	public String organiserUnColloque(String newColloque) {
		String s = "Le colloque sur " + newColloque + " va bientôt être organisé.";
		return s;
	}

}
