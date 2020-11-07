package main;

public class Point extends Shape implements Comparable

        // Конкретный класс "Точка"
{
    String Color;                              // Цвет точки
    int StartPoint;         // Координаты точки
    public void Draw()              // Нарисовать точку
    {
        System.out.println(" . ");
        // Здесь рисуется точка
    }
    public double getArea() {
        double area = 1.0;
        return area;
    }

    public String getColor() {
        Color ="white";
        return Color;
    }
    Point () {
        Color ="white";

    }


    public int compareTo(java.lang.Object o) {


        if (o instanceof Point) {
            // o=(Circle) o;
            double radius = ((Point) o).StartPoint;
            if(radius > this.StartPoint)
            {
                return -1;}
            if(radius < this.StartPoint){
                return 1;}
            return 0;
        }
        return Integer.MAX_VALUE;
    }


    @Override
    public String toString() {
        return "Point{" +

                " StartPoint=" + StartPoint +
                " Area= " + getArea() +
                " Area= " + getColor() +
                '}';
    }
}