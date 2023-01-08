package com.piyush.CurrencyDenominations;


import java.util.Scanner;

public class CurrencyDenominations {
	public static void main(String[] args) {
		System.out.println("Enter the Size of Denominations");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the Currency Denomination Values");
		int [] arry=new int[size];
		for(int i=0; i<size;i++) {
			arry[i]=sc.nextInt();
			if(arry[i]<=0) {
				System.out.println("Please Enter the Valid Currency Value");
				i--;
		}
		}
		System.out.println("Enter the Amount you want to Pay");
		int amount=sc.nextInt();
		sortArry(arry);
		printNote(amount,arry);
		sc.close();		
	}
	
	private static void printNote(int amount, int[] arry) {
		int [] notecounter=new int[arry.length];
		for (int i=0;i<arry.length;i++) {
			if(amount>=arry[i]) {
				notecounter[i]=amount/arry[i];
				amount=amount%arry[i];				
			}
		}
		if(amount>0) {
			System.out.println("Exact Currency demonititaion is not Possible ");
		}else {
			System.out.println("Your payment in order to give min no of notes will be");
			for (int i = 0; i < arry.length; i++) {
				if (notecounter[i] != 0) {
					System.out.println(arry[i] + ":" + notecounter[i]);
		}
			}
		}
		
	}

	private static void sortArry(int[] arry) {
		int temp=0;
		for(int i=0; i<arry.length;i++) {			
			for(int j=1;j<arry.length;j++) {
				if(arry[j-1]<arry[j]) {
					temp=arry[j-1];
					arry[j-1]=arry[j];
					arry[j]=temp;
					
				}
			}
		}
		
	}
	

}
