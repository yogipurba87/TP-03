import java.util.Scanner;

public class ScannerSoal03{
	public static void main(String[]args){
		Scanner amd = new Scanner (System.in);
		int jumlah_permen;
		int jumlah_orang, setiap_orang_mendapat, sisa_permen;
		System.out.print("Jumlah permen yang dimiliki adalah ");
		jumlah_permen = amd.nextInt();
		System.out.print("Jumlah orang saat ini adalah ");
		jumlah_orang = amd.nextInt();
		
		setiap_orang_mendapat = jumlah_permen / jumlah_orang;
		System.out.println("Setiap orang mendapat "+ setiap_orang_mendapat + " permen");
		
		sisa_permen = jumlah_permen % jumlah_orang;
		System.out.println("Dan sisa permennya adalah "+ sisa_permen+ " permen");
	}
}