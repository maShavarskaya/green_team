public abstract class BaseFactory {
    abstract Circle createCircle(int radius);

    abstract Triangle createTriangle(int x1, int y1, int x2, int y2, int x3, int y3);
}
