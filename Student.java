
package model;

public class Student {
    private int id;
    private String name;
    private int totalClasses;
    private int attendedClasses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.totalClasses = 0;
        this.attendedClasses = 0;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public void setName(String newName) { this.name = newName; }

    public void markAttendance(boolean present) {
        totalClasses++;
        if (present) attendedClasses++;
    }

    public double getAttendancePercentage() {
        if (totalClasses == 0) return 0.0;
        return (attendedClasses * 100.0) / totalClasses;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %-15s | Attendance: %.2f%%", id, name, getAttendancePercentage());
    }
}
