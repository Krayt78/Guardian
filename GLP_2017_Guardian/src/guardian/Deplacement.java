package guardian;

public class Deplacement {
	
	public static void deplacerH(){
		Obstacles tmp=null;
		int ligne=0; int colone=0;
		for(int i =0 ;i<Grille.grille.length ;i++){
			for(int j =0 ;j<Grille.grille.length ;j++){
				if(Grille.grille[i][j].getO()==Grille.o[4]){
					tmp =Grille.grille[i][j].getO();
					ligne =i;
					colone=j;
					break;
				}
			}
			if(tmp!=null)
			  break;
		}
		
	
		if(ligne-1>=0 /*&& Grille.grille[ligne-1][colone].getO()!=o[1]*/ && Grille.grille[ligne-1][colone].getO()!=Grille.o[2] && Grille.grille[ligne-1][colone].getO()!=Grille.o[3] ){
			if(Grille.grille[ligne-1][colone].getO()==Grille.o[5])
				Grille.counter--;
			if (Grille.save ==0)
				Grille.grille[ligne][colone].setO(Grille.o[0]);
			if (Grille.save ==1)
			{
				Grille.grille[ligne][colone].setO(Grille.o[1]);
				Grille.save = 0;
			}
			if(Grille.grille[ligne-1][colone].getO()==Grille.o[1])
				Grille.save = 1;
			
			Grille.grille[ligne-1][colone].setO(tmp);
		
	    }
		
		
	}
	/*	else if (grille[ligne-1][colone]==obstacle)
		{
			if 
		}
		else
		{
			System.out.println("Vous sortez de la grille !! ");
		} 9*/
	
	public static void deplacerB(){
		Obstacles tmp=null;
		int ligne=0; int colone=0;
		for(int i =0 ;i<Grille.grille.length ;i++){
			for(int j =0 ;j<Grille.grille.length ;j++){
				if(Grille.grille[i][j].getO()==Grille.o[4]){
					tmp =Grille.grille[i][j].getO();
					ligne =i;
					colone=j;
					break;
				}
			}
			if(tmp!=null)
			  break;	
		}
		if(ligne+1>=0 /*&& Grille.grille[ligne-1][colone].getO()!=o[1]*/ && Grille.grille[ligne+1][colone].getO()!=Grille.o[2] && Grille.grille[ligne+1][colone].getO()!=Grille.o[3] ){
			if(Grille.grille[ligne+1][colone].getO()==Grille.o[5])
				Grille.counter--;
			if (Grille.save ==0)
				Grille.grille[ligne][colone].setO(Grille.o[0]);
			if (Grille.save ==1)
			{
				Grille.grille[ligne][colone].setO(Grille.o[1]);
				Grille.save = 0;
			}
			if(Grille.grille[ligne+1][colone].getO()==Grille.o[1])
				Grille.save = 1;
			
			Grille.grille[ligne+1][colone].setO(tmp);
		
	    }
	}
	
	public static void deplacerD(){
		Obstacles tmp=null;
		int ligne=0; int colone=0;
		for(int i =0 ;i<Grille.grille.length ;i++){
			for(int j =0 ;j<Grille.grille.length ;j++){
				if(Grille.grille[i][j].getO()==Grille.o[4]){
					tmp =Grille.grille[i][j].getO();
					ligne =i;
					colone=j;
					break;
				}
			}
			if(tmp!=null)
			  break;
		}
		if(colone+1>=0 && Grille.grille[ligne][colone+1].getO()!=Grille.o[2] && Grille.grille[ligne][colone+1].getO()!=Grille.o[3] ){
			if(Grille.grille[ligne][colone+1].getO()==Grille.o[5])
				Grille.counter--;
			if (Grille.save ==0)
				Grille.grille[ligne][colone].setO(Grille.o[0]);
			if (Grille.save ==1)
			{
				Grille.grille[ligne][colone].setO(Grille.o[1]);
				Grille.save = 0;
			}
			if(Grille.grille[ligne][colone+1].getO()==Grille.o[1])
				Grille.save = 1;
			
			Grille.grille[ligne][colone+1].setO(tmp);
	    }
	}
	
	public static void deplacerG(){
		Obstacles tmp=null;
		int ligne=0; int colone=0;
		for(int i =0 ;i<Grille.grille.length ;i++){
			for(int j =0 ;j<Grille.grille.length ;j++){
				if(Grille.grille[i][j].getO()==Grille.o[4]){
					tmp =Grille.grille[i][j].getO();
					ligne =i;
					colone=j;
					break;
				}
			}
			if(tmp!=null)
			  break;
		}
		if(colone-1>=0 && Grille.grille[ligne][colone-1].getO()!=Grille.o[2] && Grille.grille[ligne][colone-1].getO()!=Grille.o[3] ){
			if(Grille.grille[ligne][colone-1].getO()==Grille.o[5])
				Grille.counter--;
			if (Grille.save ==0)
				Grille.grille[ligne][colone].setO(Grille.o[0]);
			if (Grille.save ==1)
			{
				Grille.grille[ligne][colone].setO(Grille.o[1]);
				Grille.save = 0;
			}
			if(Grille.grille[ligne][colone-1].getO()==Grille.o[1])
				Grille.save = 1;
			
			Grille.grille[ligne][colone-1].setO(tmp);
	    }
	}
}
