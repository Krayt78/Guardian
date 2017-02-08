package guardian;

public class Case {
	private Obstacles o;
	public Case (Obstacles o)
	{
		this.o=o;
	}
	public Obstacles getO() {
		return o;
	}
	public void setO(Obstacles o) {
		this.o = o;
	}
	
	public String getType(Obstacles x/*,int i,int j*/) {
		String type="*";
		if(x==Obstacles.getA())
			type="a";
		if(x==Obstacles.getM())
			type="m";
		if(x==Obstacles.getE())
			type="e";
		if(x==Gardien.getg())
			type="g";
		if(x==Intrus.getS1())
			type="1";
		if(x==Intrus.getS2())
			type="2";
		if(x==Intrus.getS3())
			type="3";
		if(x==Intrus.getS4())
			type="4";
		return type;
	}

}
