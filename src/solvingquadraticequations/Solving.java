package solvingquadraticequations;

/**
 * @author Andrey Tynyanyi
 * @version 1.0
 */
public class Solving {
    public String str; // возвращает ответ

    /**
     * Решение уравнения.
     * Ожидает три параметра:
     * @param d - double - подсчитанный дискрименант
     * @param a - double
     * @param b - double
     */
    public Solving(double d, double a, double b){
        if (d > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            this.str = "Уравнение имеет два корня: x1 = " + x1 + ", x2 = " + x2;
        }
        else if (d == 0) {
            double x;
            x = -b / (2 * a);
            this.str = "Уравнение имеет один корень: x = " + x;
        }
        else {
            this.str = "Уравнение не имеет действительных корней!";
        }
    }
}
