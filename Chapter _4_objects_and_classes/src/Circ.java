public class Circ {
    final float PI = 3.14159f;
    public float r = 0.0f;

    public float getArea() {
        float area = PI*r*r;
        return area;
    }

    public float getCircumference(float r) {
        float circumference = 2*PI*r;
        return circumference;
    }
}
