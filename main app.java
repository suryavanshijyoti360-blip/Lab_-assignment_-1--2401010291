package lassignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("===== Student Record Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    Student s = new Student();
                    s.inputDetails();
                    students.add(s);
                    System.out.println("Student Added Successfully!\n");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No student records found.\n");
                    } else {
                        System.out.println("===== Student Records =====");
                        for (Student st : students) {
                            st.displayDetails();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting the application. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice! Try again.\n");
            }
        }
    }
}