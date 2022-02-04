package ru.stqa.java_automation_course.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("world");
		hello("user");
		hello("Alexei");

		double l = 5;
		System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

		double a = 5;
		double b = 6;
		System.out.println("Площадь квадрата со сторонами " + a + " и " + b + " = " + area(a, b));

	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");

	}

	public static double area(double len) {
		return len * len;
	}

	public static double area(double a, double b) {
		return a * b;
	}

}