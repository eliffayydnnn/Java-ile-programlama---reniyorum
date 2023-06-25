import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		//1.Soru: Kullanıcıdan alınan sayının tek ya da çift olduğunu kontrol edip ekranda
		//yazdıran algoritmayı oluşturun.
		
		Scanner scanner=new Scanner(System.in);
		
		int sayi;
		
		System.out.print("Bir sayi giriniz: ");
		sayi=scanner.nextInt();
		
		if(sayi%2==0) {
			
			System.out.println("Yazdiginiz sayi cifttir.");
			
		}
		
		else {
			
			System.out.println("Yazdiginiz sayi tektir.");
			
		}
		
		
		

	

	}

}
