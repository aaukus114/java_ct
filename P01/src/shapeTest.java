
public class shapeTest {
	public static void main(String[] args) {
		Circle ctw = new Circle(10);
		Rectangle rtw = new Rectangle(10,20);
		Triangle ttw = new Triangle(10,20);
		Cube cth = new Cube(10,10,10);
		Cylinder cyth = new Cylinder(10,10);
		Sphere sth = new Sphere(10);
		/*
		System.out.println("�� :" + ctw.GetArea());
		System.out.println("�簢�� : " + rtw.GetArea());
		System.out.println("�ﰢ�� :" + ttw.GetArea());
		*/
		twoDimenShape[] arr = {ctw,rtw,ttw};
		for(int i= 0;i<arr.length ; i++)
		{
			System.out.println(arr[i].GetArea());
		}		
		
		/*
		System.out.println("����ü :" + cth.GetVolume());
		System.out.println("����� : " + cyth.GetVolume());
		System.out.println("�� :" + sth.GetVolume());
		*/
		ThreeDimenShape[] arr2 = {cth, cyth , sth};
		for( int i = 0 ;i<arr2.length ; i++)
		{
			System.out.println(arr2[i].GetVolume());
		}

	}
}
