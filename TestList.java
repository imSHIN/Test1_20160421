package pers.test1;

import java.util.Scanner;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size for the two arrays: ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		
		int[] test1=new int[a];
		int[] test2=new int[a];
		
		System.out.println("Enter list1: ");
		for(int i=0;i<a;i++){
			int b=scan.nextInt();
			test1[i]=b;
		}
		
		System.out.println("Enter list2: ");
		for(int i=0;i<a;i++){
			int b=scan.nextInt();
			test2[i]=b;
		}
		
		SuperList s=new SuperList();
		if( s.judgement(test1, test2) ){
			System.out.println("Two lists are strictly identical ");
		}
		else{
			ChildList c=new ChildList();
			if(c.judgement(test1, test2)==false){
				System.out.println("Two lists are identical (Not strictly)");
			}
		}
	}	
}
