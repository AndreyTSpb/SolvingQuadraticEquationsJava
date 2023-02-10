package solvingquadraticequations;

import java.util.Scanner;
import solvingquadraticequations.Discriminant;
import solvingquadraticequations.Solving;
/**
 * @author Andrey Tynyanyi3
 * @version 1.0
 */
public class SolvingQuadraticEquations {

    private static Scanner scanner = new Scanner(System.in); //Для ввода с клавиатуры

    private static double a, b, c;

    public static void main(String[] args){
        System.out.println("Программа решения квадратных уравнений");
        SolvingQuadraticEquations.enterData(); //вызов процедуры для ввода значений
        //Подключение класса который считает дискрименант
        Discriminant disc = new Discriminant(SolvingQuadraticEquations.a,
                SolvingQuadraticEquations.b,
                SolvingQuadraticEquations.c);
        //подключение класса который проводит решение уравнения
        Solving rez = new Solving(
                disc.d,
                SolvingQuadraticEquations.a,
                SolvingQuadraticEquations.b
        );
        //Вывод решения в консоль
        System.out.println(rez.str);
    }

    /**
     * Ввод с клавиатуры значений
     * для коэффициентов a, b, c
     * для квадратного уравнения
     */
    public static void enterData(){
        System.out.println("Введите коэффициенты a, b и c для квадратного уравнения  ax^2 + bx + c = 0");
        System.out.print("Введите значение a: ");
        SolvingQuadraticEquations.a = scanner.nextDouble();
        System.out.print("Введите значение b: ");
        SolvingQuadraticEquations.b = scanner.nextDouble();
        System.out.print("Введите значение c: ");
        SolvingQuadraticEquations.c = scanner.nextDouble();
    }
}