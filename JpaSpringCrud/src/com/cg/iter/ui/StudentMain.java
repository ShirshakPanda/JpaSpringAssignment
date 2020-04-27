package com.cg.iter.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.iter.entity.Address;
import com.cg.iter.entity.Student;
import com.cg.iter.service.StudentService;

public class StudentMain {

	public StudentService service;

	public static void main(String[] args) {
		new StudentMain();
	}

	public StudentMain() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("student.xml");
		service = (StudentService) ctx.getBean("service");
		System.out.println(service);

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while (true) {
			choice = getChoice(sc);
			switch (choice) {
			case 1:
				System.out.println("Create student");
System.out.println("enter address: <HOUSE NO >  < HOUSE NAME >");
Address addr=new Address(sc.nextInt(), sc.nextLine());
				System.out.println("enter <ID> <NAME> <MOBILE> <SUBJECT>");
				Student stud = new Student(sc.nextInt(), sc.nextLine(), sc.nextLong(), sc.nextLine(),addr);
				Boolean success = service.create(stud);
				if (success)
					System.out.println("Student Saved Successfully");
				else {
					System.out.println("could not save student sry");
				}
				break;
			case 2:
				System.out.println("Update Student");
				System.out.println("enter the id of student u want to update");

				stud = service.getStudent(sc.nextInt());
				System.out.println("student found:::" + stud);
				if (stud != null) {
					System.out.println("enter new name");
					stud.setName(sc.next());
					Boolean success1 = service.update(stud);
					if (success1)
						System.out.println("Student updated Successfully");
					else {
						System.out.println("could not save student sry");
					}
				}
				break;
			case 3:
				System.out.println(" Find Student");
				System.out.println("Enter the ID of student ");
				stud = service.getStudent(sc.nextInt());
				if (stud != null)
					System.out.println("Student Found::" + stud);
				else
					System.out.println("not found");

				break;
			case 4:
				System.out.println(" Delete Student");
				System.out.println("Enter the ID of the student");
				stud = service.getStudent(sc.nextInt());
				success = null;
				if (stud != null) {
					success = service.delete(stud);
					if (success)
						System.out.println("student deleted  :: "+stud);
					else {
						System.out.println("not deleted");
					}
				}
				break;
			case 5:
				System.out.println(" EXIT");
				System.exit(0);

				break;

			default:
				System.out.println("Enter from 1 to 5 only");
				break;
			}
		}

	}

	private int getChoice(Scanner sc) {
		// TODO Auto-generated method stub
		int choice = 0;
		System.out.println("Welcome to Student Management");
		System.out.println("1. Create student");
		System.out.println("2. Update Student");
		System.out.println("3. Find Student");
		System.out.println("4. Delete Student");
		System.out.println("5. Exit ");
		System.out.println("Please select from above only");
		try {
			choice = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("please choose a number");
			sc.nextLine();
		}

		return choice;
	}
}
