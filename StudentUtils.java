
package util;

import java.util.*;
import model.Student;

public class StudentUtils {
    private static Scanner sc = new Scanner(System.in);

    public static void addStudent(Map<Integer, Student> students) {
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (students.containsKey(id)) {
            System.out.println("❌ Student with this ID already exists!");
            return;
        }

        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        students.put(id, new Student(id, name));
        System.out.println("✅ Student added successfully!");
    }

    public static void updateStudent(Map<Integer, Student> students) {
        System.out.print("Enter student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        Student s = students.get(id);
        if (s == null) {
            System.out.println("❌ Student not found!");
            return;
        }

        System.out.print("Enter new name: ");
        String newName = sc.nextLine();
        s.setName(newName);
        System.out.println("✅ Student updated successfully!");
    }

    public static void deleteStudent(Map<Integer, Student> students) {
        System.out.print("Enter student ID to delete: ");
        int id = sc.nextInt();

        if (students.remove(id) != null)
            System.out.println("🗑️ Student deleted successfully!");
        else
            System.out.println("❌ Student not found!");
    }

    public static void markAttendance(Map<Integer, Student> students) {
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();

        Student s = students.get(id);
        if (s == null) {
            System.out.println("❌ Student not found!");
            return;
        }

        System.out.print("Is student present? (true/false): ");
        boolean present = sc.nextBoolean();
        s.markAttendance(present);
        System.out.println("✅ Attendance marked successfully!");
    }

    public static void showAttendance(Map<Integer, Student> students) {
        System.out.println("\n--- 🧾 Attendance Records ---");
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        for (Student s : students.values())
            System.out.println(s);
    }
}
