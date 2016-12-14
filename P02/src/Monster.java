
public class Monster extends Character{

	static int hp,i=0;
	
	public Monster(int hp) {
		this.hp = hp;
	}
	

	@Override
	public int Acctack(int acc) {
		// TODO Auto-generated method stub

		if(this.i >=1)
		{
			this.hp -= acc;
		}
		else
		{
			this.hp =hp;
			this.hp -= acc;
			this.i++;
		}
		return hp;
	}
}
