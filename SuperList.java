package pers.test1;

import java.util.Arrays;

public class SuperList {	
	public boolean equal(int[] list1,int[] list2){
		boolean t=Arrays.equals(list1, list2);
		return t;
	}	
	
	public boolean judgement(int[] list1,int[] list2){
		return  (list1.length==list2.length && this.equal(list1, list2));
	};
}
