package mainApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import playlist.Album;
import playlist.Song;

public class mainApp {
	
	public static void main(String[] args) {
		
		
		
	}
	
	private static final String INVALID = "Invalid Value";
	
	public static List<Integer> findScopes(String test){
		
		int scope = 0;
		List<Integer> scopes = new ArrayList<>();
		
		for(int i = 0; i < test.length(); i++) {
			
			String regex = "^[a-z{} ]*$";
			String regex2 = "^[{}]*$";
			
			scopes.add(0);
			String[] array = test.split(regex);
			
			for(String s : array) {
				System.out.println(s);
			}
			
			if(test.substring(i, i + 1).equals("{")) {
				scope++;
				scopes.add(scope);
			}
			
			if(test.substring(i, i + 1).equals("}")) {
				scope--;
				scopes.add(scope);
			}
		}
		return scopes;
	}
	
	public static void gameoflife(int[][] board) {
		
		int M = board.length;
		int N = board[0].length;
		
		System.out.println("Old Generation");
		for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
            	System.out.print(board[i][j]);
            }
            System.out.println();
        }
		
		for(int l = 0; l < M; l++) {
			for(int m = 0; m < N; m++) {
				int aliveNeighbours = 0;
				for(int i = -1; i <= 1;i++) {
					for(int j = -1; j <= 1; j++) {
						if ((l+i>=0 && l+i<M) && (m+j>=0 && m+j<N)) {
							if(board[l + i][m + j] == 2) {
								aliveNeighbours += 0;
							} else if(board[l + i][m + j] == 3) {
								aliveNeighbours += 1;
							} else {
								aliveNeighbours += board[l + i][m + j];
							}
						}
					}
				}
				
				if(board[l][m] == 2) {
					aliveNeighbours -= 0;
				} else if(board[l][m] == 3) {
					aliveNeighbours -= 1;
				} else {
					aliveNeighbours -= board[l][m];
				}
				
				if((board[l][m] == 1) && (aliveNeighbours < 2)) {
					board[l][m] = 3;
				}
				if((board[l][m] == 1) && (aliveNeighbours > 3)) {
					board[l][m] = 3;
				}
				if((board[l][m] == 0) && (aliveNeighbours == 3)) {
					board[l][m] = 2;
				}
			}
		}
		
		System.out.println("New Generation");
		for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
            	if(board[i][j] == 3) {
            		board[i][j] = 0;
            	}
            	if(board[i][j] == 2) {
            		board[i][j] = 1;
            	}
            	System.out.print(board[i][j]);
            }
            System.out.println();
        }
	}
	
	public static boolean inRange(int[][] board, int i, int x) {
		try {
			int num = board[i][x];
			return true;
			
		} catch(Exception e) {
			return false;
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
        	System.out.println(nums.length);
            for(int v = i+1; v <= nums.length - 1; v++){
                if(nums[i] + nums[v] == target){
                	int[] result = {i,v};
                	System.out.println(i + " " + v);
                    return result;
                }
            }
        }
        return null;
    }
	
	public static void reverse(int[] array) {
		System.out.println("Array = " + Arrays.toString(array));
		int temp;
		for(int i = 0; i < array.length/2; i++) {
			temp = array[array.length - i -1];
			array[array.length - i -1] = array[i];
			array[i] = temp;
		}
		System.out.println("Reverse Array = " + Arrays.toString(array));
	}
	
	public static int readInteger() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt(); 
	}
	
	public static int[] readElements(int count) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[count];
		int index = 0;
		while(sc.hasNext()){
			array[index] = sc.nextInt();
			index++;
		}
		return array;
	}
	
	public static int findMin(int[] array) {
		int min = Integer.MAX_VALUE;
		int counter = 0;
		for(int i: array) {
			if(i < min) {
				min = i;
			}
			counter++;
		}
		return min;
	}
	
	public static int[] getInteger(int number){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[number];
        for(int i = 0; i < number; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }
	
	public static int[] sortIntegers(int[] toSort) {
		int[] sortedArray = new int[toSort.length];
		for(int i = 0; i < toSort.length; i++) {
			sortedArray[i] = toSort[i];
		}
		boolean flag = true;
		int temp;
		while(flag) {
			flag = false;
			for(int i = 0; i < toSort.length -1 ; i++) {
				if(sortedArray[i] < sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag = true;
				}
			}
		}
		return sortedArray;
	}
	
	public static void printArray(int[] array) {
		int counter = 0;
		for(int a: array) {
			System.out.println("Element " + counter + " contents " + a);
			counter++;
		}
	}
	
	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
		if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
			return -1;
		}
		
		double area = width * height;
		double areaToCover = area - (extraBuckets * areaPerBucket);
		
		return (int) Math.ceil(areaToCover / areaPerBucket);
		
	}
	
	public static int getBucketCount(double width, double height, double areaPerBucket) {
		if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
			return -1;
		}
		
		double area = width * height;
		
		return (int) Math.ceil(area / areaPerBucket);
		
	}
	public static int getBucketCount(double area, double areaPerBucket) {
		if(area <= 0 || areaPerBucket <= 0) {
			return -1;
		}
		
		return (int) Math.ceil(area / areaPerBucket);
		
	}
	
	public static void inputThenPrintSumAndAverage() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		long average = 0L;
		int count = 0;
		
		while(true) {
			
			boolean validNumber = sc.hasNextInt();
			
			if(validNumber) {
				int number = sc.nextInt();
				sum += number;
				count++;
			} else {
				break;
			}
		}
		if(sum != 0) {
			Double calulatedAverage = ((double) sum / (double) count);
			average = Math.round(calulatedAverage);
		}
		
		System.out.println("SUM = " + sum + " AVG = " + average);
	}
	
	public static void minAndMaxChallenge() {
		Scanner sc = new Scanner(System.in);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		while(true) {
			System.out.println("Enter number : ");
			
			boolean validNumber = sc.hasNextInt();
			
			if(validNumber) {
				int number = sc.nextInt();
				if(number < min) {
					min = number;
				}
				if(number > max) {
					max = number;
				}
			} else {
				break;
			}
		}
		System.out.println("Minimum number is: " + min + " Maximum number is: " + max);
		sc.close();
	}
	
	public static void readingUserInputChallenge() {
		Scanner sc = new Scanner(System.in);
		
		int counter = 0;
		int sum = 0;
		
		while(counter < 10) {
			
			System.out.println("Enter number #" + (counter + 1) + ": ");
			
			boolean hasNextInt = sc.hasNextInt();
			
			if(hasNextInt) {
				int number = sc.nextInt();
				sum += number;
				counter++;
			} else {
				System.out.println("Invalid number");
			}
			
			sc.nextLine();
			
		}
		System.out.println("Sum is : " + sum);
		sc.close();
	}
	
	public static void systemInTest() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your birth year: ");
		
		boolean hasNextInt = sc.hasNextInt();
		
		if(hasNextInt) {
			int yearOfBirth = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter your name: ");
			String name = sc.nextLine();
			int age = 2022 - yearOfBirth;
			
			if(age >= 0 && age <= 100) {
				System.out.println("Your name is " + name + ", and you are " + age + " years of age");
			} else {
				System.out.println("Invalid year of birth");
			}
		} else {
			System.out.println("unable to parse year of birth.");
		}
		sc.close();
		
	}
	
	public static void printSquareStar(int number) {
		if(number < 5) {
			System.out.println(INVALID);
		} else {
			for(int row = 1; row <= number; row++) {
				for(int column = 1; column <= number; column++) {
					if(row == 1 || row == number) {
						System.out.print("*");
					} else if(column == 1 || column == number) {
						System.out.print("*");
					} else if(row == column) {
						System.out.print("*");
					} else if(column == number - (row - 1)) { //column == rowCount - row + 1
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
	
	public static int getLargestPrime(int number) {
		
		if(number <= 1) {
			return -1;
		}
		
		for (int i = 2; i < number; i++) {
            if (number % i == 0){
                number /= i;
                i--;
            }
        }
		return number;
	}
	
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if(bigCount < 0 || smallCount < 0 || goal < 0) {
			return false;
		}
		
		if(bigCount == 0 || goal < 5) {
			return goal <= smallCount;
		}
		
		if (goal != (bigCount * 5)) {
            if (goal > (bigCount * 5)) {
                return (goal - (bigCount * 5)) <= smallCount;
            }
            if (goal < (bigCount * 5)) {
                return (goal % 5) <= smallCount;
            }
        } else {
            return true;
        }
        return false;
	}
	
	public static void numberToWords(int number) {
		
		if(number < 0) {
			System.out.println(INVALID);;
		}
		
		int digitCount = getDigitCount(number);
		int reversed = reverse(number);
		int digitReversed = getDigitCount(reversed);
		if(reversed == 0) {
			System.out.println("Zero");
		}
		
		while(reversed > 0) {
			int toPrint = reversed % 10;
			reversed /= 10;
			switch(toPrint) {
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
				System.out.println("Zero");
				break;
			}
		}
		if(digitCount != digitReversed) {
			for(int i = digitReversed; i < digitCount; i++) {
				System.out.println("Zero");
			}
		}
		
	}
	
	public static int reverse(int number) {
		int reverse = 0;
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number /= 10;
		}
		return reverse;
	}
	
	public static int getDigitCount(int number) {
		if(number < 0) {
			return -1;
		}
		
		int count = 1;
		number /= 10;
		
		while(number > 0) {
			count++;
			number /= 10;
		}
		return count;
	}
	
	public static boolean isPerfectNumber(int number) {
		if(number < 1) {
			return false;
		}
		
		int divisor = 1;
		int sum = 0;
		
		while(divisor < number) {
			if(number % divisor == 0) {
				sum += divisor;
			}
			divisor++;
		}
		if(sum == number) {
			return true;
		}
		return false;
	}
	
	public static void printFactors(int number) {
		if(number < 1) {
			System.out.println(INVALID);
		}
		int divisor = 1;
		
		while(divisor <= number) {
			if(number % divisor == 0) {
				System.out.println(divisor);
			}
			divisor++;
		}
		
	}
	
	public static int getGreatestCommonDivisor(int first, int second) {
		
		if(first < 10 || second < 10) {
			return -1;
		}

		int largestNumber;
		if(first > second) {
			largestNumber = first;
		} else {
			largestNumber = second;
		}
		
		boolean isDivisable = true;
		
		while(isDivisable) {
			if(first % largestNumber == 0 && second % largestNumber == 0) {
				isDivisable = false;
				return largestNumber;
			}
			largestNumber--;
		}
		return -1;
	}
	
	public static boolean isValid(int num) {
		if(num < 10 || num > 1000) {
			return false;
		}
		return true;
	}
	
	public static boolean hasSameLastDigit(int num1, int num2, int num3) {
		
		if(!isValid(num1) || !isValid(num2) || !isValid(num3)) {
			return false;
		}
		
		int num1LastDigit = num1 % 10;
		int num2LastDigit = num2 % 10;
		int num3LastDigit = num3 % 10;
		
		if(num1LastDigit == num2LastDigit || num1LastDigit == num3LastDigit || num2LastDigit == num3LastDigit) {
			return true;
		}
		return false;
		
	}
	
	public static boolean hasSharedDigit(int num1, int num2) {
		
		if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
			return false;
		}
		int num1LastDigit = num1 % 10;
		num1 /= 10;
		int num2LastDigit = num2 % 10;
		num2 /= 10;
		if(num1 == num2 || num1 == num2LastDigit || num2 == num1LastDigit || num2LastDigit == num1LastDigit) {
			return true;
		}
		return false;
	}
	
	public static int getEvenDigitSum(int number) {
		int sum = 0;
		if(number < 0) {
			return -1;
		}
		
		while(number > 0) {
			int toSum = number % 10;
			number /= 10;
			
			if(toSum % 2 == 0) {
				sum += toSum;
			}
			
		}
		
		return sum;
	}
	
	public static int sumFirstAndLastDigit(int number) {
		int sum = 0;
		if(number < 0) {
			return -1;
		}
		int last = number % 10;
		int first = number;
		while(number >= 10) {
			number = number / 10;
			first = number;
		}
		return sum = last + first;
	}
	
	public static boolean isPalindrome(int number) {
		int reverse = 0;
		int num = number;
		
		while(num != 0 || num > 0) {
			int lastDigit = num % 10;
			num /= 10;
			reverse = reverse * 10;
			reverse += lastDigit;
		}
		
		if(reverse == number) {
			return true;
		}
		return false;
	}
	
	public static int sumDigits(int number) {
		int sum = -1;
		if(number >= 10) {
			sum = 0;
			while(number > 0) {
				int n = number % 10;
				number /= 10;
				sum += n;
			}
		}
		
		return sum;
	}
	
	public static void whileChallenge() {
		int number = 4;
		int finishNumber = 20;
		int totalEven = 0;
		
		while(number <= finishNumber) {
			number++;
			
			if(totalEven >= 5) {
				break;
			}
			
			if(!isEvenNumber(number)) {
				continue;
			}
			
			totalEven++;
			System.out.println("Even number " + number);
		}
		System.out.println("Toal even numbers found = " + totalEven);
	}
	
	public static boolean isEvenNumber(int n) {
		if(n % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isOdd(int number) {
		if(number < 0) {
			return false;
		}
		if(number % 2 != 0) {
			return true;
		}
		return false;
	}
	
	public static int sumOdd(int start, int end) {
		int sum = 0;
		if(start <= end && start > 0 && end > 0) {
			for(int i = start; i <= end; i++) {
				if(isOdd(i)) {
					sum += i;
				}
			}
		} else {
			return sum = -1;
		}
		return sum;
	}
	
	public static void sumChallenge() {
		int count = 0;
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if((i % 5 == 0) && (i % 3 == 0)) {
				sum += i;
				count++;
				System.out.println("Found number = " + i);
			}
			if(count == 5) {
				break;
			}
		}
		System.out.println(sum);
	}
	
	public static void printPrime(int n) {
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(isPrime(i)) {
				System.out.println(i);
				count++;
			}
			if(count >= 10) {
				System.out.println("exiting for loop");
				break;
			}
		}
	}
	
	public static boolean isPrime(int n) {
		
		if(n == 1) {
			return false;
		}
		
		for(int i=2; i <= (long) Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
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
			System.out.println(INVALID);
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
			System.out.println(INVALID);
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
			return INVALID;
		}
	}
	
	public static String getDurationString(long seconds) {
		long minutes = 0;
		if(seconds >= 0) {
			minutes = seconds / 60;
			seconds = seconds % 60;
			return getDurationString(minutes, seconds);
		} else {
			return INVALID;
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
