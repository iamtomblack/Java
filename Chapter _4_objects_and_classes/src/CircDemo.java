
public class CircDemo {
    public static void main(String[] args) {
        Circ circ = new Circ();
        circ.r = 20;

        float r = 20;

        float area = circ.getArea();
        float circumference = circ.getCircumference(r);

        System.out.println("area:"+area+" circumferece:"+circumference);

    }
}
