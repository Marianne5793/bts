package jeuvie.bestiole;

import jeuvie.Couleur;


public class Dauphin extends Bestiole{ //dauphin est une spécialisation de bestiole
	
	public static final Couleur MORT = Couleur.BLEU_MARINE;
	public static final Couleur VIVANT = Couleur.BLEU_GRIS;
	
	public Dauphin() {
		super();
		
	}
	
	@Override
	protected Couleur getCouleurVivant() {
		return VIVANT;
	}

	@Override
	protected Couleur getCouleurMort() {
		return MORT;
	}

	@Override
	public Dauphin clone() {
		Dauphin clone =null;
		try {
			clone = (Dauphin) super.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

	
	
}
