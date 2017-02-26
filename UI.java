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

public class UI extends JFrame {
	/** The map on which the units will move */
	static Grille grille =new Grille(20,5);
	
	/** The path finder we'll use to search our map */
	private PathFinder finder;
	/** The last path found for the current unit */
	private Path path;
	/** s1 alive or not */
	static int aliverand = 1;
	/** The list of tile images to render the map */
	private static Image[] tiles = new Image[8];
	/** The offscreen buffer used for rendering in the wonder world of Java 2D */
	private static Image buffer;
	
	
	/** The x coordinate of selected unit or -1 if none is selected */
	private static int selectedx = -1;
	/** The y coordinate of selected unit or -1 if none is selected */
	private static int selectedy = -1;
	
	/** The x coordinate of the target of the last path we searched for - used to cache and prevent constantly re-searching */
	private int lastFindX = -1;
	/** The y coordinate of the target of the last path we searched for - used to cache and prevent constantly re-searching */
	private int lastFindY = -1;
	
	/**
	 * Create a new test game for the path finding tutorial
	 */
	public UI() {
		super("Path Finding Example");
	
		try {
			tiles[1] = ImageIO.read(getResource("res/trees.png"));
			tiles[0] = ImageIO.read(getResource("res/grass.png"));
			tiles[3] = ImageIO.read(getResource("res/water.png"));
			tiles[2] = ImageIO.read(getResource("res/walls.png"));
			tiles[5] = ImageIO.read(getResource("res/plane.png"));
			tiles[4] = ImageIO.read(getResource("res/boat.png"));
			tiles[6] = ImageIO.read(getResource("res/tank.png"));
			tiles[7] = ImageIO.read(getResource("res/fog.png"));
		} catch (IOException e) {
			System.err.println("Failed to load resources: "+e.getMessage());
			System.exit(0);
		}
		grille.PlacerGardien(1);
		grille.PlacerArbre(3);
		grille.PlacerEau(3);
		grille.PlacerMur(3);
		grille.PlacerIntrusStatic(3);
		grille.PlacerIntrusDyn(2);
		//grille.placerJ(3, 2);
		//grille.placerObs(10);
	//	finder = new AStarPathFinder(test, 500, true);
		
	/*	addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				handleMousePressed(e.getX(), e.getY());
			}
		});
		addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
			}
			public void mouseMoved(MouseEvent e) {
				handleMouseMoved(e.getX(), e.getY());
			}
		}); */
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setSize(600,600);
		setResizable(false);
		setVisible(true);
	}
	
	private InputStream getResource(String ref) throws IOException {
		InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(ref);
		if (in != null) {
			return in;
		}
		
		return new FileInputStream(ref);
	}
	private void handleMouseMoved(int x, int y) {
		
	/*	if ((x < 0) || (y < 0) || (x >= test.getWidthInTiles()) || (y >= test.getHeightInTiles())) {
			return;
		}
		
		if (selectedx != -1) {
			if ((lastFindX != x) || (lastFindY != y)) {
				lastFindX = x;
				lastFindY = y;
				path = finder.findPath(new UnitMover(Obstacles(test.getUnit(selectedx, selectedy))), 
									   selectedx, selectedy, x, y);
				repaint(0);
			}
		}*/
	}
	public void paint(Graphics graphics) {	
		// create an offscreen buffer to render the map
		
		if (buffer == null) {
			buffer = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);			
		}
		
		Graphics g = buffer.getGraphics();
		
		
		g.clearRect(0,0,600,600);
		g.translate(50, 50);
		
		// cycle through the tiles in the map drawing the appropriate

		// image for the terrain and units where appropriate

		//	System.out.println(grille);
		
		
		for (int x=0;x<Grille.getDemension();x++) {
			for (int y=0;y<Grille.getDemension();y++) {
				int foo = Integer.parseInt(Grille.getGrille()[x][y].getType(Grille.getGrille()[x][y].getO()));
				//System.out.print(foo+",");
				/**
				 * je mets cette condition en commentaire pour verifier les intrus se bougent ou pas
				 */
				/*if(Grille.grille[x][y].getVision()==false)
				{
					g.drawImage(tiles[7],x*16,y*16,null);
				}
				else */
					g.drawImage(tiles[foo],x*16,y*16,null);
				
					
			/*	if (test.getUnit(x, y) != 0) {
					g.drawImage(tiles[test.getUnit(x, y)],x*16,y*16,null);
				} else {
					if (path != null) {
						if (path.contains(x, y)) {
							g.setColor(Color.blue);
							g.fillRect((x*16)+4, (y*16)+4,7,7);
						}
					}	
				}*/
			}
		}

		// if a unit is selected then draw a box around it

	/*	if (selectedx != -1) {
			g.setColor(Color.black);
			g.drawRect(selectedx*16, selectedy*16, 15, 15);
			g.drawRect((selectedx*16)-2, (selectedy*16)-2, 19, 19);
			g.setColor(Color.white);
			g.drawRect((selectedx*16)-1, (selectedy*16)-1, 17, 17);
		}  */
		
		// finally draw the buffer to the real graphics context in one

		// atomic action
		

		graphics.drawImage(buffer, 0, 0, null);
	}
}