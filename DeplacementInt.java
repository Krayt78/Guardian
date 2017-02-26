package guardian;

import java.util.Random;

public class DeplacementInt {
	
	
	/**
	 * pour les Intrus dynamiques il faut trouver tous les Intrus( pas suelment un seul intru comme le Gardien)
	 *  les valeurs possible de x ou y {-1,0,1}
	 */
	public static void DeplacerInt(int x ,int y)
	{
		
		for(int i=0;i<Grille.getDemension();i++)
		{
			for(int j=0;j<Grille.getDemension();j++)
			{
				if(Grille.getGrille()[i][j].getO()==Intrus.getD())
				{
					
					if(i+x>=0 && j+y>=0 && i+x<Grille.getDemension() && j+y<Grille.getDemension() )
					{
						
						if(Grille.getGrille()[i+x][j+y].getO() ==Obstacles.getHerb()){ //les intrus dynamiques bouger seulement sur l'herbe
							
						Grille.getGrille()[i][j].setO(Obstacles.getHerb());
						Grille.getGrille()[i+x][j+y].setO(Intrus.getD());
						}
					}

				}
			}
		}
		
	}
/*	public static void deplacerRand(){
		Obstacles  tmp=null;
	//	int cmpt=0;//compteur augemente a chaque intru trouve 
		int ligne=0; int colonne=0;
		for(int i =0 ;i<Grille.getGrille().length ;i++){
			for(int j =0 ;j<Grille.getGrille().length ;j++){
				if(Grille.getGrille()[i][j].getO()==Intrus.getD()){//Intrus.getD()=>Dynamique
					tmp =Grille.getGrille()[i][j].getO();
				//	cmpt++;					
					ligne =i;
					colonne=j;
					//break; il faut trouver tous les intrus Dynamique pas un seul
				}
			}
			//if(tmp!=null)
			//  break;
		}
		Random r = new Random();
		int x = 2,y = 2;
		int i = r.nextInt(2);
		if(i==0)
		{
			 x=r.nextInt(2);
		}
			
		else
			{
				y=r.nextInt(2);
			}
		
	if (x == 0)
		{
			if(ligne-1>=0 && Grille.getGrille()[ligne-1][colonne].getO()!=Obstacles.getE() 
					&& Grille.getGrille()[ligne-1][colonne].getO()!=Obstacles.getM() && 
					Grille.getGrille()[ligne-1][colonne].getO()!=Obstacles.getA() &&
					Grille.getGrille()[ligne-1][colonne].getO()!=Intrus.getS(ligne-1,colonne) 
					&& Grille.getGrille()[ligne-1][colonne].getO()!=Gardien.getg()){
				{
				if(Grille.getGrille()[ligne-1][colonne].getO()==Intrus.getS(ligne-1,colonne))
					{
						Grille.counter--;
						if(Intrus.getS(ligne-1,colonne)==Intrus.getS())
						{
							UI.aliverand = 0;
						}
					}
				if (Grille.saveint ==0)
					Grille.getGrille()[ligne][colonne].setO(Obstacles.getHerb());
				if (Grille.saveint ==1)
				{
					Grille.getGrille()[ligne][colonne].setO(Obstacles.getA());
					Grille.saveint = 0;
				}
				if(Grille.getGrille()[ligne-1][colonne].getO()==Obstacles.getA())
					Grille.saveint = 1;
				
				Grille.getGrille()[ligne-1][colonne].setO(tmp);
			
		    }
		}
		}
	if(x == 1)
	{
		if(ligne+1<Grille.getDemension() && Grille.getGrille()[ligne+1][colonne].getO()!=Obstacles.getE() && Grille.getGrille()[ligne+1][colonne].getO()!=Obstacles.getM() && Grille.getGrille()[ligne+1][colonne].getO()!=Obstacles.getA() && Grille.getGrille()[ligne+1][colonne].getO()!=Intrus.getS(ligne+1,colonne)&& Grille.getGrille()[ligne+1][colonne].getO()!=Gardien.getg())
		{
			if(Grille.getGrille()[ligne+1][colonne].getO()==Intrus.getS(ligne+1,colonne))
			{
				Grille.counter--;
				if(Intrus.getS(ligne+1,colonne)==Intrus.getS())
				{
					UI.aliverand = 0;
				}
			}
			if (Grille.saveint ==0)
				Grille.getGrille()[ligne][colonne].setO(Obstacles.getHerb());
			if (Grille.saveint ==1)
			{
				Grille.getGrille()[ligne][colonne].setO(Obstacles.getA());
				Grille.saveint = 0;
			}
			if(Grille.getGrille()[ligne+1][colonne].getO()==Obstacles.getA())
				Grille.saveint = 1;
			
			Grille.getGrille()[ligne+1][colonne].setO(tmp);
		
	    }
	}
	
	if(y == 0)
	{
		if(colonne-1>=0 && Grille.getGrille()[ligne][colonne-1].getO()!=Obstacles.getE() && Grille.getGrille()[ligne][colonne-1].getO()!=Obstacles.getM()&& Grille.getGrille()[ligne][colonne-1].getO()!=Obstacles.getA() && Grille.getGrille()[ligne][colonne-1].getO()!=Intrus.getS(ligne,colonne-1)&& Grille.getGrille()[ligne][colonne-1].getO()!=Gardien.getg()){
			if(Grille.getGrille()[ligne][colonne-1].getO()==Intrus.getS(ligne,colonne-1))
			{
				Grille.counter--;
				if(Intrus.getS(ligne,colonne-1)==Intrus.getS())
				{
					UI.aliverand = 0;
				}
			}
			if (Grille.saveint ==0)
				Grille.getGrille()[ligne][colonne].setO(Obstacles.getHerb());
			if (Grille.saveint ==1)
			{
				Grille.getGrille()[ligne][colonne].setO(Obstacles.getA());
				Grille.saveint = 0;
			}
			if(Grille.getGrille()[ligne][colonne-1].getO()==Obstacles.getA())
				Grille.saveint = 1;
			
			Grille.getGrille()[ligne][colonne-1].setO(tmp);
	    }
	}
	
	if(y == 1)
	{
		if(colonne+1<Grille.getDemension() && Grille.getGrille()[ligne][colonne+1].getO()!=Obstacles.getE() && Grille.getGrille()[ligne][colonne+1].getO()!=Obstacles.getM() && Grille.getGrille()[ligne][colonne+1].getO()!=Obstacles.getA() && Grille.getGrille()[ligne][colonne+1].getO()!=Intrus.getS(ligne,colonne+1)&& Grille.getGrille()[ligne][colonne+1].getO()!=Gardien.getg()){
			if(Grille.getGrille()[ligne][colonne+1].getO()==Intrus.getS(ligne,colonne+1))
			{
				Grille.counter--;
				if(Intrus.getS(ligne,colonne+1)==Intrus.getS())
				{
					UI.aliverand = 0;
				}
			}
			if (Grille.saveint ==0)
				Grille.getGrille()[ligne][colonne].setO(Obstacles.getHerb());
			if (Grille.saveint ==1)
			{
				Grille.getGrille()[ligne][colonne].setO(Obstacles.getA());
				Grille.saveint = 0;
			}
			if(Grille.getGrille()[ligne][colonne+1].getO()==Obstacles.getA())
				Grille.saveint = 1;
			
			Grille.getGrille()[ligne][colonne+1].setO(tmp);
	    }
	}
	}*/
}