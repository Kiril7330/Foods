package Grains;

public class Food {
	protected int _cal;
	protected String _lastDate;
	protected final int DEF_CAL = 100;
	protected final String DEF_DATE = "1/1/1999";
	
	public Food () {
		this._cal = DEF_CAL;
		this._lastDate = DEF_DATE;
	}
	
	public Food (int cal, String lastDate) {
		_cal = cal;
		_lastDate = lastDate;
		
	}
	
	public int getCal() {
		return _cal;
	}
	
	public String getLastDate() {
		return _lastDate;
	}
	
	public void setCal(int cal)  {
		_cal = cal;
	}
	
	public void setLastDate(String lastDate) {
		_lastDate = lastDate;
	}
	
	public void eat() {
		System.out.println("I'm eating.");
	}
	
	public String toString() {
		return "Cal: " + _cal + ", " + "Last date of use: " + _lastDate;
	}
	

} // End of Food class.


