package main;

import org.omg.CORBA.Object;

public class Square extends Shape implements Comparable

        // Конкретный класс "Квадрат"
{
    String Color;                              // Цвет квадрата
    int storona;         // Координаты верхнего левого угла
    public void Draw()              // Нарисовать квадрат
    {
        System.out.println("DRAWSQUARE");
    }

    Square() { storona=1; Color="blue" ;}


    Square( int storona , String colorInput)
    {
        this.storona= storona ;
        this.Color=colorInput;
    }

    public double getArea() {
        double area = storona*storona;
        return area;
    }

    public String getColor() {
        return Color;
    }

    @Override
    public int compareTo(java.lang.Object o) {

        if (o instanceof Square) {
            // o=(Circle) o;
            double radius = ((Square) o).storona;
            if(radius > this.storona)
            {
                return -1;}
            if(radius < this.storona){
                return 1;}
            return 0;
        }
        return Integer.MAX_VALUE;
    }

    @Override
    public String toString() {
        return "Square{" +
                " storona=" + storona +
                " Area=" + getArea() +
                " Color=" + Color +
                '}';
    }
}
