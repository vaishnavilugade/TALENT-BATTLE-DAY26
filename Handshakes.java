import java.util.*;
public class Handshakes
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     //fill the code
    int n,Final;
		System.out.println("Enter number:");
		n=sc.nextInt();
			

    Final = n * (n-1) / 2; // Combination nC2

		System.out.println(Final);
	}
}