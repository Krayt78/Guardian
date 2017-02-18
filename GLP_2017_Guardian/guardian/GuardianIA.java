package guardian;

public class GuardianIA {
	
	public GuardianIA()
	{
		while (Grille.counter >0)
		{
			int unit = map.getUnit(selectedx, selectedy);
			map.setUnit(selectedx, selectedy, 0);
			map.setUnit(x,y,unit);
			selectedx = x;
			selectedy = y;
			lastFindX = - 1;
		}
	}
	

}
