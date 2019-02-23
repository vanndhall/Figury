package figury;

public class Rectangle extends Shape {

    //POLA
    private double a ;
    private double b;

    //KONSTRUKTORY
    public Rectangle(){}
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
        //METODY
        public double getArea(){
        double wynikRectangle = a*b;
        return wynikRectangle;
        }

    }



