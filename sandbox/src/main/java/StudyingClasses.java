import static java.lang.Math.sqrt;

class StudyingClasses {
	public static void main(String[] args){
		hello("you");
		Triangle wow = new Triangle(3, 4, 5);
		//wow.main();
		System.out.println(wow.area());

		Circle one = new Circle(5);
		System.out.println("Площадь окружности " + one.area());
		System.out.println("Периметр окружности " + one.perimeter());

	}
/*
	public static double distance(Point p1, Point p2){
		double dist = sqrt((p1.x - p2.x)*(p1.x - p2.x) +(p1.y - p2.y)*(p1.y - p2.y));
		return dist;
	}
*/

	public static void hello(String person){
		//String person = "";
		System.out.println("Hello "+person+"!");
	}
	public static int count(){

		return 5;
	}
}
