package com.company;

public class BlackFactory extends BaseFactory {

    private final String message ="This is Black Factory";

    @Override
    public Circle createCircle(double radius) {
        return new BlackCircle(radius);
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

