import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {

		//4.Soru: Yükseklik ve taban uzunluğu klavyeden girilen üçgenin alanını
		//hesaplayan uygulamayı gerçekleştirin.
		
		Scanner scanner=new Scanner(System.in);
		
		int yukseklik, taban;
		
		System.out.print("Ucgenin yuksekligini giriniz: ");
		yukseklik=scanner.nextInt();
		
		System.out.print("Ucgenin taban uzunlugunu giriniz: ");
		taban=scanner.nextInt();
		
		float alan;
		
		alan=yukseklik*taban/2;
		
		System.out.println("Yukseklik ve taban uzunlugunu girdiginiz ucgenin alani: "+alan);

	

	}

}
