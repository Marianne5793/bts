package jeuvie.ocean;

import java.util.ArrayList;

import jeuvie.ocean.vague.ILigneEau;
import jeuvie.ocean.vague.LigneEauProfonde;
import jeuvie.ocean.vague.casemer.ICase;


public class HauteMer extends Ocean {


	public HauteMer(int forme) {
		super(forme);
		// TODO Auto-generated constructor stub
	}

	private static final int NB_LIGNES = 55;
	private static final int NB_COLONNES = 60;

	
	protected void remplirDeLignesEau() {
		for (int i = 0; i < NB_LIGNES; i++) {
			ILigneEau ligne = new LigneEauProfonde(i);
			this.grille.add(ligne);
		}
	}
	
	public int getNbLignes() {
		return NB_LIGNES;
	}

	public int getNbColonnes() {
		return NB_COLONNES;
	}

	@Override
	protected HauteMer clone() {
		HauteMer clone =null;
		try {
			clone =(HauteMer) super.clone();
			clone.grille = new ArrayList<ILigneEau>(getNbLignes());
			for (ILigneEau iLigneEau : this.grille) {
				clone.grille.add(iLigneEau);
			}
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

}
