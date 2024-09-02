package com.assignment;

public class Main {
	public int Add(String numbers) {
		if(numbers.length() == 1) {
			return Integer.parseInt(numbers);
		}
		if(numbers.length() > 1) {
			String[] numberArr = numbers.split(",");
			int sum = 0;
			for(int i = 0; i < numberArr.length; i++) sum += Integer.parseInt(numberArr[i]); 
			return sum;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
	}

}
