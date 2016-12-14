
public class Rectangle extends twoDimenShape{
	int width, height;

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public float GetArea(){
		return width*height;
	}
}
