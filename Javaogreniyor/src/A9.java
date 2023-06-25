import java.util.Scanner;

public class A9 {

	public static void main(String[] args) {

		//9.Soru: Kullanıcının girdiği iki sayının karelerinin toplamını görüntüleyen
		//programı yazınız.
		
		Scanner scanner=new Scanner(System.in);
		int sayi1,sayi2;
		
		System.out.print("Bir sayi giriniz: ");
		sayi1=scanner.nextInt();
		
		System.out.print("Bir sayi giriniz: ");
		sayi2=scanner.nextInt();
		
		int toplam=(int)(Math.pow(sayi1, 2)+Math.pow(sayi2, 2));
		
		System.out.println("Girdiginiz sayilarin karelerinin toplami: "+toplam);
		
		
		
	

	}

}
