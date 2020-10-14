package com.company;

public class WhiteFactory extends BaseFactory { // WhiteFactory

    private final String message ="This is White Factory";

    public WhiteFactory() {
        System.out.println(message);
    }
			// Circle
    @Override
    public Circle createCircle(double x, double y, double radius) {
        return new WhiteCircle(x,y,radius);
    }
			// Triangle
    @Override
    public Triangle createTriangle(double a, double b, double c) {
        return new WhiteTriangle(a,b,c);
    }

    @Override
    public BaseFactory getFactory() {
        return this;
    }
}
