package astalakshmi.example;

public class Student {
    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        if (studentName != null && !studentName.isEmpty()) {
            this.StudentName = studentName;
        } else {
            System.out.println("Name cannot be empty");
        }
        StudentName = studentName;
    }

    public int getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(int studentAge) {
        StudentAge = studentAge;
    }

    public String getStudentMajor() {
        return StudentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        if (studentMajor != null && !studentMajor.isEmpty()) {
            this.StudentMajor = studentMajor;
        } else {
            System.out.println("Major cannot be empty");
        }
        StudentMajor = studentMajor;
    }

    private int StudentId;
    private String StudentName;
    private int StudentAge;
    private String StudentMajor;

    public Student(int studentId, String studentName, int studentAge, String studentMajor) {
        this.StudentId = studentId;
        this.StudentName = studentName;
        this.StudentAge = studentAge;
        this.StudentMajor = studentMajor;
    }
         public void getStudentInfo(){
            System.out.println("Student ID: " + getStudentId() + ", Name: " + getStudentName() + ", Age: " + getStudentAge() + ", Major: " + getStudentMajor());


    }
}
