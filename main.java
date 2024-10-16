import java.awt.*;
import java.security.PublicKey;

//        Single Level Inheritance

class Shape{
    public void area() {
        System.out.println("displays area");
    }
}
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}
//   Multi Level Inheritance
class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}
//     Hierarchial Inheritance
class circle extends Shape {
    public void area (int r) {
        System.out.println((3.14)*r*r);

        //        Hybrid Inheritance
        //       ---------------
        //     ---------------
    }
}







public class OOPS {
    public static void main(String args[]) {

    }
}