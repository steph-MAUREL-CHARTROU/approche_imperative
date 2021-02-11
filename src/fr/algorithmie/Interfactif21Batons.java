package fr.algorithmie;


import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
/**
 * 
 * @author StephanieMC
 *
 */



public class Interfactif21Batons {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int nbrBaton = 21;
		int user;
		int ordinateur;
		
		boolean gameOver = false;
		
		String[] tabBaton = new String[nbrBaton];
		
		
		for (int i = 0; i < tabBaton.length; i++) { tabBaton[i] = "|"; }
		
		System.out.println("21 BÂTONS : Le jeu \n" + "Retirez 1,2 ou 3 bâtons, celui qui retire le dernier bâton a perdu.\n");
		System.out.println("---------------------------------------------------------------------------------------------\n");
				
		
		//Random pour le joueur de départ
		int joueurRandom = (int)(Math.random()*2);
		System.out.println(joueurRandom);
		
	
		if (joueurRandom == 0) {
			
			System.out.println("Let's go !" + "\nIl y a " + nbrBaton + " bâtons !");	
			
			do {
				
				for (String element : tabBaton) { System.out.print(element + " "); }
				
			
				System.out.println("\nCombien voulez vous retirer de bâtons, 1,2 ou 3 ?");
				user = scanner.nextInt();
				
				if (user < 1 || user > 3) {
					System.out.println("Saisie incorrecte // vous devez choisir entre 1,2 et 3 !");
					user = scanner.nextInt();
				}			
				
				//  nombre de bâtons décroissants
				nbrBaton -= user;
				String[] tabBaton2 = new String[tabBaton.length-user];
				for (int i = 0; i < tabBaton2.length; i++) { tabBaton2[i] = "|"; }
				tabBaton = tabBaton2;
	
				// Affichage des bâtons
				System.out.println("Il reste " + nbrBaton + " bâton.");
				for (String element : tabBaton) { System.out.print(element + " "); }
				
				if (nbrBaton > 0) {
					
					ordinateur= 1 + random.nextInt(4 - 1);
					
					if (ordinateur > nbrBaton) {
						ordinateur = nbrBaton;
					}
					
					
					nbrBaton -= ordinateur;
					String[] tabBaton3 = new String[tabBaton.length-ordinateur];
					for (int i = 0; i < tabBaton3.length; i++) { tabBaton3[i] = "|"; }
					tabBaton = tabBaton3;
					
					
					System.out.println("\n L'adversaire a retiré " + ordinateur + " bâtons." + " Il reste " + nbrBaton + " bâtons.");

					if (nbrBaton == 0) {
						gameOver = true;
					}
					
				}
				
				
			} while (nbrBaton > 0);
			
			if (gameOver) {
				System.out.println("GAGNÉ !");
			} else {
				System.out.println("GAME OVER ");
			}
			
			
		} else { // Condition, si c'est l'ordi qui joue en premier
			System.out.println("Votre adversaire a jouer en premier.\n");
			
			do {
				
				ordinateur= 1 + random.nextInt(4 - 1);
				if (ordinateur> nbrBaton) {
					ordinateur = nbrBaton;
				}
				
				
				nbrBaton -= ordinateur;
				String[] tabBaton3 = new String[tabBaton.length-ordinateur];
				for (int i = 0; i < tabBaton3.length; i++) { tabBaton3[i] = "|"; }
				tabBaton = tabBaton3;
				
				
				System.out.println("\nVotre adversaire a retiré " + ordinateur + " bâtons."
						+ " Il reste " + nbrBaton + " bâtons.");
				
				
				for (String element : tabBaton) { System.out.print(element + " "); }
				
				if (nbrBaton > 0) {
					
					System.out.println("\nCombien voulez vous retirer de bâtons, 1,2 ou 3 ?");
					user = scanner.nextInt();
					
					if (user < 1 || user > 3) {
						System.out.println("Saisie Incorrecte //  Vous devez choisir entre 1,2 et 3 !");
						user = scanner.nextInt();
					}			
					
					
					nbrBaton -= user;
					String[] tabBaton2 = new String[tabBaton.length-user];
					for (int i = 0; i < tabBaton2.length; i++) { tabBaton2[i] = "|"; }
					tabBaton = tabBaton2;
		
					
					System.out.println("Il reste " + nbrBaton + " bâton.");
					for (String element : tabBaton) { System.out.print(element + " "); }
					
					if (nbrBaton == 0) {
						gameOver = true;
					}
					
				}
				
			} while (nbrBaton > 0);
			
			if (gameOver) {
				System.out.println("GAME OVER !");
			} else {
				System.out.println("GAGNÉ !");
			}
			
		}			

	}

}