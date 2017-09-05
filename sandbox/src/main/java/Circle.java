public class Circle {


    public double r;

    public Circle(double r){
        this.r = r;
        System.out.println("Создана чудесная окружность с радиусом: " + this.r);

    }

    public double perimeter(){
        double pi = 3.1415926;
        return pi * 2 * this.r;
    }
    public double area(){
        double pi = 3.1415926;
        return pi * this.r * this.r;
    }


}
