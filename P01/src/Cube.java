
public class Cube extends ThreeDimenShape{

	int ga,se,height;

	public Cube(int ga, int se, int height) {
		super();
		this.ga = ga;
		this.se = se;
		this.height = height;
	}
	public float GetVolume(){
		return ga*se*height;
	}
}
