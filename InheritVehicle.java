package week3.day1;

public class InheritVehicle {
	public void breaks() {
		System.out.println("Apply -> Breaks");
	}
	public void sounOn() {
		System.out.println("Sound -> ON");
		
	}
	public static void main(String[] args) {
		
		InheritVehicle vechicle = new InheritVehicle();
		vechicle.breaks();
		vechicle.sounOn();
		
		InheritCar car = new InheritCar();
		car.sunRoof();
		car.ac();
		
		InheritBMW bmw = new InheritBMW();
		bmw.autoParking();
		
		InheritAudi audi = new InheritAudi();
		audi.hybridFule();
		
		InheritAuto auto = new InheritAuto();
		auto.handStarter();
		
		InheritBajaj bajaj = new InheritBajaj();
		bajaj.electronicMeter();
		
	}

}
