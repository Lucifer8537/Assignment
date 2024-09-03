package com.assignment;

public class Main {
	public long Add(String numbers) {
		if(numbers.length() > 0) {
			String delimeter = ",\n";
			if(numbers.startsWith("//") && numbers.length() > 2) {
				String[] delimeterArr = numbers.split("[\n]");
				delimeter = delimeterArr[0].substring(2);
				numbers = delimeterArr[1];
			}
			String[] numberArr = numbers.split("["+delimeter+"]");
			long sum = 0;
			for(int i = 0; i < numberArr.length; i++) sum += Long.parseLong(numberArr[i].trim());
			return sum;	
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
	}

}
