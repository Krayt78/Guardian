package guardian;

public class Deplacement {
	
	public static void deplacerH(){
		Obstacles tmp=null;
		int ligne=0; int colonne=0;
		for(int i =0 ;i<Grille.grille.length ;i++){
			for(int j =0 ;j<Grille.grille.length ;j++){
				if(Grille.grille[i][j].getO()==Gardien.getg()){
					tmp =Grille.grille[i][j].getO();
					ligne =i;
					colonne=j;
					break;
				}
			}
			if(tmp!=null)
			  break;
		}
		
	
		if(ligne-1>=0 /*&& Grille.grille[ligne-1][colonne].getO()!=o[1]*/ && Grille.grille[ligne-1][colonne].getO()!=Obstacles.getE() && Grille.grille[ligne-1][colonne].getO()!=Obstacles.getM() ){
			if(Grille.grille[ligne-1][colonne].getO()==Intrus.getS(ligne-1,colonne))
				Grille.counter--;
			if (Grille.save ==0)
				Grille.grille[ligne][colonne].setO(Obstacles.getHerb());
			if (Grille.save ==1)
			{
				Grille.grille[ligne][colonne].setO(Obstacles.getA());
				Grille.save = 0;
			}
			if(Grille.grille[ligne-1][colonne].getO()==Obstacles.getA())
				Grille.save = 1;
			
			Grille.grille[ligne-1][colonne].setO(tmp);
		
	    }
		
		
	}
	/*	else if (grille[ligne-1][colonne]==obstacle)
		{
			if 
		}
		else
		{
			System.out.println("Vous sortez de la grille !! ");
		} 9*/
	
	public static void deplacerB(){
		Obstacles tmp=null;
		int ligne=0; int colonne=0;
		for(int i =0 ;i<Grille.grille.length ;i++){
			for(int j =0 ;j<Grille.grille.length ;j++){
				if(Grille.grille[i][j].getO()==Gardien.getg()){
					tmp =Grille.grille[i][j].getO();
					ligne =i;
					colonne=j;
					break;
				}
			}
			if(tmp!=null)
			  break;	
		}
		if(ligne+1>=0 /*&& Grille.grille[ligne-1][colonne].getO()!=o[1]*/ && Grille.grille[ligne+1][colonne].getO()!=Obstacles.getE() && Grille.grille[ligne+1][colonne].getO()!=Obstacles.getM() ){
			if(Grille.grille[ligne+1][colonne].getO()==Intrus.getS(ligne+1,colonne))
				Grille.counter--;
			if (Grille.save ==0)
				Grille.grille[ligne][colonne].setO(Obstacles.getHerb());
			if (Grille.save ==1)
			{
				Grille.grille[ligne][colonne].setO(Obstacles.getA());
				Grille.save = 0;
			}
			if(Grille.grille[ligne+1][colonne].getO()==Obstacles.getA())
				Grille.save = 1;
			
			Grille.grille[ligne+1][colonne].setO(tmp);
		
	    }
	}
	
	public static void deplacerD(){
		Obstacles tmp=null;
		int ligne=0; int colonne=0;
		for(int i =0 ;i<Grille.grille.length ;i++){
			for(int j =0 ;j<Grille.grille.length ;j++){
				if(Grille.grille[i][j].getO()==Gardien.getg()){
					tmp =Grille.grille[i][j].getO();
					ligne =i;
					colonne=j;
					break;
				}
			}
			if(tmp!=null)
			  break;
		}
		if(colonne+1>=0 && Grille.grille[ligne][colonne+1].getO()!=Obstacles.getE() && Grille.grille[ligne][colonne+1].getO()!=Obstacles.getM() ){
			if(Grille.grille[ligne][colonne+1].getO()==Intrus.getS(ligne,colonne+1))
				Grille.counter--;
			if (Grille.save ==0)
				Grille.grille[ligne][colonne].setO(Obstacles.getHerb());
			if (Grille.save ==1)
			{
				Grille.grille[ligne][colonne].setO(Obstacles.getA());
				Grille.save = 0;
			}
			if(Grille.grille[ligne][colonne+1].getO()==Obstacles.getA())
				Grille.save = 1;
			
			Grille.grille[ligne][colonne+1].setO(tmp);
	    }
	}
	
	public static void deplacerG(){
		Obstacles tmp=null;
		int ligne=0; int colonne=0;
		for(int i =0 ;i<Grille.grille.length ;i++){
			for(int j =0 ;j<Grille.grille.length ;j++){
				if(Grille.grille[i][j].getO()==Gardien.getg()){
					tmp =Grille.grille[i][j].getO();
					ligne =i;
					colonne=j;
					break;
				}
			}
			if(tmp!=null)
			  break;
		}
		if(colonne-1>=0 && Grille.grille[ligne][colonne-1].getO()!=Obstacles.getE() && Grille.grille[ligne][colonne-1].getO()!=Obstacles.getM() ){
			if(Grille.grille[ligne][colonne-1].getO()==Intrus.getS(ligne,colonne-1))
				Grille.counter--;
			if (Grille.save ==0)
				Grille.grille[ligne][colonne].setO(Obstacles.getHerb());
			if (Grille.save ==1)
			{
				Grille.grille[ligne][colonne].setO(Obstacles.getA());
				Grille.save = 0;
			}
			if(Grille.grille[ligne][colonne-1].getO()==Obstacles.getA())
				Grille.save = 1;
			
			Grille.grille[ligne][colonne-1].setO(tmp);
	    }
	}
}
