package com.company;

public class BlackFactory extends BaseFactory {

    private final String message ="This is Black Factory";

    @Override
    public Circle createCircle(double x, double y, double radius) {
        return new BlackCircle(x,y,radius);
    }

    @Override
    public Triangle createTriangle(double a, double b, double c) {
        return new BlackTriangle(a,b,c);
    }

    public BlackFactory() {
        System.out.println(message);
    }

    @Override
    public BaseFactory getFactory() {
        return this;
    }
}
