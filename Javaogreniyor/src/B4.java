import java.util.Scanner;

public class B4 {

	public static void main(String[] args) {

		//13.Soru: Çemberin alanını ve çevresini hesaplayan program yazınız.
		
		Scanner scanner=new Scanner(System.in);
		int yaricap;
		
		System.out.print("Cemberin yaricapini giriniz: ");
		yaricap=scanner.nextInt();
		
		double alan= Math.PI*Math.pow(yaricap,2);
		double cevre= 2*Math.PI*yaricap;
		
		System.out.println("Yaricapini girdiginiz cemberin alani: "+alan);
		System.out.println("Yaricapini girdiginiz cemberin cevresi: "+cevre);
		
	

	

	}

}
