package tp02;

public class TestPre {

	private static int[] desEntiers2 = {200,300,400};
	private int[] desEntiers3 = {600,700,800};
	
	
	private void afficherTroisTableaux0(int[] toto) {
		final int[] desEntiers1 = {10,20,30};
		// interdit desEntiers1 = toto;
		//int[] desEntiers3 = desEntiers2;
		int[] desEntiers3 = new int[toto.length];
		for (int i = 0; i < desEntiers3.length; i++) {
			desEntiers3[i]=toto[i];
		}

		//desEntiers3=desEntiers2.clone();
		//desEntiers3 = desEntiers1;
		for (int i = 0; i < toto.length; i++) {
			System.out.println("niveau "+i+": "+desEntiers1[i]+" - "+toto[i]+" - "+desEntiers3[i]);
		}
		System.out.println("--------------------------------------");
		desEntiers1[0]++; toto[1]++; desEntiers3[2]++;
		for (int i = 0; i < toto.length; i++) {
			System.out.println("niveau "+i+": "+desEntiers1[i]+" - "+toto[i]+" - "+desEntiers3[i]);
		}
		System.out.println("--------------------------------------");
	}


	private void afficherTroisTableaux() {
		final int[] desEntiers1 = {10,20,30};
		//int[] desEntiers3 = desEntiers2;
		for (int i = 0; i < TestPre.desEntiers2.length; i++) {
			System.out.println("niveau "+i+": "+desEntiers1[i]+" - "+TestPre.desEntiers2[i]+" - "+this.desEntiers3[i]);
		}
		System.out.println("--------------------------------------");
		desEntiers1[0]++;
		TestPre.desEntiers2[1]++;
		this.desEntiers3[2]++;
		for (int i = 0; i < TestPre.desEntiers2.length; i++) {
			System.out.println("niveau "+i+": "+desEntiers1[i]+" - "+TestPre.desEntiers2[i]+" - "+this.desEntiers3[i]);
		}
		System.out.println("--------------------------------------");
	}

	public static void main(String[] args) {
		int[] desEntiers2 = {60,50,40};
		TestPre test = new TestPre();
		//test.afficherTroisTableaux(desEntiers2);
		test.afficherTroisTableaux();
		TestPre test2 = new TestPre();
		test2.afficherTroisTableaux();

	}

}
