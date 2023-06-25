import java.util.Scanner;

public class A5 {
	public static void main(String[] args) {

		//5.Soru: Bir araç, üç saat yolculuk edecektir. Son iki saatte, hızının 2 katının 5
		//fazlası olarak güncelleyecektir. Bu aracın kat ettiği yolu hesaplayın
		//ekrana yazdıran uygulamayı gerçekleştirin.
		
		Scanner scanner=new Scanner(System.in);
		
		int ilkHiz;
		
		System.out.print("Aracin ilk bir saatteki hizini giriniz: ");
		ilkHiz=scanner.nextInt();
		
		int sonHiz=2*ilkHiz+5;
		
		int yol=sonHiz*3;
		
		System.out.println("3 saatte toplam alinan yol: "+yol);
		
		

	
	}

}
