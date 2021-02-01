package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author StephanieMC
 *
 */

public class InteractifStockageNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] tab = new int[3];

		int i = 0;

		int option1 = 1;
		int option2 = 2;
		int choix;

		do {
			System.out.println("Choix 1 : Ajouter un nombre // Choix 2 : Afficher les nombre existants");
			choix = sc.nextInt();

			if (choix == option1) { // option 1

				if (i >= tab.length - 1) {
					int[] tab2 = new int[tab.length + 1];

					for (int j = 0; j < tab.length; j++) {
						tab2[j] = tab[j];
					}

					tab = tab2;

				}

				System.out.println("Veuillez saisir un nombre : ");
				int choixNbr = sc.nextInt();

				tab[i] = choixNbr;
				i++;

			} else if (choix == option2) {
				System.out.println(Arrays.toString(tab));
			}

		} while (choix == option1 || choix == option2);

		System.out.println("Hasta la Vista Baby !");

	}

}
