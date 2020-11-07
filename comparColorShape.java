package main;

import java.util.Comparator;

public class comparColorShape implements Comparator {
    @Override
    public int compare(java.lang.Object o1, java.lang.Object o2){
        if (o1 instanceof Shape) {
            if (o2 instanceof Shape) {
                {
                    String c1 = ((Shape) o1).getColor();
                    String c2 = ((Shape) o2).getColor();

                    return c1.compareToIgnoreCase(c2);

                    //((Shape) o1).Color.compareToIgnoreCase(((Shape) o2).Color);//
                }
            }}
        return Integer.MAX_VALUE;



    }
}