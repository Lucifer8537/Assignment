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
			String negative = "";
			for(int i = 0; i < numberArr.length; i++) {
				long num = Long.parseLong(numberArr[i].trim());
				if(num < 0) negative += num + " ";
				sum += num;
			}
			if(negative.length() > 0) {
				throw new NegativeNumberException("negatives not allowed " + negative);
			}
			return sum;	
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
	}

}


