
public class Cylinder extends ThreeDimenShape{
	
	final float pi = 3.14f;
	int r,height;
	
	public Cylinder( int r, int hieght) {
		super();
		this.r = r;
		this.height = hieght;
	}
	
	public float GetVolume(){
		return r*r*pi*height;
	}
}
