
public class Asterisk_Kiri{
	 public static void main(String[] args) {
	        int baris = 5;
	        for (int i = 1; i <= baris; i++) {
	            for (int j = baris; j > i; j--) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
}
