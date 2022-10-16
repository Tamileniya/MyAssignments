package week3.day1.Assingments.org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("Desktop DELL HD 11X12");
	}

	public static void main(String[] agrs) {
		
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.desktopSize();
	}
}
