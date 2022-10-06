package week1.day2;

public class TwoWheeler {
	
	public static void main(String[] args){
		TwoWheeler obj = new TwoWheeler();
		int wheels = obj.noOfWheels(2);
		short mirrors = obj.noOfMirrors();
		long chassisno = obj.chassisNumber(1234567890);
		boolean puncture = obj.isPuncutred();
		String bikename = obj.bikeName("SUZUKI");
		double km = obj.runningKM(100000);
		System.out.println("Number of Wheels:" +wheels);
		System.out.println("Number of Mirrors:"  +mirrors);
		System.out.println("Chassis Number is:" +chassisno);
		System.out.println("Is Punctured:" +puncture);
		System.out.println("Bike Name:" +bikename);
		System.out.println("Total KM:" +km);
	}
	public int noOfWheels(int n1) {
			int wheels = n1;
			return wheels;
	}
	public short noOfMirrors() {
		short mirrors = 4;
		return mirrors;
	}
	public long chassisNumber(long n2) {
		long chass = n2;
		return chass;
	}
	boolean isPuncutred () {
		boolean puncture = false;
		return puncture;
	}
	public String bikeName(String name) {
		String bikename = name;
		return bikename;
	}
		
	public double runningKM(double n3) {
		double KM = n3;
		return KM;

}

}
