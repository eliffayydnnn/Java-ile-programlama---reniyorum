import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		//2.Soru: Girilen sayının 10 un katı olduğunu kontrol edip ekranda yazdıran
		//algoritmayı oluşturun.
		
		Scanner scanner=new Scanner(System.in);
		
		int sayi;
		
		System.out.print("Bir sayi giriniz: ");
		sayi=scanner.nextInt();
		
		if(sayi%10==0) {
			
			System.out.println("Girdiginiz sayi 10'un katidir.");
			
		}
		
		else {
			
			System.out.println("Girdiginiz sayi 10'un kati degildir.");
			
		}

	

	}

}
