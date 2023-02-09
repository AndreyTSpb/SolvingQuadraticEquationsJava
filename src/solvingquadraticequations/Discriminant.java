package solvingquadraticequations;
/**
 * @author Andrey Tynyanyi
 * @version 1.0
 */

public class Discriminant {
    public double d;

    /**
     * Конструктор класса,
     * сразу считает дискременант
     * @param a - double - множитель x2
     * @param b - double - множитель x
     * @param c - double
     */
    public Discriminant(double a, double b, double c){
        this.d = b * b - 4 * a * c;
    }
}