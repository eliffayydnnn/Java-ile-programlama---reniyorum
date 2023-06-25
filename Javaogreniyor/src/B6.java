import java.util.Scanner;

public class B6 {

	public static void main(String[] args) {
		// Klavyeden yarıçap uzunluğu girilen kürenin alanını ve hacmini hesaplayıp ekrana yazdıran program.
		
		Scanner scanner=new Scanner(System.in);
		int yaricap;
		
		System.out.print("Yaricap uzunlugu giriniz: ");
		yaricap=scanner.nextInt();
		
		double alan=4*Math.PI*Math.pow(yaricap, 2);
		double hacim=4/3*Math.PI*Math.pow(yaricap,3);
		
		System.out.println("Yaricapini girdiginiz kurenin alani: "+alan+"\nYaricapini girdiginiz kurenin hacmi: "+hacim);

	}

}
