package guardian;

import java.util.Random;

import pathexample.UnitMover;
import pathfinding.Mover;
import pathfinding.TileBasedMap;

public class Grille {
	private static int demension;
	static Case[][] grille;
	static int save = 0;
	static int saveint = 0;
	static int counter ;
	
	/**
	 * les modifications dans cette classe:palacer les obstacles aletoirement
	 * le constructeur avec 2 parametres dimension et nb intrus
	 * 
	 * 
	 */
	
	
	
	public Grille(int n ,int nbIntrus){
		Grille.counter=nbIntrus;
		Grille.setDemension(n);
		setGrille(new Case[getDemension()][getDemension()]);
		
		for(int i= 0 ; i<getDemension() ;i++){
			
			for(int j=0;j<getDemension() ;j++){
				getGrille()[i][j]=new Case(Obstacles.getHerb());
			}
		}
	}
	
	/**
	 * avec cette methode le Gardien sera placer aletoirement(on peut supprimer placerJ() )
	 * @param nb : combien des Gardien on veut
	 */
	public void PlacerGardien(int nb)
	{
		Random r =new Random();
		int ligne,colone;
		while(nb > 0)
		{
			ligne = r.nextInt(getDemension());
			colone = r.nextInt(getDemension());
			if(ligne>=0 &&colone >=0 && ligne<Grille.getDemension()&&colone <Grille.getDemension())
			{
				getGrille()[ligne][colone]=new Case(Gardien.getg());
				nb--;
			}
				
		}		
	}
	
	
	/*public void placerJ(int ligne ,int colone ){
		ligne =ligne-1;
		colone --;
		
		if(ligne>=0 &&colone >=0 && ligne<Grille.demension&&colone <Grille.demension){
			grille[ligne][colone]=new Case(Gardien.getg());
		}
		else{
			System.out.println("Erreur le gardien ne peut pas etre en dehors de la grille!! ");
			return;
		}
		
		
		 
	}*/
	/**
	 * 
	 * @param nb nombre des Arbre qu'on veut
	 */
	
	
	public void PlacerArbre(int nb)
	{	
		Random r =new Random();
		int x,y;
		while(nb >0)
		{
		 x = r.nextInt(getDemension());
		 y = r.nextInt(getDemension());
		 if(getGrille()[x][y].getO()==Obstacles.getHerb())
			{
				 getGrille()[x][y]=new Case(Obstacles.getA());
			 	 nb--;
			}
	}
	}
	
	public void PlacerMur(int nb)
	{	
		Random r =new Random();
		int x,y;
		while(nb >0)
		{
		 x = r.nextInt(getDemension());
		 y = r.nextInt(getDemension());
		 if(getGrille()[x][y].getO()==Obstacles.getHerb())
		{
			 getGrille()[x][y]=new Case(Obstacles.getM());
		 	 nb--;
		}
	 }
	}
	
	public void PlacerEau(int nb)
	{	
		Random r =new Random();
		int x,y;
		while(nb >0)
		{
		 x = r.nextInt(getDemension());
		 y = r.nextInt(getDemension());
		 if(getGrille()[x][y].getO()==Obstacles.getHerb())
		 {
			 getGrille()[x][y]=new Case(Obstacles.getE());
		 	 nb--;
		}
	   }
	}
	
	public void PlacerIntrusStatic(int nb)
	{	
		Random r =new Random();
		int x,y;
		while(nb >0)
		{
		 x = r.nextInt(getDemension());
		 y = r.nextInt(getDemension());
		 if(getGrille()[x][y].getO()==Obstacles.getHerb())
		 {
			 getGrille()[x][y]=new Case(Intrus.getS());
		 	 nb--;
		}
		}
	}
	
	public void PlacerIntrusDyn(int nb)
	{	
		Random r =new Random();
		int x,y;
		while(nb >0)
		{
		 x = r.nextInt(getDemension());
		 y = r.nextInt(getDemension());
		 if(getGrille()[x][y].getO()==Obstacles.getHerb())
		 {
			 getGrille()[x][y]=new Case(Intrus.getD());
		 	 nb--;
		}
		}
	}
	
	
	
	/*public void placerObs(int n){
		Random r = new Random();
		int x ,y;
		int k = n;
		
		
		for(int i =0 ;i<n;i++){
			x=r.nextInt(demension);
			y=r.nextInt(demension);
		
			if(grille[x][y].getO()!=Gardien.getg() && grille[x][y].getO()!=Intrus.getS(x,y))
				grille[x][y]=new Case(Obstacles.getA());
		}
		for(int i =0 ;i<k;i++){
			x=r.nextInt(demension); 
			y=r.nextInt(demension);
			
			if(grille[x][y].getO()!=Gardien.getg() && grille[x][y].getO()!=Intrus.getS(x,y))
				grille[x][y]=new Case(Obstacles.getM());
		}
		for(int i =0 ;i<k;i++){
			x=r.nextInt(demension);
			y=r.nextInt(demension);
			if(grille[x][y].getO()!=Gardien.getg() && grille[x][y].getO()!=Intrus.getS(x,y))
				grille[x][y]=new Case(Obstacles.getE());
		}
		
			x=r.nextInt(demension);
			y=r.nextInt(demension);
			
			
			if(grille[x][y].getO()!=Gardien.getg() && grille[x][y].getO()!=Intrus.getS(x,y))
				grille[x][y]=new Case(Intrus.getS1());
			else
			{
				x=r.nextInt(demension);
				y=r.nextInt(demension);
				grille[x][y]=new Case(Intrus.getS1());
			}
			
			x=r.nextInt(demension);
			y=r.nextInt(demension);
			
			if(grille[x][y].getO()!=Gardien.getg() && grille[x][y].getO()!=Intrus.getS(x,y))
				grille[x][y]=new Case(Intrus.getS2());
			else
			{
				x=r.nextInt(demension);
				y=r.nextInt(demension);
				grille[x][y]=new Case(Intrus.getS2());
			}
			
			x=r.nextInt(demension);
			y=r.nextInt(demension);
			
			if(grille[x][y].getO()!=Gardien.getg() && grille[x][y].getO()!=Intrus.getS(x,y))
				grille[x][y]=new Case(Intrus.getS3());
			else
			{
				x=r.nextInt(demension);
				y=r.nextInt(demension);
				grille[x][y]=new Case(Intrus.getS3());
			}
			
			x=r.nextInt(demension);
			y=r.nextInt(demension);
			
			if(grille[x][y].getO()!=Gardien.getg() && grille[x][y].getO()!=Intrus.getS(x,y))
				grille[x][y]=new Case(Intrus.getS4());
			else
			{
				x=r.nextInt(demension);
				y=r.nextInt(demension);
				grille[x][y]=new Case(Intrus.getS4());
			}
			
		
		
	}
	*/
	

	public String toString(){
		String s="";
		for(int i =0 ;i<getGrille().length ; i++){
			for(int j=0 ;j<getGrille().length; j++){
				s+="|" +getGrille()[i][j].getType(getGrille()[i][j].getO());
			}
			s+="|";
			s+="\n";
		}
		
		return s;
	}

	public static int getDemension() {
		return demension;
	}

	public static void setDemension(int demension) {
		Grille.demension = demension;
	}

	public static Case[][] getGrille() {
		return grille;
	}

	public static void setGrille(Case[][] grille) {
		Grille.grille = grille;
	}
}