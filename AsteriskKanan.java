public class AsteriskKanan {
	public static void main(String[]args) {
		int baris = 5;
		int a, b;
		for (a = 0; a < baris; a++) { 
			for (b = 0; b <= a; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
