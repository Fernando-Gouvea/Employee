package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.employee;



public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		List<employee> list = new ArrayList<>();

		System.out.printf("How many employees will registered?");
		int size =  sc.nextInt();

		for (int i=0; i<size;i++) {
			System.out.print("ID:");
			Integer id = sc.nextInt();


			System.out.print("name:");
			sc.nextLine();
			String name = sc.nextLine();


			System.out.print("salary:");
			Double salary = sc.nextDouble();

			list.add(new employee(id, name, salary)); 
		}

		System.out.print("Enter employee ID that will have salary increase:\n ");
		int id = sc.nextInt();

		employee emp = list.stream().filter(x -> x.getId()==id).findFirst() .orElse(null);
		if (emp==null) {

			System.out.print("\n----ID not existent----");

		}
		else { 

			System.out.print("Enter the percentage:\n");
			Double inc = sc.nextDouble();
			emp.salaryinc(inc); 
		}

		for (employee e:list ) {

			System.out.print(e);

		}

		sc.close();
	}
}
