import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class VillageCulturel extends Village implements VilleCulturelle {

	public VillageCulturel(String tmpNom, int tmpNombreHabitants) {
		super(tmpNom, tmpNombreHabitants);
		// TODO Auto-generated constructor stub
	}

	public VillageCulturel() {
		// TODO Auto-generated constructor stub
	}

	public VillageCulturel(String tmpNom, int tmpNombreHabitants, Maire tmpMaireVille) {
		super(tmpNom, tmpNombreHabitants, tmpMaireVille);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String ouvrirUnMusee(String newMusee) {
		String s = "Le nouveau mus�e " + newMusee + " va ouvrir.";
		return s;
	}

	@Override
	public String organiserUnColloque(String newColloque) {
		String s = "Le colloque sur " + newColloque + " va bient�t �tre organis�.";
		return s;
	}
	
	public String presentationOuvrirMusee (String newMusee) {
		String message = "Le village de " + nom + " de " + nombreHabitants + " habitants va construire un nouveau mus�e sur " + newMusee;
			return message;	
	
	}
}


