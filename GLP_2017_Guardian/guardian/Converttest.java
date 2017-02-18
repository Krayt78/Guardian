package guardian;


import java.util.Random;

import pathexample.UnitMover;
import pathfinding.Mover;
import pathfinding.TileBasedMap;
/**
 * The data map from our example game. This holds the state and context of each tile
 * on the map. It also implements the interface required by the path finder. It's implementation
 * of the path finder related methods add specific handling for the types of units
 * and terrain in the example game.
 * 
 * @author Kevin Glass
 */
public class Converttest implements TileBasedMap {
	/** The map width in tiles */
	public static final int WIDTH = 30;
	/** The map height in tiles */
	public static final int HEIGHT = 30;
	/** Counter for the number of intruders remainings */
	static int counter = 4;
	
	/** The terrain settings for each tile in the map */
	public static Case[][] terrain = new Case[WIDTH][HEIGHT];
	/** The unit in each tile of the map */
	private Case[][] units = new Case[WIDTH][HEIGHT];
	/** Indicator if a given tile has been visited during the search */
	private boolean[][] visited = new boolean[WIDTH][HEIGHT];
	
	private int demension;
	
	/**
	 * Create a new test map with some default configuration
	 */
	public Converttest() {
		
		this.demension=10;
		terrain =new Case[demension][demension];
		
		for(int i= 0 ; i<demension ;i++){
			
			for(int j=0;j<demension ;j++){
				//o[j]=new Obstacles("*");
				terrain[i][j]=new Case(Obstacles.getHerb()); //new Case(o[j]);
			}
		}
		
		// create some test data

		fillArea(0,0,5,5,Obstacles.WATER);
		fillArea(0,5,3,10,WATER);
		fillArea(0,5,3,10,WATER);
		fillArea(0,15,7,15,WATER);
		fillArea(7,26,22,4,WATER);
		
		fillArea(17,5,10,3,TREES);
		fillArea(20,8,5,3,TREES);
		
		fillArea(8,2,7,3,TREES);
		fillArea(10,5,3,3,TREES);
		Random r = new Random();
		
	/*	for( int i =0; i<WIDTH; i++)
			for( int j =0; j<HEIGHT; j++)
				terrain[i][j] = r.nextInt(3); */
				
		
	/*	units[15][15] = GUARDIAN;
		units[2][7] = INTRUDER;
		units[20][25] = INTRUDER;  */
	}
	
	public void placerJ(int WIDTH ,int HEIGHT ){
		WIDTH =WIDTH-1;
		HEIGHT --;
		
		if(WIDTH>=0 &&HEIGHT >=0 && WIDTH<this.demension &&HEIGHT <this.demension){
			terrain[WIDTH][HEIGHT]=new Case(Gardien.getg());
		}
		else{
			System.out.println("Erreur le gardien ne peut pas etre en dehors de la terrain!! ");
			return;
		}
		
		
		 
	}
	
	public void placerObs(int n){
		Random r = new Random();
		int x ,y;
		int k = n;
		
		//o=new Obstacles[n];
		for(int i =0 ;i<k;i++){
			x=r.nextInt(k);
			y=r.nextInt(k);
		//	o[i]=new Obstacles("a");
			if(terrain[x][y].getO()!=Gardien.getg() && terrain[x][y].getO()!=Intrus.getS(x,y))
				terrain[x][y]=new Case(Obstacles.getA());
		}
		for(int i =0 ;i<k;i++){
			x=r.nextInt(n); 
			y=r.nextInt(n);
			//o[i]=new Obstacles("m");
			if(terrain[x][y].getO()!=Gardien.getg() && terrain[x][y].getO()!=Intrus.getS(x,y))
				terrain[x][y]=new Case(Obstacles.getM());
		}
		for(int i =0 ;i<k;i++){
			x=r.nextInt(n);
			y=r.nextInt(n);
			//o[i]=new Obstacles("e");
			if(terrain[x][y].getO()!=Gardien.getg() && terrain[x][y].getO()!=Intrus.getS(x,y))
				terrain[x][y]=new Case(Obstacles.getE());
		}
		
			x=r.nextInt(n);
			y=r.nextInt(n);
			
			//o[i]=new Obstacles("e");
			if(terrain[x][y].getO()!=Gardien.getg() && terrain[x][y].getO()!=Intrus.getS(x,y))
				terrain[x][y]=new Case(Intrus.getS1());
			else
			{
				x=r.nextInt(n);
				y=r.nextInt(n);
				terrain[x][y]=new Case(Intrus.getS1());
			}
			
			x=r.nextInt(n);
			y=r.nextInt(n);
			
			if(terrain[x][y].getO()!=Gardien.getg() && terrain[x][y].getO()!=Intrus.getS(x,y))
				terrain[x][y]=new Case(Intrus.getS2());
			else
			{
				x=r.nextInt(n);
				y=r.nextInt(n);
				terrain[x][y]=new Case(Intrus.getS2());
			}
			
			x=r.nextInt(n);
			y=r.nextInt(n);
			
			if(terrain[x][y].getO()!=Gardien.getg() && terrain[x][y].getO()!=Intrus.getS(x,y))
				terrain[x][y]=new Case(Intrus.getS3());
			else
			{
				x=r.nextInt(n);
				y=r.nextInt(n);
				terrain[x][y]=new Case(Intrus.getS3());
			}
			
			x=r.nextInt(n);
			y=r.nextInt(n);
			
			if(terrain[x][y].getO()!=Gardien.getg() && terrain[x][y].getO()!=Intrus.getS(x,y))
				terrain[x][y]=new Case(Intrus.getS4());
			else
			{
				x=r.nextInt(n);
				y=r.nextInt(n);
				terrain[x][y]=new Case(Intrus.getS4());
			}
			
		
		
	}

