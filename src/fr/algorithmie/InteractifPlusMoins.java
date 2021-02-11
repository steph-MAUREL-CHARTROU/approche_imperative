package fr.algorithmie;

import java.util.Scanner;

/**
 * 
 * @author StephanieMC
 *
 */

public class InteractifPlusMoins {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		final int max = 100;
		int essai = 0;

		System.out.println("Trouvez le nombre mystère"
				+ "un nombre est choisi par la machine compris entre 1 et 100, à vous de le découvrir");
		System.out.println( " Tentez votre chance pour découvrir ce nombre ! ");
		System.out.println( "Saisissez un nombre compris entre 1 et 100 !");
				

		// Ramdomizer
		int nbrRandom = (int) (Math.random() * max);

		
		int numSaisi = scanner.nextInt();

		
		while (numSaisi < nbrRandom || numSaisi > nbrRandom) {

			if (numSaisi > nbrRandom) {
				System.out.println(" Essayez encore, un petit indice : Plus petit");
			} else {
				System.out.println(" Essayez encore, un petit indice : Plus grand ");
			}

			essai++;

		
			numSaisi = scanner.nextInt();
		}

		if (numSaisi == nbrRandom) {
			System.out.println("Bravo vous avez trouvé en " + essai + " coups !!");
		}

	}

}
