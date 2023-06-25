import java.util.Scanner;

public class B5 {

	public static void main(String[] args) {

		//14.Soru: Kullanıcın girdiği boy ve ağırlık değerlerine göre vücut kitle indeksini
		//(VKİ) hesaplayınız. (VKİ=ağırlık/(boy*boy), boy metre cinsinden
		//verilmeli)
		//Vücut kitle indeks değeri, 18 ila 25 aralığındaysa normal, 25 ila 30 arasında
		//kilolu, 30 ve daha yüksekse obez, 35 ve daha fazlaysa ciddi obez olarak kabul
		//edilir. Vücut kitle indeks değerini hesaplayarak durumu yazdırınız.
		
		Scanner scanner=new Scanner(System.in);
		double boy, agirlik;
		
		System.out.print("Boyunuzu metre cinsinden giriniz: ");
		boy=scanner.nextDouble();
		
		System.out.print("Agirliginizi giriniz: ");
		agirlik=scanner.nextDouble();
		
		double vki=agirlik/(boy*boy);
		
		if(vki<25 && vki>=18)
			System.out.println("Normal");
		
		else if (vki<30 && vki>=25) 
			System.out.println("Kilolu");
		
		else if(vki<35 && vki>=30)
			System.out.println("Obez");
		
		else if(vki>=35)
			System.out.println("Ciddi obez");
		
		else 
			System.out.println("Gecersiz giris!");
		
		
		
	

	}

}
