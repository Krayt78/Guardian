package guardian;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		int mouve=0;
		int nbIntruStatic=3;
		int nbIntruDyn=2;
		int totaleIntru =nbIntruDyn+nbIntruStatic;
		Grille grille =new Grille(10,totaleIntru);
		grille.PlacerGardien(1);
		grille.PlacerArbre(3);
		grille.PlacerEau(3);
		grille.PlacerMur(3);
		grille.PlacerIntrusStatic(nbIntruStatic);
		//grille.placerJ(3, 2);
		//grille.placerObs(10);
		//while(guardian.Grille.counter!=0){
		while(totaleIntru !=0){
			Scanner s =new Scanner(System.in);
			System.out.println("veuillez choisir vers ou voulez deplacer:"+" 8:vers haut  "+" 2:vers bas "+" 4: vers gauche "+" 6:vers droite ");		
		    System.out.print("nombre de mouvement:");
		    System.out.println(mouve);
		    System.out.println("nombre d'intrus en vie: "+totaleIntru);
		    System.out.println(grille);
		    
		    int sens =s.nextInt();
		    
		    
		    
		    switch(sens){
		    case 8:{
		    	Deplacement.deplacerH();
		    	mouve++; 
		    	break ;
		    }
		    case 2:{
		    	Deplacement.deplacerB();
		    	mouve++;
		    	break ;
		    }
		    case 6:{
		    	Deplacement.deplacerD();
		    	mouve++;
		    	break ;
		    }
		    case 4:{
		    	Deplacement.deplacerG();
		    	mouve++;
		    	break ;
		    }
		   
		    
		    default:
		    	System.err.println("mauvaise sens");		    
		    }
	}
		
		System.out.println("GG");

}
}