import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {

		//7.Soru: Klavyeden girilen 5 sayının toplam değerinde çarpma kullanmadan 5 katını alarak ekrana yazdıran
		//algoritmayı yazınız.
		
		Scanner scanner=new Scanner(System.in);
		
		int[] sayilar=new int[5];
		
		for(int i=0;i<sayilar.length;i++) {
			
			System.out.print("Tamsayi giriniz: ");
			sayilar[i]=scanner.nextInt();
			
		}
		
		int deger1=sayilar[0]*5;
		int deger2=sayilar[1]*5;
		int deger3=sayilar[2]*5;
		int deger4=sayilar[3]*5;
		int deger5=sayilar[4]*5;
		
		int toplam=deger1+deger2+deger3+deger4+deger5;
		//Toplam değerinde çarpma kullanmadık sadece toplama kullandık soruda denildiği gibi...
		
		System.out.println("Girdiginiz sayilarin 5 katlarinin toplami: "+toplam);
		
		

	

	}

}
