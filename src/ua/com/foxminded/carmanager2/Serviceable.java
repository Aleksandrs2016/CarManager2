package ua.com.foxminded.carmanager2;

public interface Serviceable {
	
	public boolean isReadyToService();
	
	public int getDistance();
	
	public int getDistanceOnService();

	public void addDistance(int additionalDistance);
	
	public void addDistance(double additionalDistance);
	
	public void services();
	
	
}
