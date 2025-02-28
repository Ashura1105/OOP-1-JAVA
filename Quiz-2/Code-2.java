//Teacher
class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
//Course
class Course {
    private String courseName;
    private Teacher teacher;

    public Course(String courseName, String teacherName) {
        this.courseName = courseName;
        this.teacher = new Teacher(teacherName);
    }

    public String getCourseName() {
        return courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
//Student
class Student {
    private String name;
    private String id;
    private Course course;

    public Student(String name, String id, Course course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        if (course != null) {
            System.out.println("Enrolled in: " + course.getCourseName());
            System.out.println("Teacher: " + course.getTeacher().getName());
        } else {
            System.out.println("Not enrolled in any course.");
        }
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("OOP", "Gandu Ranga Rao");
        
        Student student1 = new Student("Kawsar","073",course1);
        Student student2 = new Student("Emon","172",null);
        
        System.out.println("Student Details:");
        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
    }
}
//CT02 Code-2 by Ashura105
