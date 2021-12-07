package linecomparison;

import java.util.Scanner;

public class LineCompute {
	public double distance(double x1, double y1, double x2, double y2) {

		double lengthOfLine;
		lengthOfLine = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return lengthOfLine;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the x coordinate for point 1: ");
		double x1 = scan.nextDouble();

		System.out.println("Enter the y coordinate for point 1: ");
		double y1 = scan.nextDouble();

		System.out.println("Enter the x coordinate for point 2: ");
		double x2 = scan.nextDouble();

		System.out.println("Enter the y coordinate for point 2: ");
		double y2 = scan.nextDouble();

		LineCompute object = new LineCompute();
		double distance = object.distance(x1, y1, x2, y2);

		System.out.println("The distance between the two points is " + distance + " .");
	}
}

