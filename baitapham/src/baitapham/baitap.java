package baitapham;

import java.io.DataInput;
import java.util.Scanner;

public class baitap {
	public static void in() {
		System.out.print("Lap Trinh Java 2021");
	}
	public static void takeprint(String a) {
		System.out.print(a+" ");
	}
	public static void manyprint(String a,int n) {
		for (int i=0;i<n;i++) {
			takeprint(a);
		}
	}
	public static void giaiptbac1(float a,float b) {
		float nghiem;
		if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh nay co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            nghiem = -b / a;   
            System.out.println("Phuong trinh co nghiem x = " + nghiem);
        }
	}	
	public static void giaiptbac2(float a, float b, float c) {
		double nghiem1,nghiem2,dt;
		if (a == 0) {
			giaiptbac1(b,c);
		} else {
			dt=b*b-4*a*c;
			if (dt < 0) {
				System.out.println("Phuong trinh vo nghiem.");
			} else {
				if (dt == 0) {
					nghiem1=-b/(2*a);
					System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + nghiem1);
				} else {
					nghiem1=(-b+Math.sqrt(dt))/(2*a);
					nghiem2=(-b-Math.sqrt(dt))/(2*a);
					System.out.println("Phuong trinh co 2 nghiem x1 = " + nghiem1 +" x2 = "+nghiem2);
				}
			}
		}
	}
	public static void giaiptchon(int n) {
		Scanner input = new Scanner(System.in);
		if(n==1) {
			System.out.print("Nhap a: ");
			float a = input.nextFloat();
			System.out.print("Nhap b: ");
			float b = input.nextFloat();
			giaiptbac1(a,b);
		}else if (n==2) {
			System.out.print("Nhap a: ");
			float a = input.nextFloat();
			System.out.print("Nhap b: ");
			float b = input.nextFloat();
			System.out.print("Nhap c: ");
			float c = input.nextFloat();
			giaiptbac2(a,b,c);		
		}else {
			System.out.println("Khong co phuong trinh bac "+n);
		}
	}
	public static void manygiaiptchon() {
		int a;
		Scanner input = new Scanner(System.in);
		a=1;
		while(a==1) {
			System.out.print("Giai pt bac: ");
			int n = input.nextInt();
			giaiptchon(n);
			System.out.print("Co muon tiep tuc khong (1 de co): ");
			a = input.nextInt();
		}
	}
	public static void main(String[] args) {
		manygiaiptchon();
	}
}	
