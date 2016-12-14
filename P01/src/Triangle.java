
public class Triangle extends twoDimenShape{

	int width, height;

	
	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public float GetArea(){
		return width * height /2;
	}
}
