package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name;
		int hours, N;
		double valuePerHour;
		double additionalCharge;
		List<Employee> employee = new ArrayList<Employee>();
		
		System.out.print("Enter the number of employees: ");
		N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			System.out.printf("Employee #%d data:%n", i);
			System.out.print("Outsourced (y/n)? ");
			char response = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Hours: ");
			hours = sc.nextInt();
			System.out.print("Value per hour: ");
			valuePerHour = sc.nextDouble();
			if (response == 'y') {
				System.out.print("Additional charge: ");
				additionalCharge = sc.nextDouble();
				employee.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));				
			}
			else {
				employee.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		employee.forEach(System.out::println);
		
		/*System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee e : employee) {
			System.out.println(e);
		}*/		
		
		sc.close();
	}
}
