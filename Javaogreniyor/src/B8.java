import java.util.Scanner;

public class B8 {

	public static void main(String[] args) {
		//Klavyeden iki dik kenar uzunluğu girilen bir üçgenin hipotenüs uzunluğunu pisagor teoremiyle
		//hesaplayan program.
		
		Scanner scanner=new Scanner(System.in);
		int kenar1,kenar2;
		
		System.out.print("Birinci dik kenar degerini giriniz: ");
		kenar1=scanner.nextInt();
		
		System.out.print("Ikinci dik kenar degerini giriniz: ");
		kenar2=scanner.nextInt();
		
		double hipotenus=Math.sqrt(Math.pow(kenar1, 2)+Math.pow(kenar2, 2));
		
		System.out.println("Dik kenarlarini girdiginiz ucgenin hipotenus uzunlugu: "+hipotenus);
		
		

	}

}
