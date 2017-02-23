package guardian;

import java.util.Random;

public class DeplacementInt {
	public static void deplacerRand(){
		Obstacles tmp=null;
		int ligne=0; int colonne=0;
		for(int i =0 ;i<Grille.grille.length ;i++){
			for(int j =0 ;j<Grille.grille.length ;j++){
				if(Grille.grille[i][j].getO()==Intrus.getS1()){
					tmp =Grille.grille[i][j].getO();
					ligne =i;
					colonne=j;
					break;
				}
			}
			if(tmp!=null)
			  break;
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
			if(ligne-1>=0 && Grille.grille[ligne-1][colonne].getO()!=Obstacles.getE() && Grille.grille[ligne-1][colonne].getO()!=Obstacles.getM() && Grille.grille[ligne-1][colonne].getO()!=Obstacles.getA() && Grille.grille[ligne-1][colonne].getO()!=Intrus.getS(ligne-1,colonne) && Grille.grille[ligne-1][colonne].getO()!=Gardien.getg()){
				{
				if(Grille.grille[ligne-1][colonne].getO()==Intrus.getS(ligne-1,colonne))
					{
						Grille.counter--;
						if(Intrus.getS(ligne-1,colonne)==Intrus.getS1())
						{
							UI.aliverand = 0;
						}
					}
				if (Grille.saveint ==0)
					Grille.grille[ligne][colonne].setO(Obstacles.getHerb());
				if (Grille.saveint ==1)
				{
					Grille.grille[ligne][colonne].setO(Obstacles.getA());
					Grille.saveint = 0;
				}
				if(Grille.grille[ligne-1][colonne].getO()==Obstacles.getA())
					Grille.saveint = 1;
				
				Grille.grille[ligne-1][colonne].setO(tmp);
			
		    }
		}
		}
	if(x == 1)
	{
		if(ligne+1<Grille.demension && Grille.grille[ligne+1][colonne].getO()!=Obstacles.getE() && Grille.grille[ligne+1][colonne].getO()!=Obstacles.getM() && Grille.grille[ligne+1][colonne].getO()!=Obstacles.getA() && Grille.grille[ligne+1][colonne].getO()!=Intrus.getS(ligne+1,colonne)&& Grille.grille[ligne+1][colonne].getO()!=Gardien.getg())
		{
			if(Grille.grille[ligne+1][colonne].getO()==Intrus.getS(ligne+1,colonne))
			{
				Grille.counter--;
				if(Intrus.getS(ligne+1,colonne)==Intrus.getS1())
				{
					UI.aliverand = 0;
				}
			}
			if (Grille.saveint ==0)
				Grille.grille[ligne][colonne].setO(Obstacles.getHerb());
			if (Grille.saveint ==1)
			{
				Grille.grille[ligne][colonne].setO(Obstacles.getA());
				Grille.saveint = 0;
			}
			if(Grille.grille[ligne+1][colonne].getO()==Obstacles.getA())
				Grille.saveint = 1;
			
			Grille.grille[ligne+1][colonne].setO(tmp);
		
	    }
	}
	
	if(y == 0)
	{
		if(colonne-1>=0 && Grille.grille[ligne][colonne-1].getO()!=Obstacles.getE() && Grille.grille[ligne][colonne-1].getO()!=Obstacles.getM()&& Grille.grille[ligne][colonne-1].getO()!=Obstacles.getA() && Grille.grille[ligne][colonne-1].getO()!=Intrus.getS(ligne,colonne-1)&& Grille.grille[ligne][colonne-1].getO()!=Gardien.getg()){
			if(Grille.grille[ligne][colonne-1].getO()==Intrus.getS(ligne,colonne-1))
			{
				Grille.counter--;
				if(Intrus.getS(ligne,colonne-1)==Intrus.getS1())
				{
					UI.aliverand = 0;
				}
			}
			if (Grille.saveint ==0)
				Grille.grille[ligne][colonne].setO(Obstacles.getHerb());
			if (Grille.saveint ==1)
			{
				Grille.grille[ligne][colonne].setO(Obstacles.getA());
				Grille.saveint = 0;
			}
			if(Grille.grille[ligne][colonne-1].getO()==Obstacles.getA())
				Grille.saveint = 1;
			
			Grille.grille[ligne][colonne-1].setO(tmp);
	    }
	}
	
	if(y == 1)
	{
		if(colonne+1<Grille.demension && Grille.grille[ligne][colonne+1].getO()!=Obstacles.getE() && Grille.grille[ligne][colonne+1].getO()!=Obstacles.getM() && Grille.grille[ligne][colonne+1].getO()!=Obstacles.getA() && Grille.grille[ligne][colonne+1].getO()!=Intrus.getS(ligne,colonne+1)&& Grille.grille[ligne][colonne+1].getO()!=Gardien.getg()){
			if(Grille.grille[ligne][colonne+1].getO()==Intrus.getS(ligne,colonne+1))
			{
				Grille.counter--;
				if(Intrus.getS(ligne,colonne+1)==Intrus.getS1())
				{
					UI.aliverand = 0;
				}
			}
			if (Grille.saveint ==0)
				Grille.grille[ligne][colonne].setO(Obstacles.getHerb());
			if (Grille.saveint ==1)
			{
				Grille.grille[ligne][colonne].setO(Obstacles.getA());
				Grille.saveint = 0;
			}
			if(Grille.grille[ligne][colonne+1].getO()==Obstacles.getA())
				Grille.saveint = 1;
			
			Grille.grille[ligne][colonne+1].setO(tmp);
	    }
	}
	}
}
			