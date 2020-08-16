public class Calculate {
    final float PI = 3.14159f;

    public float getArea(float r) {
        float area = PI*r*r;
        return area;
    }

    public float getArea(float l, float w) {
        float area = l*w;
        return area;
    }
}
