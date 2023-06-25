import java.util.Scanner;

public class B1 {

	public static void main(String[] args) {

		//10.Soru: Doğum tarihi girilen kişinin yaşını hesaplayan programın algoritmasını
		//yazınız.
		
		Scanner scanner=new Scanner(System.in);
		int dogumTarihi;
		
		System.out.print("Dogum tarihinizi giriniz: ");
		dogumTarihi=scanner.nextInt();
		
		int yas=2023-dogumTarihi;
		
		System.out.print("Yasiniz: "+yas);
		
	

	}

}
