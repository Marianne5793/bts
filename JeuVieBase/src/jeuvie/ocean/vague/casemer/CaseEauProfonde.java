package jeuvie.ocean.vague.casemer;

import java.util.ArrayList;

import jeuvie.Couleur;
import jeuvie.bestiole.Dauphin;
import jeuvie.bestiole.IBestiole;
import jeuvie.ocean.IOcean;

public class CaseEauProfonde extends Case {

	public static final Couleur VIDE = Couleur.BLEU_SOMBRE;



	public CaseEauProfonde() {
		super();
	}

	public CaseEauProfonde(boolean vide, Dauphin occupant) {
		super(vide, occupant);
	}

	protected void setBestioleVivante() {
		super.occupant=new Dauphin();

	}

	@Override
	public Couleur getCouleurCaseVide() {
		return VIDE;
	}

	/**
	 * � chaque �tape, l��volution d�une cellule est enti�rement d�termin�e par l��tat de ses huit voisines de la fa�on suivante :

	 * Une cellule morte poss�dant exactement trois voisines vivantes devient vivante (elle na�t).
	 * Une cellule vivante poss�dant deux ou trois voisines vivantes le reste, sinon elle meurt.
	 * @param col la colonne dans la matrice
	 * @param j la ligne dans la matrice
	 * @return si cette case pr�cise doit survivre ou non.
	 */
	public void evoluer(IOcean copie, int col, int lg){
		int voisins = copie.compterVoisinsVivants(col, lg);
		if (voisins==3){
			if(!this.contientBestioleVivante()) {
				this.setVivante(); // et non setBestioleVivante
			}
		}
		
		if (voisins !=2 && voisins !=3){
			if(this.contientBestioleVivante()) {
				this.tuerEventuelOccupant();
			}
		}
	}

	@Override
	public CaseEauProfonde clone() {
		CaseEauProfonde clone =null;
		try {
			clone = (CaseEauProfonde) super.clone();
			clone.occupant = (IBestiole) new ArrayList<ICase>();
			if(!this.isVide()) {
				clone.occupant=((Dauphin) this.occupant).clone();
			}

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}




}
