package studentdatabaseapp;

import java.util.Scanner;

public class Student
{
    private String firstName, lastName, courses = null, studentId;
    private int gradeYear, tuitionBalance = 0;
    private static int costOfCourse = 600, id = 1000;

    // Constructor: prompt user to enter student's name and id
    public Student()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = scanner.next();

        System.out.print("Enter student last name: ");
        this.lastName = scanner.next();

        System.out.print("1 - freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = scanner.nextInt();

        setStudentId();
    }

    // Generate an id
    private void setStudentId()
    {
        id++;
        this.studentId = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll()
    {
        do
        {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner scanner = new Scanner(System.in);

            String course = scanner.nextLine();
            if (!course.equals("Q"))
            {
                courses += "\n  " + course;
                tuitionBalance += costOfCourse;
            }
            else
            {
                break;
            }
        }
        while (1 != 0);
    }

    // View balance
    public void viewBalance()
    {
        System.out.println("Your balance is: $" + tuitionBalance);
    }


    // Pay Tuition
    public void payTuitoin()
    {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner scanner = new Scanner(System.in);
        int payment = scanner.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // Show status
    public String toString()
    {
        return firstName + " " + lastName +
                "\nGrade level: " + gradeYear +
                "\nStudent ID: " + studentId +
                "\nCourses enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
