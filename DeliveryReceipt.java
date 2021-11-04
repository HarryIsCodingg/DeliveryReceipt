
/*
 * This program creates the delivery receipt by calculating
 * the details provided by the user such as distance of 
 * destination, value of goods etc. 
 */

import java.util.Scanner;

public class DeliveryReceipt {
	public static void main(String[] args) {
		// Display the welcome message
		System.out.println("Welcome to the receipt Generator\n----------------------------------------\n"
				+ "Please enter the client info:");
		
		System.out.print("First Name ? ");
		
		//Creating a scanner class object
		Scanner input = new Scanner(System.in);
		
		//Storing the values entered by the user
		String firstName = input.next();
		
		//Capitalizing the first letter of the name 
		String upperCaseFName = firstName.substring(0, 1).toUpperCase();
		String capitalLetterFName = upperCaseFName + firstName.substring(1).toLowerCase();

		System.out.print("Last Name ? ");
		String lastName = input.next();
		input.nextLine();
		String upperCaseLName = lastName.substring(0, 1).toUpperCase();
		String capitalLetterLName = upperCaseLName + lastName.substring(1);

		System.out.print("Address ? ");
		String address = input.nextLine();

		System.out.print("City ? ");
		String city = input.next();

		System.out.print("Postal Code ? ");
		String postalCode = input.next();

		System.out.println("\nPlease enter the delivery info: \n");

		System.out.print("Day Of Delivery (between 1 and 31) ? ");
		int dayOfDelivery = input.nextInt();

		System.out.print("Month of Delivery (between 1 and 12) ? ");
		int monthOfDelivery = input.nextInt();

		System.out.print("Year of Delivery (between 2020 and 2021) ? ");
		int yearOfDelivery = input.nextInt();

		System.out.print("Distance from source to destination in kilometers ? ");
		double distance = input.nextDouble();

		System.out.print("Value of goods ? ");

		double value = input.nextDouble();
		
		//Displaying the receipt details and performing the necessary calculations
		System.out.println(
				"\n__________________________________________________________________________________________\n"
						+ "\t\t\t Montréal Delivery Express \t\t" + dayOfDelivery + " / " + monthOfDelivery + " / "
						+ yearOfDelivery);

		System.out.println("\n" + capitalLetterFName + " " + capitalLetterLName);
		System.out.println(address);
		System.out.println(city + ", QC, " + postalCode.toUpperCase() + "\n");
		System.out.println(
				"__________________________________________________________________________________________\n");
		System.out.printf("Sub-total %60.2f $\n", value);

		double deliveryFees = distance * 0.55;
		System.out.printf("Delivery Fees (55 Cents * " + distance + " KM) %35.2f $\n", deliveryFees);

		double tps = (value + deliveryFees) * 0.05;
		System.out.printf("TPS   No 1245 6789 RT0001 - 5 %s%38.2f $\n", "%", tps);

		double tvq = (value + deliveryFees) * 0.09975;
		System.out.printf("TVQ   No 124567890 TQ0020 - 9.975 %s%35.2f $\n", "%", tvq);

		double total = (value + deliveryFees + tps + tvq);

		System.out.printf("\nTotal %65.2f $\n", total);
		System.out.println(
				"__________________________________________________________________________________________\n");
		
		//Displaying the termination message
		System.out.println("Thank you for choosing Montréal Delivery Express.\n");
		System.out.println("Receipt generated successfully.");

	}
}
