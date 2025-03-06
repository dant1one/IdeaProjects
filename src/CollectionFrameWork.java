import java.util.*;

class Student {
    int id;
    String name;
    int age;
    Set<String> courses;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.courses = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + ", courses=" + courses + "}";
    }
}

class StudentManager {
    Map<Integer, Student> students = new HashMap<>();

    void addStudent(int id, String name, int age) {
        students.put(id, new Student(id, name, age));
    }

    void removeStudent(int id) {
        students.remove(id);
    }

    void updateStudent(int id, String name, Integer age, Set<String> courses) {
        Student student = students.get(id);
        if (student != null) {
            if (name != null) student.name = name;
            if (age != null) student.age = age;
            if (courses != null) {
                student.courses = new HashSet<>(courses);
            }
        }
    }

    void displayStudents() {
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }

    void searchStudentById(int id) {
        System.out.println(students.containsKey(id) ? students.get(id) : "Student not found");
    }

    void listStudentsByCourse(String course) {
        for (Student s : students.values()) {
            if (s.courses.contains(course)) {
                System.out.println(s);
            }
        }
    }
}

public class CollectionFrameWork {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent(1, "Korolain", 67);
        manager.addStudent(2, "Indushka", 5);
        manager.addStudent(3, "Sara", 41);
        manager.updateStudent(1, null, null, new HashSet<>(Arrays.asList("Java", "Prob & Stats")));
        manager.updateStudent(2, null, null, new HashSet<>(Arrays.asList("Java", "Discrete Math")));
        manager.updateStudent(3, null, null, new HashSet<>(Arrays.asList("Python", "Python")));
        manager.displayStudents();
        manager.searchStudentById(2);
        manager.listStudentsByCourse("Java");
        manager.removeStudent(2);
        manager.displayStudents();
    }
}