import java.util.Scanner;


public class EX01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();


		if(year %4 == 0)
		{
			if(year %400 == 0)
				System.out.println(year+"년은 "+"윤년");
			else if(year %100 == 0)
				System.out.println(year+"년은 "+"평년");	
		}
		else
			System.out.println(year+"년은 "+"평년");
		sc.close();
	}
}
