package GestionRecettes;

public class Roman extends Livre{
	
	private int nbChapitre ;
	private String description ;
	
	public Roman() {
		super();
	}

	public Roman(String titre, String auteur, int nbrPages, double prix) {
		super( titre,  auteur, prix, nbrPages);
	}

	public int getNbChapitre() {
		return nbChapitre;
	}

	public void setNbChapitre(int nbChapitre) {
		this.nbChapitre = nbChapitre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public void Afficher() {
		super.Afficher();

	}
	
	
	

}
