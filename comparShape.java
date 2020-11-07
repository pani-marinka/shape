package main;
import java.util.Comparator;

public class comparShape implements Comparator {
    @Override
    public int compare(Object o1, Object o2){
        if (o1 instanceof Shape) {
            if (o2 instanceof Shape) {


                double Area1 = ((Shape) o1).getArea();
                double Area2 = ((Shape) o2).getArea();
                if(Area1 > Area2)
                {
                    return 1;}
                if(Area1 < Area2){
                    return -1;}
                return 0;
            }}
        return Integer.MAX_VALUE;



    }
}
