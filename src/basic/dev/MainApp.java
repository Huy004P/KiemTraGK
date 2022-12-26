package basic.dev;

import java.util.Random;

public class MainApp {

	private static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10] ;
		ranDom(a);
		tinhTong(a);
		demSoNguyenTo(a);
		demSoPolinom(a);

	}

	private static void demSoPolinom(int[] a) {
		// TODO Auto-generated method stub
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			temp++;		
		}
		System.out.format("Mang co %d so polinom", temp).println();
	}

	static boolean demSoPolinom(int n) {
		// TODO Auto-generated method stub
		
		   int n1;
		   int temp = 0;
		   n1 = n;
		   while (n != 0) {
			   temp = n %10 + temp * 10;
			   n /= 10;
			   if (n1 == temp) return true;
		   }
		   return false;
	}

	private static void demSoNguyenTo(int[] a) {
		// TODO Auto-generated method stub
		int dem = 0;
		for (int i = 0; i < a.length; i++) {
			for (int i1 = 0; i1 < n; i1++)
			{
				if(KiemTraNguyenTo(a[i1]))
				dem++;
			}
		 }
		System.out.format("Mang co %d so nguyen to", dem).println();
	}

	private static boolean KiemTraNguyenTo(int i) {
		// TODO Auto-generated method stub
		return false;
	}

	private static void tinhTong(int[] a) {
		// TODO Auto-generated method stub
		System.out.println();
		int tong = 0 ;
		for (int i = 0; i < a.length; i++) {
			tong += a[i];
		}
		System.out.println("Tong a[] =" + tong);
	}

	private static void ranDom(int[] a) {
		// TODO Auto-generated method stub
		System.out.println("Mang a");
		Random rd = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rd.nextInt(100)+1;
			System.out.println(a[i]+ " ");
	
	}
	}	

}
