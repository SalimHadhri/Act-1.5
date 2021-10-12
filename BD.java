package GestionRecettes;

public class BD extends Livre{
	
	private boolean noir ;

	public BD() {
		super();
	}

	public BD(String titre, String auteur, double prix, int nbrPages,boolean noir) {
		super(titre, auteur, prix, nbrPages);
		this.noir = noir;
	}

	
	public boolean isNoir() {
		return noir;
	}

	public void setNoir(boolean noir) {
		this.noir = noir;
	}
	
	@Override
	public void Afficher() {
		super.Afficher();
		System.out.println(" is it black ? :" + this.isNoir());
	}
	

	
}
