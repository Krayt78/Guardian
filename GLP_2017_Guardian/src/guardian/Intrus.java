package guardian;

public class Intrus {
	private static Obstacles D = new Obstacles(9);
	private static Obstacles S1 = new Obstacles(8);
	private static Obstacles S2 = new Obstacles(7);
	private static Obstacles S3 = new Obstacles(6);
	private static Obstacles S4;
  
	public Obstacles getD() {
		return D;
	}
	public void setD(Obstacles d) {
		D = d;
	}
	
	public static Obstacles getS(int i, int j) {
		if(Grille.grille[i][j].getO()==S1)
			return S1;
		if(Grille.grille[i][j].getO()==S2)
			return S2;
		if(Grille.grille[i][j].getO()==S3)
			return S3;
		if(Grille.grille[i][j].getO()==S4)
			return S4;
		return null;
	}
	
	public static Obstacles getS1() {
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
	

}