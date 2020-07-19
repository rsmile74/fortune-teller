
import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		System.out.println("Hello Welcome, let me tell you your fortune.");
		System.out.println(
				"I will ask a series of questions you must answer in order to get your fortune. So let's get started.");

		// using Scanner do while loop

		String color = "help";
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String roygbiv2;
		do {
			System.out.println("You must type help with what a ROYGBIV color is? please type help then press enter.");
			roygbiv2 = scanner.nextLine();
		} while (!roygbiv2.equals(color));
		System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");

		// using scanner
		Scanner input = new Scanner(System.in);

		System.out.println("What is your firstname?");
		String firstName = input.nextLine();

		System.out.println("What is your lastname?");
		String lastName = input.nextLine();

		System.out.println("What is your age?");
		int age = input.nextInt();
		input.nextLine();

		System.out.println("What is your birth month? (put in number for birth month)");
		int birth = input.nextInt();
		input.nextLine();

		System.out.println("What is your favorite  ROYGBIV color.?");
		String roygbiv = input.nextLine();

		System.out.println("How may siblings do you have? (put in number for birth month)");
		int siblings = input.nextInt();
		input.nextLine();

		// conditions Retirement Years based on whether the user’s age is odd or even
		int Retirementyears = 0;
		if (age % 2 == 0) {
			Retirementyears = 15;
		} else {
			Retirementyears = 20;
		}

		// condition vacation home location based on how many siblings the user has. If
		// the user enters a number less than zero, give the user a bad location!
		String vacationHome = "";
		if (siblings == 0) {
			vacationHome = "Paris, France";
		} else if (siblings == 1) {
			vacationHome = "New York City, NY";
		} else if (siblings == 2) {
			vacationHome = "London, England";
		} else if (siblings == 3) {
			vacationHome = "Cleveland, OH";
		} else if (siblings > 3) {
			vacationHome = "Hollywood, CA";
		} else if (siblings < 0) {
			vacationHome = "Chernobyl, Ukraine";
		}

		// condition The user’s mode of transportation will determined by the user’s
		// favorite color.

		String myTransportation = "";
		if ("red".equals(roygbiv)) {
			myTransportation = "BMW";
		} else if ("orange".equals(roygbiv)) {
			myTransportation = "RV";
		} else if ("yellow".equals(roygbiv)) {
			myTransportation = "Truck";
		} else if ("green".equals(roygbiv)) {
			myTransportation = "Bus";
		} else if ("blue".equals(roygbiv)) {
			myTransportation = "Van";
		} else if ("indigo".equals(roygbiv)) {
			myTransportation = "Motorcycle";
		} else if ("violet".equals(roygbiv)) {
			myTransportation = "Tractor";
		}

		// condition switch case The user’s bank balance at retirement will be based on
		// the user’s birth month.
		double bankBalance = 0;
		switch (birth) {
		case 1:
		case 2:
		case 3:
		case 4:
			bankBalance = 226000.80;
			break;
		case 5:
		case 6:
		case 7:
		case 8:
			bankBalance = 4896215.12;
			break;
		case 9:
		case 10:
		case 11:
		case 12:
			bankBalance = 25.11;
			break;
		default:
			bankBalance = 0;
			break;
		}

		input.close();

		System.out.println(
				firstName + " " + lastName + " will retire in " + Retirementyears + " years \n" + "with " + bankBalance
						+ " in the bank, a vacation home in " + vacationHome + ", and travel by " + myTransportation);

		System.out.println("exit");
		System.exit(0);

	}

	{
	}
}