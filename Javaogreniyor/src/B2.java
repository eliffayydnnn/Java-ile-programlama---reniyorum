import java.util.Scanner;

public class B2 {

	public static void main(String[] args) {

		//11.Soru: Girilen sayının 14 un kuvveti olup olmadığını bulan bir program yazınız.
		
		Scanner scanner=new Scanner(System.in);
		int sayi;
		
		System.out.print("Bir sayi giriniz: ");
		sayi=scanner.nextInt();
		
		if(sayi%14==0)
			System.out.println("Girdiginiz sayi 14'un kuvvetidir.");
		
		else 
			System.out.println("Girdiginiz sayi 14'un kuvveti degildir.");
		

	

	}

}
