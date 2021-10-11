package Models;

public class Voile extends Mat{

	
	private String couleur ;
	private String matiere ;
	public String vendeur ;
	protected String acheteur ;
	
	private boolean enroule ;
	private boolean deroule ;
	
	public final int id=6 ;
	
	private boolean state ;
	
	public Voile () {
		super() ;
		
	}

	public Voile(String couleur, String matiere, String vendeur, String acheteur,String quality, float quantity,float height, float length,String color, float ln) {
		super( quality,  quantity, height,  length, color,  ln) ;
		this.couleur = couleur;
		this.matiere = matiere;
		this.vendeur = vendeur;
		this.acheteur = acheteur;
	}
	public void enrouler() {
		this.enroule=true ;
	}
	
	public void derouler() {
		this.deroule=true ;
	}
	
	public void changestate() {
		if(enroule==true && deroule==false) {
			enroule = false ;
			deroule = true ;
		}
		else if (enroule==false && deroule==true) {
			enroule = true ;
			deroule = false ;
		}
		
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	public String getAcheteur() {
		return acheteur;
	}

	public void setAcheteur(String acheteur) {
		this.acheteur = acheteur;
	}

	public boolean isEnroule() {
		return enroule;
	}

	public void setEnroule(boolean enroule) {
		this.enroule = enroule;
	}

	public boolean isDeroule() {
		return deroule;
	}

	public void setDeroule(boolean deroule) {
		this.deroule = deroule;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public String getVendeur() {
		return vendeur;
	}

	public void setVendeur(String vendeur) {
		this.vendeur = vendeur;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return super.toString()+"la Voile N° "+id+";";
	}
	
	

}
