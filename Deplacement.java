package guardian;



public class Deplacement {
	
	public static void deplacerG(){
		Obstacles tmp=null;
		int ligne=0; int colonne=0;
		for(int i =0 ;i<Grille.getGrille().length ;i++){
			for(int j =0 ;j<Grille.getGrille().length ;j++){
				if(Grille.getGrille()[i][j].getO()==Gardien.getg()){
					tmp =Grille.getGrille()[i][j].getO();
					ligne =i;
					colonne=j;
					break;
				}
			}
			if(tmp!=null)
			  break;
		}
		
	
		if(ligne-1>=0  && Grille.getGrille()[ligne-1][colonne].getO()!=Obstacles.getE() && Grille.getGrille()[ligne-1][colonne].getO()!=Obstacles.getM() ){
			if(Grille.getGrille()[ligne-1][colonne].getO()==Intrus.getS(ligne-1,colonne))
				Grille.counter--;
			if (Grille.save ==0)
				Grille.getGrille()[ligne][colonne].setO(Obstacles.getHerb());
			if (Grille.save ==1)
			{
				Grille.getGrille()[ligne][colonne].setO(Obstacles.getA());
				Grille.save = 0;
			}
			if(Grille.getGrille()[ligne-1][colonne].getO()==Obstacles.getA())
				Grille.save = 1;
			
			Grille.getGrille()[ligne-1][colonne].setO(tmp);
			DeplacementInt.DeplacerInt(-1, 0);//deplacer les intrus dynamique 
		
	    }
		
		
	}

	public static void deplacerD(){
		Obstacles tmp=null;
		int ligne=0; int colonne=0;
		for(int i =0 ;i<Grille.getGrille().length ;i++){
			for(int j =0 ;j<Grille.getGrille().length ;j++){
				if(Grille.getGrille()[i][j].getO()==Gardien.getg()){
					tmp =Grille.getGrille()[i][j].getO();
					ligne =i;
					colonne=j;
					break;
				}
			}
			if(tmp!=null)
			  break;	
		}
		if(ligne+1<Grille.getDemension() && Grille.getGrille()[ligne+1][colonne].getO()!=Obstacles.getE() && Grille.getGrille()[ligne+1][colonne].getO()!=Obstacles.getM() ){
			if(Grille.getGrille()[ligne+1][colonne].getO()==Intrus.getS(ligne+1,colonne))
				Grille.counter--;
			if (Grille.save ==0)
				Grille.getGrille()[ligne][colonne].setO(Obstacles.getHerb());
			if (Grille.save ==1)
			{
				Grille.getGrille()[ligne][colonne].setO(Obstacles.getA());
				Grille.save = 0;
			}
			if(Grille.getGrille()[ligne+1][colonne].getO()==Obstacles.getA())
				Grille.save = 1;
			
			Grille.getGrille()[ligne+1][colonne].setO(tmp);
			DeplacementInt.DeplacerInt(1, 0);
		
	    }
	}
	
	public static void deplacerH(){
		Obstacles tmp=null;
		int ligne=0; int colonne=0;
		for(int i =0 ;i<Grille.getGrille().length ;i++){
			for(int j =0 ;j<Grille.getGrille().length ;j++){
				if(Grille.getGrille()[i][j].getO()==Gardien.getg()){
					tmp =Grille.getGrille()[i][j].getO();
					ligne =i;
					colonne=j;
					break;
				}
			}
			if(tmp!=null)
			  break;
		}
		if(colonne+1<Grille.getDemension() && Grille.getGrille()[ligne][colonne+1].getO()!=Obstacles.getE() && Grille.getGrille()[ligne][colonne+1].getO()!=Obstacles.getM() ){
			if(Grille.getGrille()[ligne][colonne+1].getO()==Intrus.getS(ligne,colonne+1))
				Grille.counter--;
			if (Grille.save ==0)
				Grille.getGrille()[ligne][colonne].setO(Obstacles.getHerb());
			if (Grille.save ==1)
			{
				Grille.getGrille()[ligne][colonne].setO(Obstacles.getA());
				Grille.save = 0;
			}
			if(Grille.getGrille()[ligne][colonne+1].getO()==Obstacles.getA())
				Grille.save = 1;
			
			Grille.getGrille()[ligne][colonne+1].setO(tmp);
			DeplacementInt.DeplacerInt(0, 1);
	    }
	}
	
	public static void deplacerB(){
		Obstacles tmp=null;
		int ligne=0; int colonne=0;
		for(int i =0 ;i<Grille.getGrille().length ;i++){
			for(int j =0 ;j<Grille.getGrille().length ;j++){
				if(Grille.getGrille()[i][j].getO()==Gardien.getg()){
					tmp =Grille.getGrille()[i][j].getO();
					ligne =i;
					colonne=j;
					break;
				}
			}
			if(tmp!=null)
			  break;
		}
		if(colonne-1>=0 && Grille.getGrille()[ligne][colonne-1].getO()!=Obstacles.getE() && Grille.getGrille()[ligne][colonne-1].getO()!=Obstacles.getM() ){
			if(Grille.getGrille()[ligne][colonne-1].getO()==Intrus.getS(ligne,colonne-1))
				Grille.counter--;
			if (Grille.save ==0)
				Grille.getGrille()[ligne][colonne].setO(Obstacles.getHerb());
			if (Grille.save ==1)
			{
				Grille.getGrille()[ligne][colonne].setO(Obstacles.getA());
				Grille.save = 0;
			}
			if(Grille.getGrille()[ligne][colonne-1].getO()==Obstacles.getA())
				Grille.save = 1;
			
			Grille.getGrille()[ligne][colonne-1].setO(tmp);
			DeplacementInt.DeplacerInt(0 ,-1);
	    }
	}
}