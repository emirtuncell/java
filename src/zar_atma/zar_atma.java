package zar_atma;

import java.util.Random;
import java.util.Scanner;

public class zar_atma {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int tur;//kullanıcıdan kaç tur zar atmak istediği bilgisini almak için değişken oluşturduk.
		
		
		System.out.println("KAÇ TUR ZAR ATMAK İSTİYORSUNUZ?  ");
		tur=scan.nextInt();
		
		for(int i=1;i<=tur; i++) {
			
			Random random=new Random();
		int a= random.nextInt(6);//random fonksiyonu 0 ie 6 arasında bir değer döndürdü.
		int b=random.nextInt(6);
		    System.out.println("------------"+i+". TUR SONUÇLARI ----------\n");
			System.out.println("İlk zar = "+a+" İkinci zar = "+b +" geldi. \n"
					+ "  İkisinin toplamı = "+(a+b)+"\n");
		
		}
	}

}
