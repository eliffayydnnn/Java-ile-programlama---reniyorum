import java.util.Scanner;

public class B7 {

	public static void main(String[] args) {
		//Klavyeden birimi kilometre olarak girilen bir uzunluğu mil birimine çevirip ekrana yazdıran program.
		//Kilometreden mile döünüşüm formülü: mil=0,621*x
		//x=kilometre
		
		Scanner scanner=new Scanner(System.in);
		int kilometre;
		
		System.out.print("Kilometre degerini giriniz: ");
		kilometre=scanner.nextInt();
		
		double mil=0.621*kilometre;
		
		System.out.println("Kilometre degerini girdiginiz degerin mili: "+mil);
		
		

	}

}
