
public class SatuAsteriskKiri {
	public static void main(String[] args) {
	        int baris = 5;
	        for (int i = 1; i <= baris; i++) {
	            for (int j = baris; j >= i; j--) {
	                if (j > i) {
	                    System.out.print(" ");
	                } else {
	                    System.out.print("*");
	                }
	            }
	            System.out.println();
	        }
	}
}
