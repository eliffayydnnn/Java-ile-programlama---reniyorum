import java.util.Scanner;

public class B3 {

	public static void main(String[] args) {

		//12.Soru: Girilen 5 sayının toplamını ve ikinci kuvvetlerinin toplamını bulan
		//program yazınız.
		
		Scanner scanner=new Scanner(System.in);
		int[] sayi=new int[5];
		
		for(int i=0;i<sayi.length;i++) {
			
			System.out.print("Bir sayi giriniz: ");
			sayi[i]=scanner.nextInt();
			
		}
		
		int toplam=0;
		int ikincikuvvetToplam=0;
		
		for(int i=0;i<5;i++) {
			
			toplam+=sayi[i];
			ikincikuvvetToplam+=(int) Math.pow(sayi[i], 2);
			
		}
		
		System.out.println("Girdiginiz sayilarin toplami: "+toplam+"\nGirdiginiz sayilarin ikinci kuvvetlerinin toplami: "+ikincikuvvetToplam);

	

	}

}
