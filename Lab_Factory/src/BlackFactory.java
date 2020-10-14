package com.company;

public class BlackFactory extends BaseFactory {

    private final String message ="This is Black Factory";

    @Override
    public Circle createCircle(double radius) {
        return new BlackCircle(radius);
    }

    @Override
    public Triangle createTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        return new BlackTriangle(x1, y1, x2, y2, x3, y3);
    }

    public BlackFactory() {
        System.out.println(message);
    }

    @Override
    public BaseFactory getFactory() {
        return this;
    }
}
