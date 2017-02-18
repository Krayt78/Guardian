package guardian;

import java.util.Random;

import pathexample.UnitMover;
import pathfinding.Mover;
import pathfinding.TileBasedMap;

public class Grille {
	static int demension;
	static Case[][] grille;
	private String gardian =" g ";
	//static Obstacles[] o = {new Obstacles(Obstacles.getA()),new Obstacles("a"),new Obstacles("e"),new Obstacles("m"),new Obstacles("g"),new Obstacles("i")};
	private Case c;
	static int save = 0;
	static int counter = 4;
	
	
	
	
	
	public Grille(int n){
		
		this.demension=n;
		grille =new Case[demension][demension];
		
		for(int i= 0 ; i<demension ;i++){
			
			for(int j=0;j<demension ;j++){
				//o[j]=new Obstacles("*");
				grille[i][j]=new Case(Obstacles.getHerb()); //new Case(o[j]);
			}
		}
	}
	
	public void placerJ(int ligne ,int colone ){
		ligne =ligne-1;
		colone --;
		
		if(ligne>=0 &&colone >=0 && ligne<this.demension&&colone <this.demension){
			grille[ligne][colone]=new Case(Gardien.getg());
		}
		else{
			System.out.println("Erreur le gardien ne peut pas etre en dehors de la grille!! ");
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
			if(grille[x][y].getO()!=Gardien.getg() && grille[x][y].getO()!=Intrus.getS(x,y))
				grille[x][y]=new Case(Obstacles.getA());
		}
		for(int i =0 ;i<k;i++){
			x=r.nextInt(n); 
			y=r.nextInt(n);
			//o[i]=new Obstacles("m");
			if(grille[x][y].getO()!=Gardien.getg() && grille[x][y].getO()!=Intrus.getS(x,y))
				grille[x][y]=new Case(Obstacles.getM());
		}
		for(int i =0 ;i<k;i++){
			x=r.nextInt(n);
			y=r.nextInt(n);
			//o[i]=new Obstacles("e");
			if(grille[x][y].getO()!=Gardien.getg() && grille[x][y].getO()!=Intrus.getS(x,y))
				grille[x][y]=new Case(Obstacles.getE());
		}
		
			x=r.nextInt(n);
			y=r.nextInt(n);
			
			//o[i]=new Obstacles("e");
			if(grille[x][y].getO()!=Gardien.getg() && grille[x][y].getO()!=Intrus.getS(x,y))
				grille[x][y]=new Case(Intrus.getS1());
			else
			{
				x=r.nextInt(n);
				y=r.nextInt(n);
				grille[x][y]=new Case(Intrus.getS1());
			}
			
			x=r.nextInt(n);
			y=r.nextInt(n);
			
			if(grille[x][y].getO()!=Gardien.getg() && grille[x][y].getO()!=Intrus.getS(x,y))
				grille[x][y]=new Case(Intrus.getS2());
			else
			{
				x=r.nextInt(n);
				y=r.nextInt(n);
				grille[x][y]=new Case(Intrus.getS2());
			}
			
			x=r.nextInt(n);
			y=r.nextInt(n);
			
			if(grille[x][y].getO()!=Gardien.getg() && grille[x][y].getO()!=Intrus.getS(x,y))
				grille[x][y]=new Case(Intrus.getS3());
			else
			{
				x=r.nextInt(n);
				y=r.nextInt(n);
				grille[x][y]=new Case(Intrus.getS3());
			}
			
			x=r.nextInt(n);
			y=r.nextInt(n);
			
			if(grille[x][y].getO()!=Gardien.getg() && grille[x][y].getO()!=Intrus.getS(x,y))
				grille[x][y]=new Case(Intrus.getS4());
			else
			{
				x=r.nextInt(n);
				y=r.nextInt(n);
				grille[x][y]=new Case(Intrus.getS4());
			}
			
		
		
	}

	public String toString(){
		String s="";
		for(int i =0 ;i<grille.length ; i++){
			for(int j=0 ;j<grille.length; j++){
				s+="|" +grille[i][j].getType(grille[i][j].getO()/*,i,j*/);
			}
			s+="|";
			s+="\n";
		}
		
		return s;
	}
}
