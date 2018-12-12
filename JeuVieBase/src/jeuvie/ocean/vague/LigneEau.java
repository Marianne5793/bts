package jeuvie.ocean.vague;

import java.util.ArrayList;
import java.util.List;

import jeuvie.ocean.vague.casemer.ICase;

public abstract class LigneEau implements ILigneEau {

	protected List<ICase> lesCases;
	protected final int nbColonnes;
	
	protected abstract void remplirDeCasesVides();
	
	
	protected LigneEau(int taille) {
		this.nbColonnes = taille;
		this.lesCases = new ArrayList<ICase> (taille);
	}
	

	public ICase get(int i) {
		return this.lesCases.get(i);
	}

	public int getNbColonnes() {
		return this.nbColonnes;
	}

	protected boolean add(ICase element){
		return this.lesCases.add(element);
	}


}
