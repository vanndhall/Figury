package figury;

public class Square extends Shape{
    private double side;
    private String name;
    public Square() {}
    public Square(String name, double side) {
        this.name = name;
        this.side = side;
    }
    public double getArea() {
        double wynikSquare = side*side;
        return wynikSquare;
    }
    public double getSide(){
        double wynikCube = side*side*side;
        return wynikCube;
    }

}

