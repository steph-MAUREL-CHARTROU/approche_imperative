package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author StephanieMC
 *
 */

public class InteractifPlusGrand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] tab = new int[10];
		int maxValeur = 0;

		for (int i = 0; i < tab.length; i++) {
			System.out.println("Veillez saisir un chiffre");
			tab[i] = sc.nextInt();

			if (tab[i] > maxValeur) {
				maxValeur = tab[i];
			}
		}

		System.out.print(Arrays.toString(tab));
		System.out.println("La valeur la plus grande est " + maxValeur);

	}

}
