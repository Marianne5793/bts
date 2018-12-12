package tp01;

public class Premiere {
	
	private static void afficherTexte(String message) {
		System.out.println(message);
	}
	
	
	private static void afficherCoucou() {
		afficherTexte("coucou le monde");
	}


	private static int factorielle0(int i) {
		int rep=-1;
		if (i>=0) {
			rep=1;
			if (i>1) {
				rep=i*factorielle0(i-1);
			}
		}
		else {
			System.err.println("paramètre négatif");
		}
		return rep;
		
	}

	private static int factorielleAux(int i) {
		int rep=1;
		if (i>1) {
			rep=i*factorielleAux(i-1);
		}
		return rep;
	}

	private static int factorielle(int i) {
		int rep=-1;
		if (i>=0) {
			rep=factorielleAux(i);
		}
		else {
			System.err.println("paramètre négatif");
		}
		return rep;
	}
	
	
	public static void main(String[] args) {
		/*afficherCoucou();
		afficherTexte("je dis coucou aussi");
		System.out.println(factorielle(6)==6*5*4*3*2);*/
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Premiere.factorielle(i));
		}		
	}


	

}
