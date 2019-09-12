import java.util.Scanner;

public class percobaan6{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int nilai1, nilai2, hasil;
		
		System.out.print("Masukkan integer pertama :");
		nilai1 = input.nextInt();
		
		System.out.print("Masukkan integer kedua :");
		nilai2 = input.nextInt();
		
		hasil = nilai1 + nilai2;
		System.out.println("Hasil " +nilai1+ "+" +nilai2+ "=" +hasil);
	}
}