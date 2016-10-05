
public class WashingMachine 
{
	private double _Timer;
	private int _IDNumber;
	private boolean _Availability;
	private boolean _Working;
	
	public void setTimer(double timer)
	{
		_Timer = timer;
	}
	public double getTimer()
	{
		return _Timer;
	}
	public int getID()
	{
		return _IDNumber;
	}
	public boolean getAvailability()
	{
		return _Availability;
	}
	public boolean getWorking()
	{
		return _Working;
	}
	public void setAvailability(boolean availability)
	{
		_Availability = availability;
	}
	public void setWorking(boolean working)
	{
		_Working = working;
	}
	public WashingMachine(int ID, boolean availability, boolean working)
	{
		_IDNumber = ID;
		_Availability = availability;
		_Working = working;
	}
}
