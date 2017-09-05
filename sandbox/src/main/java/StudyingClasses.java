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
	public static void hello(String person){
		//String person = "";
		System.out.println("Hello "+person+"!");
	}
	public static int count(){

		return 5;
	}
}
