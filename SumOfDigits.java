package week1.day2;

public class SumOfDigits {
	public static void main(String[] args)
	   {
	      int num=1234, digit, sum;
	            
	      for(sum=0; num!=0; num = num/10)
	      {
	         digit = num%10;
	         sum = sum + digit;
	      }
	      
	      System.out.println("\nSum of Digits = " +sum);
	   }

}
