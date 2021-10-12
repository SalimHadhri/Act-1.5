package GestionRecettes;

import java.util.ArrayList;
import java.util.List;

public class Recette {

	
	private String nom;
	private String description;
	private int niveauDiff ;
	List<String> astuces = new ArrayList<String>();
	List<String> etapes = new ArrayList<String>();
	public Recette() {

	}
	public Recette(String nom, String description, int niveauDiff) {

		this.nom = nom;
		this.description = description;
		this.niveauDiff = niveauDiff;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNiveauDiff() {
		return niveauDiff;
	}
	public void setNiveauDiff(int niveauDiff) {
		this.niveauDiff = niveauDiff;
	}


	
	public List<String> getAstuces() {
		return astuces;
	}
	public void setAstuces(List<String> astuces) {
		this.astuces = astuces;
	}
	public List<String> getEtapes() {
		return etapes;
	}
	public void setEtapes(List<String> etapes) {
		this.etapes = etapes;
	}
	
	public  List<String> addEtape(String etape1) {
		
		 List<String> etapesPretes = getEtapes() ;
		
		 etapesPretes.add(etape1);
		
		return etapesPretes ;
	
	}
	
	public List<String> addAstuce(String astuce) {
		
		List<String> astuces = getAstuces() ;
		
		astuces.add(astuce) ;

		return astuces ;
	
	}
	@Override
	public String toString() {
		return "Recette [nom=" + nom + ", description=" + description + ", niveauDiff=" + niveauDiff + ", astuces="
				+ astuces + ", etapes=" + etapes + "]";
	}
	
}
