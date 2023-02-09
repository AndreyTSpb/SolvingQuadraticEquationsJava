package solvingquadraticequations;

import java.util.Scanner;
import solvingquadraticequations.Discriminant;
/**
 * @author Andrey Tynyanyi3
 * @version 1.0
 */
public class SolvingQuadraticEquations {

    private static Scanner scanner = new Scanner(System.in); //Для ввода с клавиатуры

    private double a;
    private double b;
    private double c;

    public static void main(String[] args){
        System.out.println("Программа решения квадратных уравнений");
        System.out.println("Введите коэффициенты a, b и c для квадратного уравнения  ax2 + bx + c = 0");
        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите значение c: ");
        double c = scanner.nextDouble();

    }

}