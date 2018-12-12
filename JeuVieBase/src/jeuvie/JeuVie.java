package jeuvie;

import java.util.ArrayList;
import java.util.List;

import controleur.Controleur;
import jeuvie.bestiole.Dauphin;
import jeuvie.bestiole.IBestiole;
import jeuvie.ocean.HauteMer;
import jeuvie.ocean.Ocean;
import jeuvie.ocean.vague.casemer.Case;
import jeuvie.ocean.vague.casemer.CaseEauProfonde;
import jeuvie.ocean.vague.casemer.ICase;


public class JeuVie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {



		//new Controleur(new BordDeCote(Ocean.PI));
		//new Controleur(new BordDeCote(Ocean.ALEA));

		//new Controleur(new HauteMer(Ocean.ALEA));
		//new Controleur(new HauteMer(Ocean.BARRE));
		//new Controleur(new HauteMer(Ocean.CANON));
		//new Controleur(new HauteMer(Ocean.CLOWN), Controleur.ITER_CLOWN);
		//new Controleur(new HauteMer(Ocean.PI), Controleur.ITER_PI);
		new Controleur(new HauteMer(Ocean.GRAND_VAISSEAU));
		//new Controleur(new HauteMer(Ocean.PETIT_VAISSEAU));

		List<IBestiole> listeDauphins = new ArrayList<IBestiole>(10);
		for (int i = 0; i < 10; i++) {
			IBestiole d = new Dauphin();
			listeDauphins.add(d);
			if (i%2==0) {
				d.tuer();
			}

		}

		System.out.println(listeDauphins);

		List<ICase> listeCases = new ArrayList<ICase>(20);
		for (int i = 0; i < 20; i++) {
			ICase c ;
			if (i%2==0) {
				c= new CaseEauProfonde();
			}
			else {
				c = new CaseEauProfonde(false, (Dauphin) listeDauphins.get(i/2)); //faire un cast Dauphins
			}
			listeCases.add(c);
		}

		System.out.println(listeCases);
	}
}