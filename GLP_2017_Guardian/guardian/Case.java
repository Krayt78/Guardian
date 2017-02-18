package guardian;

public class Case {
	private Obstacles o;
	public Case (Obstacles obstacles)
	{
		this.o=obstacles;
	}
	public Obstacles getO() {
		return o;
	}
	public void setO(Obstacles o) {
		this.o = o;
	}
	
	public String getType(Obstacles x/*,int i,int j*/) {
		String type="0";
		if(x==Obstacles.getA())
			type="1";
		if(x==Obstacles.getM())
			type="2";
		if(x==Obstacles.getE())
			type="3";
		if(x==Gardien.getg())
			type="4";
		if(x==Intrus.getS1())
			type="5";
		if(x==Intrus.getS2())
			type="5";
		if(x==Intrus.getS3())
			type="5";
		if(x==Intrus.getS4())
			type="5";
		return type;
	}

}
