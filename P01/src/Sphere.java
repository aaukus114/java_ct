
public class Sphere extends ThreeDimenShape{

	final float pi = 3.14f;
	int r;
	public Sphere(int r) {
		super();
		this.r = r;
	}
	
	public float GetVolume(){
		return r*r*r*pi/3*4;
	}
}
