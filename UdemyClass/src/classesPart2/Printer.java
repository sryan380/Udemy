package classesPart2;

public class Printer {
	
	private int tonerLevel;
	private int pagesPrinted = 0;
	private boolean duplex;
	
	public Printer(int tonerLevel, boolean duplex) {
		if(tonerLevel > -1 && tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;
		} else {
			this.tonerLevel = -1;
		}
		this.duplex = duplex;
	}
	
	public int addToner(int tonerAmount) {
		if(tonerAmount > 0 && tonerAmount <= 100) {
			if(this.tonerLevel + tonerAmount > 100) {
				return -1;
			} else {
				return this.tonerLevel += tonerAmount;
			}
		} else {
			return -1;
		}
	}
	
	public int printPages(int pages) {
		int pagesToPrint = pages;
		
		if(this.duplex) {
			return this.pagesPrinted  = (pages /2) + (pages %2);
		} else {
			return this.pagesPrinted = pagesToPrint;
		}
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}
}
