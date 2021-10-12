package GestionRecettes;

public class Manga extends Livre{
	
	private boolean noir ;

	public Manga() {
		super();
	}

	public Manga(String titre, String auteur, double prix, int nbrPages) {
		super(titre, auteur, prix, nbrPages);
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
		System.out.println(" is it black ? : " +this.isNoir() ) ;
	}

}
