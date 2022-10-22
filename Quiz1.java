
/**
 * Quiz1
 */
public class Quiz1 {

    public static void main(String[] args) {
        Circle c1 = new Circle(29.4);
        Rectangle r1 = new Rectangle(new Rectangle.Dimension(3, 6));

        System.out.println(c1.getArea());
        System.out.println(r1.getArea());

        System.out.println(c1.toString());
        System.out.println(r1.toString());
    }

}
