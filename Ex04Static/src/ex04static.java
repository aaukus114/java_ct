
public class ex04static {
	
	static int count = 0;
	
	public ex04static(){
		count++;
		System.out.println(count);
	}
	
	public static int getCount(){
		return count;
	}
	
	public static void main(String[] args) {
		ex04static s1 = new ex04static();
		ex04static s2 = new ex04static();
		
		System.out.println(ex04static.getCount());
	}
	
}
