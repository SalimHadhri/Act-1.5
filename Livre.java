package GestionRecettes;

public class Livre {

	private String titre ;
	private String auteur ;
	private double prix ;
	private int nbrPages ;
	
	public Livre() {
		super();
	}

	public Livre(String titre, String auteur, double prix, int nbrPages) {
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
		this.nbrPages = nbrPages;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public int getNbrPages() {
		return nbrPages;
	}

	public void setNbrPages(int nbrPages) {
		this.nbrPages = nbrPages;
	}


	
	public void Afficher() {

		System.out.println("Livre [titre=" + titre + ", auteur=" + auteur + ", prix=" + prix + ", nbrPages=" + nbrPages + "]");
	}
	
	
}
