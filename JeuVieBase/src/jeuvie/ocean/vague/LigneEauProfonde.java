package jeuvie.ocean.vague;

import java.util.ArrayList;
import jeuvie.ocean.vague.casemer.CaseEauProfonde;
import jeuvie.ocean.vague.casemer.ICase;

public class LigneEauProfonde extends LigneEau {

	
	
	public LigneEauProfonde(int taille) {
		super(taille);
	
	}

	protected void remplirDeCasesVides() {
	
		for (int i = 0; i < nbColonnes; i++) {
			ICase eau = new CaseEauProfonde();
			this.add(eau);
		}
	}

	@Override
	public LigneEauProfonde clone() {
		LigneEauProfonde clone =null;
		try {
			clone = (LigneEauProfonde) super.clone();
			clone.lesCases = new ArrayList<ICase>(nbColonnes);
			for (ICase iCase : this.lesCases) {
				clone.add(((CaseEauProfonde) iCase).clone());
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	
	
	
	
}
