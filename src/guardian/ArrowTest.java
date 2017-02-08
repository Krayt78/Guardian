package guardian;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class ArrowTest extends JPanel {
   private static final int PREF_W = 400;
   private static final int PREF_H = PREF_W;
 //  guardian.getmatrice matrice = new getmatrice();
   String saveterrain = "Herbe";

   public ArrowTest() {
      setFocusable(true);
      requestFocusInWindow();

      addKeyListener(new KeyAdapter() {

         @Override
         public void keyTyped(KeyEvent e) {	//Fonction s'activant si une touche est tap�e
            myKeyEvt(e, "keyTyped");
         }

         @Override
         public void keyReleased(KeyEvent e) {	//fonction qui s active si une touche est relach�e
            myKeyEvt(e, "keyReleased");
         }

         @Override
         public void keyPressed(KeyEvent e) { 		//fonction qui s active si une touche est appuy�e
            myKeyEvt(e, "keyPressed");
         }
         private void myKeyEvt(KeyEvent e, String text) {
            int key = e.getKeyCode();
            System.out.println("TEST");

            if (key == KeyEvent.VK_KP_LEFT || key == KeyEvent.VK_LEFT)
            {
                System.out.println(text + " LEFT");
             /*   matrice[x][y] = saveterrain;
  	            saveterrain = matrice[x-1][y];
  	            matrice[x+1][y] = "X"; */
                //Call some function
            }
            else if (key == KeyEvent.VK_KP_RIGHT || key == KeyEvent.VK_RIGHT)
            {
                System.out.println(text + " RIGHT");
                //Call some function
            }
            else if (key == KeyEvent.VK_KP_UP || key == KeyEvent.VK_UP)
            {
                System.out.println(text + " UP");
                //Call some function
            }
            else if (key == KeyEvent.VK_KP_DOWN || key == KeyEvent.VK_DOWN)
            {
                System.out.println(text + " DOWN");
                //Call some function
            }
         }


      });
   }

   @Override
   public Dimension getPreferredSize() {
      return new Dimension(PREF_W, PREF_H);
   }

   private static void createAndShowGui() {
      ArrowTest mainPanel = new ArrowTest();

      JFrame frame = new JFrame("ArrowTest");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(mainPanel);
      frame.pack();
      frame.setLocationByPlatform(true);
      frame.setVisible(true);
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            createAndShowGui();
         }
      });
   }
}