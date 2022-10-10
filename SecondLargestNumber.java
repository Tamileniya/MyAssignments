package week1.day2;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String args[]){
	      int array[] = {10, 20, 25, 63, 96, 57};
	      int size = array.length;
	      Arrays.sort(array);
	      int res = array[size-2];
	      System.out.println("Second Largest Number is = " +res);
	   }
}
