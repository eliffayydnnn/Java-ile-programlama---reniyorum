import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {

		//6.Soru: Klavyeden geometrik şekil(kare ve dikdörtgen)için kenar bilgilerini alın.
		//Her geometrik şeklin alan ve çevre bilgilerini ekrana yazdırınız.
		
		Scanner scanner=new Scanner(System.in);
		int kareKenar, uzunKenar, kisaKenar;
		
		System.out.print("Karenin kenarini giriniz: ");
		kareKenar=scanner.nextInt();
		
		System.out.print("Dikdotgenin uzun kenarini giriniz: ");
		uzunKenar=scanner.nextInt();
		
		System.out.print("Dikdortgenin kisa kenarini giriniz: ");
		kisaKenar=scanner.nextInt();
		
		int kareAlan, kareCevre, dikdortgenAlan, dikdortgenCevre;
		
		kareAlan=kareKenar*kareKenar;
		kareCevre=4*kareKenar;
		dikdortgenAlan=kisaKenar*uzunKenar;
		dikdortgenCevre=2*(kisaKenar+uzunKenar);
		
		System.out.println("Kenarlarini girdiginiz karenin alani "+"'"+kareAlan+"'"+"\nKarenin cevresi "+"'"+kareCevre+"'");
		System.out.println("Kenarlarini girdiginiz dikdortgenin alani "+"'"+dikdortgenAlan+"'"+"\nDikdortgenin cevresi"+"'"+dikdortgenCevre+"'");

	

	}

}
