package homework_java_2_2;

import java.util.Scanner;

public class Java2_2_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Fraction a = new Fraction(in.nextInt(), in.nextInt());

		Fraction b = new Fraction(in.nextInt(),in.nextInt());

		a.print();

		b.print();

		a.plus(b).print();

		a.multiply(b).plus(new Fraction(5,6)).print();

		a.print();

		b.print();

		in.close();
	}
}
