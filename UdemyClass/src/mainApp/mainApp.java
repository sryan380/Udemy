package mainApp;

public class mainApp {

	public static void main(String[] args) {
		System.out.println(getDaysinMonth(1, 2020));
		System.out.println(getDaysinMonth(2, 2020));
		System.out.println(getDaysinMonth(2, 2018));
		System.out.println(getDaysinMonth(-1, 2020));
		System.out.println(getDaysinMonth(1, -2020));
	}
	
	private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
	
	public static boolean isLeapYear(int year) {
		boolean isLeapYear = false;
		
		if(year < 1 || year > 9999) {
			return isLeapYear;
		}
		if(year % 4 == 0 && year % 100 != 0) {
			return isLeapYear = true;
		}
		if(year % 400 == 0) {
			return isLeapYear = true;
		}
		return isLeapYear;
	}
	
	public static int getDaysinMonth(int month, int year) {
		int days = -1;
		if(month < 1 || month > 12 || year < 1 || year > 9999) {
			return days;
		}
		boolean leapYear = isLeapYear(year);
		
		switch(month) {
			case 1:
				return 31;
			case 2:
				if(leapYear) {
					return 29;
				} else {
					return 28;
				}
			case 3:
				return 31;
			case 4:
				return 30;
			case 5:
				return 31;
			case 6:
				return 30;
			case 7:
				return 31;
			case 8:
				return 31;
			case 9:
				return 30;
			case 10:
				return 31;
			case 11:
				return 30;
			case 12:
				return 31;
		}
		return days;
	}
	
	public static void printNumberInWord(int number) {
		
		switch(number) {
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			default:
				System.out.println("OTHER");
				break;
		}
	}
	
	public static void printDayOfTheWeek(int day) {
		
		switch(day) {
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Invalid day");
				break;
		}
	}
	
	public static void switchChallenge() {
		char switchValue = 'e';
		
		switch(switchValue) {
			case 'A': case 'B': case 'C': case 'D': case 'E':
				System.out.println("Found " + switchValue);
				break;
			default:
				System.out.println("Not Found");
		}
	}
	
	public static void switchLearining() {
		int switchValue = 6;
		
		switch(switchValue) {
			case 1:
				System.out.println("Value was 1");
				break;
			case 2:
				System.out.println("Value was 2");
				break;
			case 3: case 4: case 5:
				System.out.println("was a 3, or a 4, or a 5");
				System.out.println("Actually it was a " + switchValue);
				break;
			default:
				System.out.println("Was not 1,2,3 4 or 5");
				break;
		}
	}
	
	public static boolean isCatPlaying(boolean summer, int temperature) {
		boolean playing = false;
		
		if(summer) {
			if(temperature >= 25 && temperature <= 45) {
				playing = true;
			}
		} else {
			if(temperature >= 25 && temperature <= 35) {
				playing = true;
			}
		}
		
		return playing;
	}
	
	public static void printEqual(int x, int y, int z) {
		
		if(x < 0 || y < 0 || z < 0) {
			System.out.println(INVALID_VALUE_MESSAGE);
		} else if(x == y && x == z) {
			System.out.println("All numbers are equal");
		} else if(x != y && x != z && y != z) {
			System.out.println("All numbers are different");
		} else {
			System.out.println("Neither all are equal or different");
		}
	}
	
	public static void printYearsAndDays(long minutes) {
		
		if(minutes < 0 ) {
			System.out.println(INVALID_VALUE_MESSAGE);
		} else {
			long remaningMinutes;
			long years = minutes / 525600L;
			remaningMinutes = minutes % 525600L;
			long days = remaningMinutes / 1440L;
			
			System.out.println(minutes + " min = " + years + " y and " + days + " d");
		}
	}
	
	public static double area(double radius) {
		double area = -1.0d;
		
		if(radius < 0) {
			return area;
		}
		
		return radius * radius * Math.PI;
	}
	
	public static double area(double x, double y) {
		double area = -1.0d;
		
		if(x < 0 || y < 0) {
			return area;
		}
		return x * y;
	}
	
	public static String getDurationString(long minutes, long seconds) {
		long hours = 0;
		if(minutes >= 0 && seconds >= 0 && seconds <= 59) {
			hours = minutes / 60;
			minutes = minutes % 60;
			return hours + "h " + minutes + "m " + seconds + "s";
		} else {
			return INVALID_VALUE_MESSAGE;
		}
	}
	
	public static String getDurationString(long seconds) {
		long minutes = 0;
		if(seconds >= 0) {
			minutes = seconds / 60;
			seconds = seconds % 60;
			return getDurationString(minutes, seconds);
		} else {
			return INVALID_VALUE_MESSAGE;
		}
	}
	
	public static boolean hasTeen(int x, int y, int z) {
		return (x >= 13 && x <= 19 || y >= 13 && y <= 19 || z >= 13 && z <= 19);
	}
	
	public static boolean isTeen(int x) {
		return (x >= 13 && x <= 19);
	}
	
