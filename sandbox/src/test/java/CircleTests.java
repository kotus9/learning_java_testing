import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleTests {

    @Test
    public void testArea1(){
        Circle c = new Circle(5);
        Assert.assertEquals(c.area(), (3.1415926 * 5 *5));
        //Assert.assertEquals(c.area(), (3.1415926));
        //Assert.assertEquals(c.area(), (3));
        //assert c.area() == (3.1415926);

    }
    @Test
    public void testArea2(){
        Circle c = new Circle(0);
        Assert.assertEquals(c.area(), 0.0);
        //Assert.assertEquals(c.area(), (3.1415926));

    }
    @Test
    public void testPerimeter(){
        Circle c = new Circle(5);
        Assert.assertEquals(c.perimeter(), (3.1415926 * 2 *5));
        //Assert.assertEquals(c.area(), (3.1415926));
    }
}
