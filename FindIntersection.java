package week1.day2;

public class FindIntersection {
	public static void main(String[] args) {
		int a[] = {2,3,5,7,4,9};
		int b[] = {1,0,2,9,5,7};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
