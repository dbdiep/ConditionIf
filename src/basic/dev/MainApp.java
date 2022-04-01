package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao mot so nguyen ");
		int n = sc.nextInt();
		sc.nextLine();
		if (n > 0) {
			System.out.format("%d la so nguyen duong %n", n);
		} else {
			System.out.format("%d la so nguyen am %n", n);
		}
		int n1 = n % 3;
		int n2 = n % 5;
		if (n1 == 0 || n2 == 0) {
			if (n1 == 0) {
				System.out.format("%d chia het cho 3 %n", n);
			} else {
				System.out.format("%d chia het cho 5 %n", n);
			}
		
		} else {
			System.out.format("%d khong chia het cho 3 hay 5 %n", n);
		}
		
		System.out.println("Nhap vao mot thang ");
		int m = sc.nextInt();
		sc.nextLine();
		
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			System.out.format("So ngay cua thang %d la 31 ngay %n");
		} else {
			if (m == 2) {
				System.out.format("So ngay cua thang %d la 28 ngay %n");
			} else {
				System.out.format("So ngay cua thang %d la 30 ngay %n");
			}
		}
		
		System.out.println("Nhap vao he so a ");
		float a = sc.nextFloat();
		sc.nextLine();
		
		System.out.println("Nhap vao he so b ");
		float b =  sc.nextFloat();
		sc.nextLine();
		
		System.out.println("Nhap vao he so c ");
		float c =  sc.nextFloat();
		sc.nextLine();
		
		if(a == 0) {
			if (b == 0) {
				if(c == 0) {
					System.out.println("Phuong trinh co vo so nghiem");
				} else {
					System.out.println("Phuong trinh vo nghiem");
				}
			} else {
				float x = (float)- c / b;
				System.out.format("Phuong trinh co nghiem x = %.2f %n", x);
			}
		} else {
			float delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else {
				float x1 = (float)(-b + Math.sqrt(delta) ) / (2 * a);
				float x2 = (float)(b + Math.sqrt(delta) ) / (2 * a);
				System.out.format("Phuong trinh co nghiem x1 = %.2f va x2 = %.2f %n", x1, x2);
			}
		}
		
		if (a == 0 || b == 0 || c == 0 || a < 0 || b < 0 || c < 0) {
			System.out.println("Khong phai 3 canh cua mot tam giac");
		} else {
			float d = a*c - (b*c);
			float e = a*b;
			float f = a*c + b*c;
			if (d < e) {
				if (e < f) {
					System.out.format("%d, %d, %d la 3 canh cua mot tam giac", a, b,c);
				} else {
					System.out.println("Khong phai 3 canh cua mot tam giac");
				}
			} else {
				System.out.println("Khong phai 3 canh cua mot tam giac");
			}
		}
	
	}
}
