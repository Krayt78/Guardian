package guardian;

import java.util.Random;

public class Grille {
	private int demension;
	static Case[][] grille;
	private String gardian =" g ";
	static Obstacles[] o = {new Obstacles("*"),new Obstacles("a"),new Obstacles("e"),new Obstacles("m"),new Obstacles("g"),new Obstacles("i")};
	private Case c;
	static int save = 0;
	static int counter = 4;
	
	
	
	
	
	public Grille(int n){
		
		this.demension=n;
		grille =new Case[demension][demension];
		
		for(int i= 0 ; i<demension ;i++){
			
			for(int j=0;j<demension ;j++){
				//o[j]=new Obstacles("*");
				grille[i][j]=new Case(o[0]); //new Case(o[j]);
			}
		}
	}
	
	public void placerJ(int ligne ,int colone ){
		ligne =ligne-1;
		colone --;
		
		if(ligne>=0 &&colone >=0 && ligne<this.demension&&colone <this.demension){
			grille[ligne][colone]=new Case(o[4]);
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
			if(grille[x][y].getO()!=o[4] && grille[x][y].getO()!=o[5])
				grille[x][y]=new Case(o[1]);
		}
		for(int i =0 ;i<k;i++){
			x=r.nextInt(n);
			y=r.nextInt(n);
			//o[i]=new Obstacles("m");
			if(grille[x][y].getO()!=o[4] && grille[x][y].getO()!=o[5])
				grille[x][y]=new Case(o[3]);
		}
		for(int i =0 ;i<k;i++){
			x=r.nextInt(n);
			y=r.nextInt(n);
			//o[i]=new Obstacles("e");
			if(grille[x][y].getO()!=o[4] && grille[x][y].getO()!=o[5])
				grille[x][y]=new Case(o[2]);
		}
		for(int i =0 ;i<4;i++){
			x=r.nextInt(n);
			y=r.nextInt(n);
			//o[i]=new Obstacles("e");
			if(grille[x][y].getO()!=o[4] && grille[x][y].getO()!=o[5])
				grille[x][y]=new Case(o[5]);
			else
				i--;
		}
		
	}

	public Case getCase(int ligne ,int colone){
		ligne --;
		colone --;
		return this.grille[ligne][colone];
	}
	
	
	public String toString(){
		String s="";
		for(int i =0 ;i<grille.length ; i++){
			for(int j=0 ;j<grille.length; j++){
				s+="|" +grille[i][j].getO().getType();
			}
			s+="|";
			s+="\n";
		}
		
		return s;
	}

}
