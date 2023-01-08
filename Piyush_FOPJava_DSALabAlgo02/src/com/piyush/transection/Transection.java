package com.piyush.transection;

import java.util.Scanner;

public class Transection {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		int sizeOfTransArray;
		System.out.println("Hi Please Enter the No. of Transections");		
		sizeOfTransArray= sc.nextInt();		
		int [] transectionValues=new int [sizeOfTransArray];
		for(int i=0; i<sizeOfTransArray; i++ ) {
			System.out.println("Enter the Transection No."+(i+1));
			transectionValues[i]=sc.nextInt();		
		}		
	
			System.out.println("Enter the No. of Targets");
		int targetNo =sc.nextInt();
		while (targetNo-- > 0){		
			boolean acheived = false;
			long target;
			System.out.println("\n\nEnter the value of target No.");
			target = sc.nextLong();
			long sum = 0;
			for (int i = 0; i <sizeOfTransArray; i++){ 
				sum += transectionValues[i];
				if (sum >= target) {
					System.out.println("Target achieved after "+(i + 1) + " transactions ");
					acheived = true;
					break;
				}
			}

			if (!acheived) {
				System.out.println(" Given target is not achieved ");
			}
	
}
}
}