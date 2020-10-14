package com.company;

public class BlackTriangle extends BlackFactory implements Triangle {
 double a;
 double b;
 double c;
 double h;

 {
  a= 1;
  b = 1;
  c = 1;
  h = Math.sqrt(3)*0.5;
 }

 public BlackTriangle(double a, double b, double c) {
  this.a = a;
  this.b = b;
  this.c = c;
 }

 public BlackTriangle() {
 }

 @Override
 public String toString() {
  return "Created black triangle with sides: " +
          " a = " + a +
          " b = " + b +
          " c = " + c;
 }

 @Override
 public double countPerimetr() {
  return a+b+c;
 }
}