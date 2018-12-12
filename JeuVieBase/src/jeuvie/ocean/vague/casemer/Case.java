package jeuvie.ocean.vague.casemer;

import jeuvie.Couleur;
import jeuvie.bestiole.IBestiole;

public abstract class Case implements ICase {

	public abstract Couleur getCouleurCaseVide();
	protected abstract void setBestioleVivante();
	protected boolean vide=true;
	protected IBestiole occupant = null;
	
	
	public Case(boolean vide, IBestiole occupant) {
		super();
		this.vide = vide;
		this.occupant = occupant;
	}
	
	public Case() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isVide() {
		return vide;
	}

	public void setVivante(){
		this.vide=false;
		setBestioleVivante();
	}	

	public Couleur getCouleur(){
		Couleur rep=null;
		if (vide) {
			rep=getCouleurCaseVide();
		}
		else {
			rep=occupant.getCouleur();
		}

		return rep;
		//return vide? getCouleurCaseVide():occupant.getCouleur();

	}

	public boolean contientBestioleVivante(){
		boolean rep=true;

		if(vide) {
			rep=false;
		}
		else {
			if(!occupant.isVivante()) {
				rep=false;
			}
		}
		//return !vide && occupant.isVivante();
		return rep;
	}

	public void tuerEventuelOccupant(){
		if (!vide) {
			occupant.tuer();
		}
	}
	@Override
	public String toString() {
		return "Case [vide=" + vide + ", occupant=" + occupant+ "]\n";
	}
	



}
