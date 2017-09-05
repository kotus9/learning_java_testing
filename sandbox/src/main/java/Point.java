import static java.lang.Math.sqrt;

public class Point {

    public double x, y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point p1){
        double dist = sqrt((p1.x - this.x)*(p1.x - this.x) +(p1.y - this.y)*(p1.y - this.y));
        return dist;
    }

    public static void main(String[] args){
        Point p1 = new Point(2, 4);
        System.out.println("Первая точка: "+ p1.x + ", " + p1.y);
        Point p2 = new Point(3, 4);
        System.out.println("Вторая точка: "+ p2.x + ", " + p2.y);
        System.out.println("The distance between 2 points is: "+ p1.distance(p2));
    }

}
