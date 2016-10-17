import java.util.Scanner;

public class TriangleEtoile {

	String etoile = "";
	int nbLigne = 0;

	TriangleEtoile(int ligne) {
		for (; ligne > nbLigne; ligne--) {
			for (int place = 0; place < ligne - 1; place++) {
				System.out.print(" ");

			}
			etoile = "* " + etoile;

			System.out.println(etoile);
		}

	}

	public static void main(String[] args) {
		System.out.println("Bienvenue au programmeTriangle sous forme  d'étoile ");
		System.out.println("============");
		System.out.println("saisisser un nombre  entier positif");
		Scanner lire = new Scanner(System.in);
		int ligne = lire.nextInt();
		if (ligne > 0) {
			new TriangleEtoile(ligne);
			lire.close();
		} else
			System.out.println("le  triangle d'étoiles ne peut pas etre construie");
	}
}
