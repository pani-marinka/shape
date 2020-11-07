package main;




public class Circle extends Shape  implements Comparable            // Конкретный класс "Круг"
{
    String Color;                              // Цвет круга
    int StartPoint;         // Координаты центра круга


    public void Draw()              // Нарисовать круг
    {
        System.out.println("DRAW CIRCLE");
    }


    @Override
    public int compareTo(java.lang.Object o) {

        if (o instanceof Circle) {
            // o=(Circle) o;
            double radius = ((Circle) o).getRadius();
            if (radius > this.radius) {
                return -1;
            }
            if (radius < this.radius) {
                return 1;
            }
            return 0;
        }
        return Integer.MAX_VALUE;


    }


    private double radius;

    public double getRadius() {
        return radius;
    }

    Circle() {
        this.radius = 1;
        this.Color="white";
    }

    Circle(double radius) {
        this.radius = radius;
        this.Color="red";
    }

    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    public String getColor() {
        return Color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + radius +
                " Area=" + getArea() +
                " Color=" + Color +
                '}';
    }

}

