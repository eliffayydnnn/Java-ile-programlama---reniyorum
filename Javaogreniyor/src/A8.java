import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {

		//8.Soru: Öğrencinin sınavdan aldığı puanı, (AA,BA, BB, BC, CC, DD, FF) şeklinde
		//gösteren bir algoritma yazınız.
		
		Scanner scanner=new Scanner(System.in);
		int not;
		
		System.out.print("Sinavdan aldiginiz notu giriniz: ");
		not=scanner.nextInt();
		
		if(not<=100 && not>80) 
			System.out.println("Aldiginiz harf notu AA'dir.");
		
		else if(not<=80 && not>65)
			System.out.println("Aldiginiz harf notu BA'dir.");
		
		else if(not<=65 && not>55)
			System.out.println("Aldiginiz harf notu BB'dir.");
		
		else if (not<=55 && not>45) 
			System.out.println("Aldiginiz harf notu BC'dir.");
		
		else if (not<=45 && not>35) 
			System.out.println("Aldiginiz harf notu CC'dir.");
		
		else if (not<=35 && not>25) 
			System.out.println("Aldiginiz harf notu DD'dir.");
		
		else if (not<=25 && not>=0) 
			System.out.println("Aldiginiz harf notu FF'dir.");
		
		else {
			System.out.println("Girilen deger gecersizdir!!");
		}
			
		
			
		
		

	

	}

}
