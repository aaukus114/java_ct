import java.util.Random;

public class as {

	public static void main(String[] args) {
		final int Dam = 5;
		boolean j = true;
		int PLH,MSH,i;
		
		Random rn = new Random();
		Player pl = new Player(10);
		Monster ms = new Monster(10);
		
		while (true)
		{
			i = rn.nextInt(Dam+1);
			if(j == true)
			{
				PLH=pl.Acctack(i);
				if(i >=Dam)
					System.out.println("monster에 크리티컬 공격! : " +i);
				else if(i<=0)
					System.out.println("monster공격 miss!");
				else if(i<Dam/2)
					System.out.println("Monster 공격은 미미했다 :" + i);
				else
					System.out.println("monster에 공격 : " +i);
				if(PLH<=0)
				{
					System.out.println("Player 패배");
					break;
				}
			}
			if(j == false)
			{
				MSH=ms.Acctack(i);
				if(i >=Dam)
					System.out.println("player에 크리티컬 공격! : " +i);
				else if(i<=0)
					System.out.println("Player공격  miss!");
				else if(i<Dam/2)
					System.out.println("Player 공격은 미미했다 :" + i);
				else
					System.out.println("player에 공격 : " +i);
				if(MSH<=0)
				{
					System.out.println("Monster 패배");
					break;
				}
			}
			if(j ==true)
				j = false;
			else if(j == false)
				j = true;
			
		}
	}
}
