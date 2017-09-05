import static java.lang.StrictMath.sqrt;

public class Triangle {

    public double a, b, c;

    public Triangle(double aa, double bb, double cc){

        this.a = aa;
        this.b = bb;
        this.c = cc;
        System.out.println("Создан прекрасный треугольник со сторонами: " + this.a + ", " + this.b + ", " + this.c);
    }


    public double area(){
        double p = 0.5 * this.perimeter();
        return sqrt((p - this.a) * p * (p - this.b) * (p - this.c));
    }

    public double perimeter(){
        return this.a+this.b+this.c;

    }

    public static void main(String[] args){
        //System.out.println("Прекрасный треугольник с тремя углами");

        //System.in.input();
        //System.out.println("Площадь магического треугольника равна "+ area());
    }
}
