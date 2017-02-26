package guardian;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


import guardian.Obstacles;
import pathfinding.AStarPathFinder;
import pathfinding.Path;
import pathfinding.PathFinder;

public class UItest{


	public static void main(String[] argv) {
		UI test = new UI();	
		
		int mouve=0;
		Case.playervision();
		
		while(guardian.Grille.counter!=0)
		{
			System.out.println("veuillez choisir vers ou voulez deplacer:"+
		" 8:vers haut  "+" 2:vers bas "+" 4: vers gauche "+" 6:vers droite ");		
		    System.out.print("nombre de mouvement:");
		    System.out.println(mouve);
		    System.out.println("nombre d'intrus en vie: "+guardian.Grille.counter);
		    System.out.println(test.grille);
			Scanner s =new Scanner(System.in);int sens =s.nextInt();
			
			 switch(sens){
			    case 8:{
			    	
			    	Deplacement.deplacerB();//????
			    	mouve++; 
			    	break ;
			    }
			    case 2:{
			    	Deplacement.deplacerH();
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
			    	System.err.println("mauvais sens");		    
			    }
			/* if(UI.aliverand == 1)   //???
			 DeplacementInt.deplacerRand();*/
			 
			/*il y a un erreur dans la ligne 155 de la classe Case ou dans la ligne 75de la clas UITest
			 * type d'erreur ArrayIndexOutOfBoundsException
			 */
			 Case.playervision();
			 test.repaint();
			 	
	}
		
		
		System.out.println("GG");
		
		
	}
		
	
}