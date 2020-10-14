package com.company;

public class WhiteCircle extends WhiteFactory implements Circle {
    double x ;
    double y ;
    double radius;

    {
        x =0;
        y = 0;
        radius = 1;
    }

    public WhiteCircle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public WhiteCircle() {

    }


    @Override
    public String toString() {
        return "Created white circle with center in "+
                "("+ x +
                " ; " + y + ")"+
                " and radius "+ radius;
    }

    @Override
    public double countArea() {
        return  Math.PI* Math.pow(radius,2);
    }

}
