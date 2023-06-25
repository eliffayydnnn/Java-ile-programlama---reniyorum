import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {

		//3.Soru: Algoritma ve Programlamaya giriş dersinin değerlendirilmesi şu şekilde
		//gerçekleşmektedir. Öğrencinin vize notunun %30’u, final notunun %60’u,
		//proje notunun ise %10’u alınarak ilgi ders puanları tespit edilmektedir.
		//İlgili bilgileri dikkate alarak, dersin puanını hesaplayan bir program yazınız.
		
		Scanner scanner=new Scanner(System.in);
		
		int vizeNot, finalNot, projeNot;
		
		System.out.print("Vize notunuzu giriniz: ");
		vizeNot=scanner.nextInt();
		
		System.out.print("Final notunuzu giriniz: ");
		finalNot=scanner.nextInt();
		
		System.out.print("Proje notunuzu giriniz: ");
		projeNot=scanner.nextInt();
		
		float sonuc;
		
		sonuc=(float)((vizeNot*0.3)+(finalNot*0.6)+(projeNot*0.1));
		
		System.out.println("Donem sonu notunuz: "+sonuc);

	

	}

}
