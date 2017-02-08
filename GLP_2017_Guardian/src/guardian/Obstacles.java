package guardian;

public class Obstacles{
	private static Obstacles  a = new Obstacles("a") ;
	private static Obstacles  m = new Obstacles("m") ;
	private static Obstacles  e = new Obstacles("e") ;
	private static Obstacles  Herb = new Obstacles("*") ;
	private static String type;
	
	
	
	public Obstacles(String string) {
		// TODO Auto-generated constructor stub
		this.type = type;
	}
	
/*	public String getType(Obstacles x) {
		if(x==a)
			type="a";
		if(x==m)
			type="m";
		if(x==e)
			type="e";
		if(x==Gardien.getg())
			type="g";
		if(x==Intrus.getS())
			type="s";
		return type;
	}*/

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