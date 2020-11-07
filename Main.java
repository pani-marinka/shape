package main;


import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Arrays;

import static java.awt.Color.GRAY;

public class Main
{

    public double radius;
    public static void main(String[] args) {
        Point point = new Point();
        Circle circle = new Circle(2);
        Square square = new Square();
        Circle circle2 = new Circle(0.5);
        point.Draw();

        circle.Draw();
        square.Draw();

        Shape[] shape = new Shape[5]; // Создаем массив
        shape[0] = new Point();
        shape[4] = new Square(5, "ace");                    // new Circle();
        shape[2] = new Square(2, "green");
        shape[3] = new Square(7, "yellow");
        shape[1] = new Circle(2);//new Circle(4);

        shape[0].Draw(); // Вызывает Point.Draw();
        shape[1].Draw(); // Вызывает Circle.Draw();
        shape[2].Draw(); // Вызывает Square.Draw();
        System.out.println(shape[1].compareTo(shape[3])  );

        for (int i = 0; i < 3; i++) {
            shape[i].Draw();
            System.out.println((shape[i] instanceof Circle) + " Circle SH[" + i + "]");
        }

        for (Shape i : shape) {

            i.Draw();
            System.out.println((i instanceof Circle) + " Circle");
            System.out.println((i instanceof Square) + " Square");

        }

        Arrays.sort(shape);



        for (Shape k : shape) {
            System.out.println(k);
        }
        System.out.println("sort2");
        Arrays.sort (shape, new comparShape());
        for (Shape s : shape) {
            System.out.println(s);
        }

        System.out.println("sort3");
        Arrays.sort (shape,  new comparColorShape());
        for (Shape s : shape) {
            System.out.println(s);
        }

    }



    public void Draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(3, 4, 10, 10);

        g2d.setColor(GRAY);
        g2d.fill(circle);
    }




}


