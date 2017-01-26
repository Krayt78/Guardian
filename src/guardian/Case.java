package guardian;

public class Case {
		String herbe;
		String terraindebase;
		String eau;
		String arbre;
		String mur;
		
		Guardien g = new Guardien();
		Intrus i = new Intrus();
		
		public String obst(int pass,int look)
		{
			if(pass==1 && look==0)
			{
				return arbre;
			}
			if(pass==0 && look==1)
			{
				return eau;
			}
			if(pass==0 && look==0)
			{
				return mur;
			}
			else
				return herbe;	
		}
		
}
