import java.util.Scanner;
package gsdg;

public class fff {
Scanner scanner = new Scanner(System.in);
int year = scanner.nextInt();


if(year %4 == 0)
{
	if(year %100 == 0)
		System.out.println("���");
}
else
{
	if(year %400 == 0)
		System.out.println("����");
}
}
