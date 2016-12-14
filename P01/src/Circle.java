
public class Circle extends twoDimenShape{

	final float pi = 3.14f;
	float r;
	
	public Circle(float r) {
		this.r = r;

	}
	
	public float GetArea(){
		return pi*r*r;
	}
	
}
