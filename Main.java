package projetFinal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****** GESTION DES ETUDIANTS ****** \n"
				+ "1. Lire les  chiers d’entrée par défaut\n" + 
				"2. Lire les  chiers d’entrée en entrant le nom de chaque  chier au clavier\n" + 
				"3. A ecter les étudiants dans les groupes de TDs : pour cela, vous a cherez l’a ectation dans un\n" + 
				" chier en sortie en suivant le format du  chier d’entrée pour la liste d’étudiants (voir ci-dessous).\n" + 
				"4. Changer le nombre maximal d’étudiants par groupe de TD");

		boolean quitter = false;
	    	do {
	    	String choice = Etudiant.choixMenu();
	    
	        switch (choice) {
	            case "1":quitter = true;
	            			Etudiant.lireFichiersDefaut();
	                     break;
	            case "2": Etudiant.lireFichiers(); 
	                     break;
	            case "3":  Etudiant.affecterEtudiants();
	                     break;
	            case "4":  Etudiant.changerNombreEtudiants();
	                     break;
	         
	
	        }
	    	}while(!quitter);
	}

}
