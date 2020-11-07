package main;

import org.omg.CORBA.Object;

abstract public class Shape   implements Comparable  // Абстрактный класс "Фигура"
{
    double Area;// area shape
    String Color;                              // Цвет фигуры
    int StartPoint;         // Начальная точка фигуры
    abstract public void Draw();    // Нарисовать фигуру

    abstract public double getArea() ;
//        return Area;
//    }

    abstract public String getColor() ;
    Shape() {  }



    public int compareTo(Object o){
        if (o instanceof Shape) {
            // o=(Circle) o;
            double Area = ((Shape) o).getArea();
            if(Area > this.Area)
            {
                return -1;}
            if(Area < this.Area){
                return 1;}
            return 0;
        }
        return Integer.MAX_VALUE;



    };
}