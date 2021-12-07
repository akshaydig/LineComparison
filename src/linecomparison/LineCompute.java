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

		System.out.println("Enter the x coordinate for point 1: ");
		double x11 = scan.nextDouble();

		System.out.println("Enter the y coordinate for point 1: ");
		double y11 = scan.nextDouble();

		System.out.println("Enter the x coordinate for point 2: ");
		double x22 = scan.nextDouble();

		System.out.println("Enter the y coordinate for point 2: ");
		double y22 = scan.nextDouble();

		LineCompute object = new LineCompute();
		Double line1 = object.distance(x1, y1, x2, y2);
		Double line2 = object.distance(x11, y11, x22, y22);

		if (Double.compare(line1, line2) == 0) {
			System.out.println("Two lines are equal");
		} else if (Double.compare(line1, line2) < 0) {
			System.out.println("Line1 is less than Line2");
		} else
			System.out.println("Line1 is Greater than Line2");
	}
}