	public static boolean hasEqualSum(int x, int y, int z) {
		return (x + y) == z;
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
		boolean isEqualByThree = false;
		
		x = Math.floor(Math.abs(x * 1000d));

        y = Math.floor(Math.abs(y * 1000d));
        
		if(x == y) {
			isEqualByThree = true;
		}
		return isEqualByThree;
	}
	
	public static boolean isLeapYearIfElse(int year) {
	 if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0 && (year % 100 == 0 && year % 400 != 0)) {
            return false;
        } else if (year % 4 == 0 && (year % 100 == 0 && year % 400 == 0)) {
            return true;
        } else if (year % 4 == 0) {
            return true;
        } else {
        	return false;
        }
	}
	
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		boolean wakeUp = false;
		
		if(hourOfDay >= 0 && hourOfDay <= 23 && barking) {
			if(hourOfDay < 8 || hourOfDay >  22) {
				wakeUp = true;
			}
		}
		
		return wakeUp;
	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		int megaBytes = kiloBytes / 1024;
		int remaning = kiloBytes % 1024;
		
		if(kiloBytes < 0) {
			System.out.println("Invalid Value");
		} else {
			System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remaning + " KB");
		}
		
		
	}
	
	public static long toMilesPerHour(double kilometersPerHour){
        
        long milesPerhour = -1;
        
        if(kilometersPerHour < 0){
            return milesPerhour; 
        }
        
        return milesPerhour = Math.round(kilometersPerHour / 1.609);
        
    }
    
    public static void printConversion(double kilometersPerHour){
        long miles = toMilesPerHour(kilometersPerHour);
        if(miles < 0) {
        	System.out.println("Invalid Value");
        } else {
        	System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        }
        
    }
	
	public static void displayHighScorePostion(String name, int postion) {
		System.out.println(name + " managed to get to the postion " 
							+ postion + " on the high score table.");
	}
	
	public static int calculateHighScorePostion(int score) {
		if(score >= 1000) {
			return 1;
		} else if(score >= 500) {
			return 2;
		} else if(score >= 100) {
			return 3;
		} else {
			return 4;
		}
	}
	
	public static void operatorChallenge() {
		double myDouble = 20.00d;
		double myDouble2 = 80.00d;
		
		double theTotal = (myDouble + myDouble2) * 100.00d;
		double theRemainder = theTotal % 40.00d;
		
		boolean isZero = (theRemainder == 0) ? true : false;
		
		System.out.println(isZero);
		if(!isZero) {
			System.out.println("Got some remainder");
		}
	}
	
	public static void ternary() {
		boolean isCar = true;
		boolean wasCar = isCar ? true : false;
		if(wasCar) {
			System.out.println("wasCar is true");
		}
	}
	
	public static void strings() {
		String myString = "this is a string";
		
		myString = myString + ", and this is more.";
		myString = myString + " \u00A9 2019";
		System.out.println(myString);
		String numberString = "250.55";
		numberString = numberString + "49.95";
		System.out.println(numberString);
		String lastString = "10";
		int myInt = 50;
		lastString = lastString + myInt;
		System.out.println("LastString is equal to " + lastString);
		double doubleNumber = 120.47d;
		lastString = lastString + doubleNumber;
		System.out.println("LastString is equal to " + lastString);
	}
	
	public static void charAndBool() {
		char myChar = 'D';
		char unicode = '\u0044';
		char unicode2 = '\u00A9';
		System.out.println(unicode2);
		
		boolean myTrue = true;
		boolean myFalse = false;
		
		boolean isCustomerOverTwentyOne = true;
		
	}
	
	public static void floatingPointDoubleChallenge() {
		double pounds = 200d;
		double kilograms = pounds * 0.45359237d;
		System.out.println(kilograms);
	}
	
	public static void floatingPointDouble() {
		float floatMin = Float.MIN_VALUE;
		float floatMax = Float.MAX_VALUE;
		System.out.println("float max = " + floatMax);
		System.out.println("float min = " + floatMin);
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		
		int myintValue = 5 / 3;
		float myFloatValue = 5f / 3f;
		double myDoubleValue = 5.00 / 3.00;
		System.out.println("myintValue = " + myintValue);
		System.out.println("myFloatValue = " + myFloatValue);
		System.out.println("myDoubleValue = " + myDoubleValue);
		
		double pi = 3.1415927d;
		double another = 3_000_000.4_567_890d;
		System.out.println(pi);
		System.out.println(another);
	}
	
	public static void primativesChallenge() {
		byte myByte = 48;
		short myShort = 1000;
		int myInt = 20000;
		long myLong = 50000L + (10L * (myByte + myShort + myInt));
		System.out.println(myLong);
	}
	
	public static void primatives() {
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte minumum value = " + myMinByteValue);
		System.out.println("Byte maximum value = " + myMaxByteValue);
		long myLongValue = 100L;
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long minumum value = " + myMinLongValue);
		System.out.println("Long maximum value = " + myMaxLongValue);
		short bigLongLiteralValue = (short) 2147483647234L;
		System.out.println(bigLongLiteralValue);
		byte myNewBytevalue = (byte) (myMinByteValue /2 );
	}

}
