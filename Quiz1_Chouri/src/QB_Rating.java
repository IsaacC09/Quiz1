
import java.util.Scanner;

public class QB_Rating {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of touch-downs.");
		double td = input.nextDouble(); // Taking variable for number of
										// touch-downs.

		System.out.println("Enter the number of total yards. ");
		double yds = input.nextDouble(); // Taking variable for the number of
											// total yards.

		System.out.println("Enter the number of interceptions.");
		double Int = input.nextDouble(); // Taking variable for the number of
											// interceptions.

		System.out.println("Enter the number of completions.");
		double comp = input.nextDouble(); // Taking variable for the number of
											// completions.

		System.out.println("Enter the number of passes attempted.");
		double att = input.nextDouble(); // Taking variable for the number of
											// passes attempted.

		input.close();

		double a = (((comp / att * 1.0) - 0.3) * 5);
		double b = (((yds / att * 1.0) - 3) * .25);
		double c = ((td / att * 1.0) * 20);

		double x;
		if ((a <= 0) || (b <= 0) || (c <= 0)) {
			x = 0;
		} else {
			x = 2.375;
		}
		double d = (x - ((Int / att * 1.0) * 25));

		double passerRating = (a + b + c + d) / 6 * 100;

		System.out.printf("This QB passer Rating is: %.1f\n", passerRating);

	}

}
