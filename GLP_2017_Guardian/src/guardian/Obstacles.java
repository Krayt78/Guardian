package guardian;

public class Obstacles{

	private static Obstacles  a = new Obstacles(2);
	private static Obstacles  m = new Obstacles(3);
	private static Obstacles  e = new Obstacles(1) ;
	private static Obstacles  Herb = new Obstacles(0) ;
	private static String type;
	
	
	
	public Obstacles(int string) {
		// TODO Auto-generated constructor stub
		this.type = type;
	}
	
	public void setType(String type) {
		this.type = type;
	} 
	
	public static Obstacles getA() {
		return a;
	}
	public void setA(Obstacles a) {
		this.a = a;
	}
	public static Obstacles getHerb() {
		return Herb;
	}
	public void setHerb(Obstacles Herb) {
		this.Herb = Herb;
	}
	public static Obstacles getM() {
		return m;
	}
	public void setM(Obstacles m) {
		this.m = m;
	}
	public static Obstacles getE() {
		return e;
	}
	public void setE(Obstacles e) {
		this.e = e;
	}

		
}