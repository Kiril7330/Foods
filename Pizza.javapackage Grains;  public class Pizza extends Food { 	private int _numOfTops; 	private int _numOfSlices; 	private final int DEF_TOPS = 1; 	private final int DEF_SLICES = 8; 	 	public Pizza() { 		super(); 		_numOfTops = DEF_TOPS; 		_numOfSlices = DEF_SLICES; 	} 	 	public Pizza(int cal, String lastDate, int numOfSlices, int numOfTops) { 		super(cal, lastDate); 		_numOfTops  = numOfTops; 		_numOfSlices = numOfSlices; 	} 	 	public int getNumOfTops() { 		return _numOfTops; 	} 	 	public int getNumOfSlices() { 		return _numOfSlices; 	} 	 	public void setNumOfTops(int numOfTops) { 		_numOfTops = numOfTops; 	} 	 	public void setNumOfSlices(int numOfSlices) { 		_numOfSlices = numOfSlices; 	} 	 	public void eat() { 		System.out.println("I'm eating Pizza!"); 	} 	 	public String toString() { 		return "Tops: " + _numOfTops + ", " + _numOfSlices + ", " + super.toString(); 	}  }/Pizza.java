package Grains;

public class Pizza extends Food {
	private int _numOfTops;
	private int _numOfSlices;
	private final int DEF_TOPS = 1;
	private final int DEF_SLICES = 8;
	
	public Pizza() {
		super();
		_numOfTops = DEF_TOPS;
		_numOfSlices = DEF_SLICES;
	}
	
	public Pizza(int cal, String lastDate, int numOfSlices, int numOfTops) {
		super(cal, lastDate);
		_numOfTops  = numOfTops;
		_numOfSlices = numOfSlices;
	}
	
	public int getNumOfTops() {
		return _numOfTops;
	}
	
	public int getNumOfSlices() {
		return _numOfSlices;
	}
	
	public void setNumOfTops(int numOfTops) {
		_numOfTops = numOfTops;
	}
	
	public void setNumOfSlices(int numOfSlices) {
		_numOfSlices = numOfSlices;
	}
	
	public void eat() {
		System.out.println("I'm eating Pizza!");
	}
	
	public String toString() {
		return "Tops: " + _numOfTops + ", " + _numOfSlices + ", " + super.toString();
	}

} // End of Pizza class.


