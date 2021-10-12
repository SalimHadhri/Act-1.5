package GestionRecettes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LivreRecette extends Livre{
	

	private List<Recette> recettes = new ArrayList<Recette>();
	public LivreRecette() {
		super();
	}

	public LivreRecette(String titre, String auteur, double prix, int nbrPages) {
		super( titre, auteur, prix, nbrPages);
	}


	
	
	public List<Recette> getRecettes() {
		return recettes;
	}

	public void setRecettes(List<Recette> recettes) {
		this.recettes = recettes;
	}

	public List<Recette>  addRecette(Recette recette) {
		
		List<Recette> recettes = getRecettes() ;
		
		recettes.add(recette) ;
		return recettes ;
		
		
		
	}

	@Override
	public void Afficher() {
		super.Afficher();
		System.out.println(getRecettes().toString() );
		
	}


		
		
	
	}
			
	
	
	