	/**
	 * Fill an area with a given terrain type
	 * 
	 * @param x The x coordinate to start filling at
	 * @param y The y coordinate to start filling at
	 * @param width The width of the area to fill
	 * @param height The height of the area to fill
	 * @param water The terrain type to fill with
	 */
	private void fillArea(int x, int y, int width, int height, Case water) {
		for (int xp=x;xp<x+width;xp++) {
			for (int yp=y;yp<y+height;yp++) {
				terrain[xp][yp] = water;
			}
		}
	}
	
	/**
	 * Clear the array marking which tiles have been visted by the path 
	 * finder.
	 */
	public void clearVisited() {
		for (int x=0;x<getWidthInTiles();x++) {
			for (int y=0;y<getHeightInTiles();y++) {
				visited[x][y] = false;
			}
		}
	}
	
	/**
	 * @see TileBasedMap#visited(int, int)
	 */
	public boolean visited(int x, int y) {
		return visited[x][y];
	}
	
	/**
	 * Get the terrain at a given location
	 * 
	 * @param x The x coordinate of the terrain tile to retrieve
	 * @param y The y coordinate of the terrain tile to retrieve
	 * @return The terrain tile at the given location
	 */
	public Case getTerrain(int x, int y) {
		return terrain[x][y];
	}
	
	/**
	 * Get the unit at a given location
	 * 
	 * @param x The x coordinate of the tile to check for a unit
	 * @param y The y coordinate of the tile to check for a unit
	 * @return The ID of the unit at the given location or 0 if there is no unit 
	 */
	public Case getUnit(int x, int y) {
		return units[x][y];
	}
	
	/**
	 * Set the unit at the given location
	 * 
	 * @param x The x coordinate of the location where the unit should be set
	 * @param y The y coordinate of the location where the unit should be set
	 * @param unit The ID of the unit to be placed on the map, or 0 to clear the unit at the
	 * given location
	 */
	public void setUnit(int x, int y, Case unit) {
		units[x][y] = unit;
	}
	
	/**
	 * @see TileBasedMap#blocked(Mover, int, int)
	 */
	public boolean blocked(Mover mover, int x, int y) {
		// if theres a unit at the location, then it's blocked

		if (getUnit(x,y) != null) {
			return true;
		}
		
		int unit = ((UnitMover) mover).getType();
		
		// planes can move anywhere

	/*	if (unit == PLANE) {
			return false;
		}*/
		// tanks can only move across grass

		if (unit == 4) {
			return terrain[x][y] != new Case(Obstacles.getHerb()) && terrain[x][y] != new Case(Obstacles.getA()) && units[x][y] != new Case(Intrus.getS1());
		}
		// boats can only move across water

	/*	if (unit == BOAT) {
			return terrain[x][y] != WATER;
		}*/
		
		// unknown unit so everything blocks

		return true;
	}

	/**
	 * @see TileBasedMap#getCost(Mover, int, int, int, int)
	 */
	public float getCost(Mover mover, int sx, int sy, int tx, int ty) {
		return 1;
	}

	/**
	 * @see TileBasedMap#getHeightInTiles()
	 */
	public int getHeightInTiles() {
		return WIDTH;
	}

	/**
	 * @see TileBasedMap#getWidthInTiles()
	 */
	public int getWidthInTiles() {
		return HEIGHT;
	}

	/**
	 * @see TileBasedMap#pathFinderVisited(int, int)
	 */
	public void pathFinderVisited(int x, int y) {
		visited[x][y] = true;
	}
	
	
}