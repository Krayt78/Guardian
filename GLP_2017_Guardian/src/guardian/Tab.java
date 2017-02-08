package guardian;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Tab extends JFrame{
	protected int x=0;
	protected int y=0;
	protected String saveterrain="Herbe";
	//guardian.getmatrice matrice = new getmatrice();
    public Tab() {
    	
    	guardian.ArrowTest at = new ArrowTest();
    	//JFrame frame = new JFrame("ArrowTest");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(at);
        this.pack();
        this.setLocationByPlatform(true);
        this.setVisible(true);

        this.setTitle("2 Dim Tab");
        
        
        int n=5;
		int mouve=0;
		Grille grille =new Grille(10);
		grille.placerJ(3, 2);
 
        String[] entetes = {"Prénom", "Nom", "Couleur favorite", "Homme"};
 
        JTable tableau = new JTable(Grille.grille,entetes);
        
        this.add(tableau);

       // frame.getContentPane().add(tableau, BorderLayout.CENTER);
        
        tableau.setTableHeader(null);
 
        this.pack();
    }
 
    public static void main(String[] args) {
        new Tab().setVisible(true);
   
        }
}
   
