import java.util.Scanner;
public class BacNhat {
	public static void main(String[] args) {
		try {
			double nghiem;
			Scanner scanner = new Scanner(System.in);
	        System.out.println("Nhập vào số a:");
	        float a = scanner.nextFloat();
	        System.out.println("Nhập vào số b: ");
	        float b = scanner.nextFloat();
	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình có vô số nghiệm.");
	            } else {
	                System.out.println("Phương trình vô nghiệm.");
	            }
	        } else {
	            nghiem = (double) (-b/a);   
	            System.out.println("Phương trình có nghiệm x = "+nghiem);
	        }
		} catch (Exception e) {
			 System.out.println("Nhập sai dữ liệu.");
		}
	}
}
