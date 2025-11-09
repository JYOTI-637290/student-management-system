package main;

import java.util.*;
import model.Student;
import util.StudentUtils;

public class AttendanceSystem {
    public static void main(String[] args) {
        Map<Integer, Student> students = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== 🎓 Student Attendance Management =====");
            System.out.println("1️⃣  Add Student");
            System.out.println("2️⃣  Update Student");
            System.out.println("3️⃣  Delete Student");
            System.out.println("4️⃣  Mark Attendance");
            System.out.println("5️⃣  Show Attendance");
            System.out.println("6️⃣  Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> StudentUtils.addStudent(students);
                case 2 -> StudentUtils.updateStudent(students);
                case 3 -> StudentUtils.deleteStudent(students);
                case 4 -> StudentUtils.markAttendance(students);
                case 5 -> StudentUtils.showAttendance(students);
                case 6 -> {
                    System.out.println("👋 Exiting... Goodbye!");
                    return;
                }
                default -> System.out.println("⚠️ Invalid choice! Try again.");
            }
        }
    }
}

