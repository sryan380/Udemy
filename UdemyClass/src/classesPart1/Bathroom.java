package classesPart1;

public class Bathroom {
	
	private int toilets;
	private int shower;
	private int bathtub;
	
	public Bathroom(int toilets, int shower, int bathtub) {
		this.toilets = toilets;
		this.shower = shower;
		this.bathtub = bathtub;
	}
	
	public void flushToilet() {
		System.out.println("Toilet Flushing");
	}
	public int getToilets() {
		return toilets;
	}
	public void setToilets(int toilets) {
		this.toilets = toilets;
	}
	public int getShower() {
		return shower;
	}
	public void setShower(int shower) {
		this.shower = shower;
	}
	public int getBathtub() {
		return bathtub;
	}
	public void setBathtub(int bathtub) {
		this.bathtub = bathtub;
	}

}
