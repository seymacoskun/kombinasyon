import java.util.Scanner;

import javax.management.MBeanRegistration;

public class Hesap {
	public static void main(String[] args) {
		int N=1, R=1, NR=1;
		double ANR=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Kumenin eleman sayisini giriniz: ");
		int n = scan.nextInt();
		System.out.println("Olusturulacak gruplarin eleman sayisini giriniz: ");
		int r = scan.nextInt();
		scan.close();
		
		for(int i=n; i>0; i--) {
			N *= i;
		}
		
		for(int i=r; i>0; i--) {
			R *= i;
		}
		
		for(int i=(n-r); i>0; i--) {
			NR *= i;
		}
		ANR = N/(R*NR);
		System.out.printf("C(n,r) = %.2f" ,ANR);
	}
}