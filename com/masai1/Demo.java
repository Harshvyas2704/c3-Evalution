package com.masai1;

import java.util.Scanner;

public class Demo {
	
	void op() {
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int length = input.nextInt();
		
		int[] arr = new int[length];
		
		for(int i=0; i<length; i++) {
			System.out.println("Enter a number");
			int num = input.nextInt();
			
			arr[i] = num;
		}
		
		boolean flag = false;
		
			System.out.println("Pick a index");
			int index = input.nextInt();
			
		
		
		if(index < length) {
			System.out.println(arr[index]);
			flag = true;
			
			
		}
		
		else {
			System.out.println("Pick a valid index");
		}
		
	}
	
}
