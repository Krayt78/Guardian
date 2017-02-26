package guardian;

public class Intrus {
	private static Obstacles D = new Obstacles(6);//intrus dynamiques
	private static Obstacles S = new Obstacles(5);//intrus Statiques
//	private static Obstacles S2 = new Obstacles(7);//c'est faut !!
	//private static Obstacles S3 = new Obstacles(6);
//	private static Obstacles S4;
  
	
	public void setD(Obstacles d) {
		D = d;
	}
	
	public static Obstacles getS(int i, int j) {
		if(Grille.getGrille()[i][j].getO()==S)
			return S;
		if(Grille.getGrille()[i][j].getO()==D)
			return D;
		/*if(Grille.grille[i][j].getO()==S3)
			return S3;
		if(Grille.grille[i][j].getO()==S4)
			return S4;*/
		return null;
	}
	
	public static Obstacles getS() {
		return S;
	}
	public static Obstacles getD() {
		return D;
	}
	/*public static Obstacles getS1() {
		return S1;
	}
	public static Obstacles getS2() {
		return S2;
	}
	public static Obstacles getS3() {
		return S3;
	}
	public static Obstacles getS4() {
		return S4;
	}
	*/

}