package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsoursedEmployee;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.println("Enter the number of employees: ");
		int numberEmployees = sc.nextInt();

		for (int i = 0; i < numberEmployees; i++) {
			System.out.println("Employee " + (i + 1) + "# " + "data: ");
			System.out.println("Outsourced? (y/n) ");
			char op = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Hours: ");
			Integer hours = sc.nextInt();
			System.out.println("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			if (op == 'y') {
				System.out.println("Additional charge: ");
				Double additional = sc.nextDouble();
				list.add(new OutsoursedEmployee(name, hours, valuePerHour, additional));
			}else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		System.out.println("PAYMENTS: ");
		for (Employee emp: list) {
			System.out.println(emp.getName() + " - " + emp.payment());
		}
		sc.close();
	}

}
