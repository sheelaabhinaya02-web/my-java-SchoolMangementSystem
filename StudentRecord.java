import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        String roll = sc.nextLine();

        System.out.print("Enter marks in 3 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double average = total / 3.0;

        System.out.println("\n--- Student Report Card ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if (average >= 35)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");

        sc.close();
    }
}