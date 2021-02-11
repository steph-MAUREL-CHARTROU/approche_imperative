package fr.algorithmie;

import java.util.Scanner;
/**
 * 
 * @author StephanieMC
 *
 */
public class InteractifFibonacci {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int f0 = 0;
		int f1 = 1;
		int fn;
		
		System.out.println("Veuillez saisir le rang :\n");
		int n = scanner.nextInt();
		
		System.out.println("f0 : " + f0 + "\nf1 : "+ f1);
		
		for (int i = 2; i <= n; i++) {
			fn = f0 + f1;
			f0 = f1;
			f1 = fn;			
		 System.out.println("f" + i + " : " + fn);
		}
		
	}
}
