package guardian;

public class Case {
	private Obstacles obstacle ;
	private Intrus intru;
	private Gardien gardien;
	public Gardien getGardien() {
		return gardien;
	}
	public void setGardien(Gardien gardien) {
		this.gardien = gardien;
	}
	public Obstacles getObstacle() {
		return obstacle;
	}
	public void setObstacle(Obstacles obstacle) {
		this.obstacle = obstacle;
	}
	public Intrus getIntru() {
		return intru;
	}
	public void setIntru(Intrus intru) {
		this.intru = intru;
	}
	
	

}
