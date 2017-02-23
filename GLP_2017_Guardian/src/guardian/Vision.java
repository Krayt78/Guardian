package guardian;

public class Vision {
	
	public boolean getVision() {
		return Case.Vision;
	}
	
	public static void playervision()
	{
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
		for (int x=0;x<Grille.demension;x++)
			for (int y=0 ; y<Grille.demension;y++)
				Grille.grille[x][y].setVision(false);
				
		for (int x=-2;x<3;x++) {
			for (int y=-2;y<3;y++) {
				if(ligne+x<Grille.demension && ligne+x>-1 && colonne+y<Grille.demension && colonne+y>-1)
				Grille.grille[(ligne+(x))][(colonne+(y))].setVision(true);
				
			}
		}
		if((ligne-1>0 && Grille.grille[ligne-1][colonne].getO()== Obstacles.getM()) || (ligne-1>0 && Grille.grille[ligne-1][colonne].getO()== Obstacles.getA()))
		{
			if(ligne-2>0 )
				Grille.grille[ligne-2][colonne].setVision(false);
		}
		if((ligne+1<Grille.demension && Grille.grille[ligne+1][colonne].getO()== Obstacles.getM())|| (ligne+1<Grille.demension && Grille.grille[ligne+1][colonne].getO()== Obstacles.getA()))
		{
			if(ligne+2<Grille.demension)
				Grille.grille[ligne+2][colonne].setVision(false);
		}
		
		
		if((colonne+1<Grille.demension && Grille.grille[ligne][colonne+1].getO()== Obstacles.getM()) || (colonne+1<Grille.demension && Grille.grille[ligne][colonne+1].getO()== Obstacles.getA()))
		{
			if(colonne+2<Grille.demension)
				Grille.grille[ligne][colonne+2].setVision(false);
		}
		if((colonne-1>0 && Grille.grille[ligne][colonne-1].getO()== Obstacles.getM())|| (colonne-1>0 && Grille.grille[ligne][colonne-1].getO()== Obstacles.getA()))
		{
			if(colonne-2>0)
				Grille.grille[ligne][colonne-2].setVision(false);
		}
		
		
		if((ligne+1<Grille.demension && colonne+1<Grille.demension && Grille.grille[ligne+1][colonne+1].getO()== Obstacles.getM()) || (ligne+1<Grille.demension && colonne+1<Grille.demension && Grille.grille[ligne+1][colonne+1].getO()== Obstacles.getA()))
		{	
			if(ligne+2<Grille.demension && colonne+2<Grille.demension)
				Grille.grille[ligne+2][colonne+2].setVision(false);
			if(ligne+2<Grille.demension && colonne+1<Grille.demension)
				Grille.grille[ligne+2][colonne+1].setVision(false);
			if(ligne+1<Grille.demension && colonne+2<Grille.demension)
				Grille.grille[ligne+1][colonne+2].setVision(false);
		}
		if((ligne+1<Grille.demension && colonne-1 >0 && Grille.grille[ligne+1][colonne-1].getO()== Obstacles.getM()) || (ligne+1<Grille.demension && colonne-1 >0 && Grille.grille[ligne+1][colonne-1].getO()== Obstacles.getA()))
		{
			if(ligne+2<Grille.demension && colonne-2>0)
				Grille.grille[ligne+2][colonne-2].setVision(false);
			if(ligne+1<Grille.demension && colonne-2>0)
				Grille.grille[ligne+1][colonne-2].setVision(false);
			if(ligne+2<Grille.demension && colonne-1>0)
				Grille.grille[ligne+2][colonne-1].setVision(false);
		}
		
		
		if((ligne-1>0 && colonne+1<Grille.demension && Grille.grille[ligne-1][colonne+1].getO()== Obstacles.getM())|| (ligne-1>0 && colonne+1<Grille.demension && Grille.grille[ligne-1][colonne+1].getO()== Obstacles.getA()))
		{
			if(ligne-2>0 && colonne+2<Grille.demension)
				Grille.grille[ligne-2][colonne+2].setVision(false);
			if(ligne-1>0 && colonne+2<Grille.demension)
				Grille.grille[ligne-1][colonne+2].setVision(false);
			if(ligne-2>0 && colonne+1<Grille.demension)
				Grille.grille[ligne-2][colonne+1].setVision(false);
		}
		if((ligne-1>0 && colonne-1>0 && Grille.grille[ligne-1][colonne-1].getO()== Obstacles.getM())|| (ligne-1>0 && colonne-1>0 && Grille.grille[ligne-1][colonne-1].getO()== Obstacles.getA()))
		{
			if(ligne-2>0 && colonne-2>0)
				Grille.grille[ligne-2][colonne-2].setVision(false);
			if(ligne-2>0 && colonne-1>0)
				Grille.grille[ligne-2][colonne-1].setVision(false);
			if(ligne-1>0 && colonne-2>0)
				Grille.grille[ligne-1][colonne-2].setVision(false);
		}
		
		
	}



	public void setVision(boolean vision) {
		Case.Vision = vision;
	}

}

}
