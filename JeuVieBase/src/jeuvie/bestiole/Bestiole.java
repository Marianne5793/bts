package jeuvie.bestiole;
import jeuvie.Couleur;

public abstract class Bestiole implements IBestiole {
	private static int compteur = 0;

	protected Couleur couleur;
	protected boolean vivante=true;
	protected final int numero;

	
	protected abstract Couleur getCouleurVivant();
	protected abstract Couleur getCouleurMort();	
	
	
	public Bestiole() {
		super();
		this.couleur= getCouleurVivant();
		this.numero= ++ compteur ;
	}
	
	
	@Override
	public Couleur getCouleur() {
		return couleur;
	}
	
	public void alain() {
		this.couleur = getCouleurVivant ();
		System.out.println("Alain est bien vivant");
		System.out.println("c'est dommage car on l'a toute la semaine prochaine");
	}
	
	@Override
	public boolean isVivante() {
		return vivante;
	}
	
	@Override
	public int getNumero() {
		return numero;
	}
	
	@Override
	public void tuer(){
	this.vivante =false;
	this.couleur= getCouleurMort();
	}
	
	
	@Override
	public String toString() {
		return "Bestiole [couleur=" + couleur + ", vivante=" + vivante + ", numero=" + numero
				+ "] \n";
	}
	
}
