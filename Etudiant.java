package projetFinal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Etudiant {

	public static String choixMenu() {
		boolean valide = false;
		String opt = "";

		
		Scanner sc = new Scanner(System.in);
		do{			
			try {				
				System.out.println("Veuillez saisir une option :");
				int option = sc.nextInt();
				
				if(option>0 && option<6) {
					valide = true;
					opt = Integer.toString(option);
				}
				
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				sc = new Scanner(System.in);
				System.out.println("saisir un chiffre");
				
			}
	
		
		}while(!valide);
		
		return opt;
	}
}
