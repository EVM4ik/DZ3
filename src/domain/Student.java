package domain;

public class Student implements Comparable<Student>{

    private String studentName;

    private int studentID;

    public Student() {
    }

    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (studentID != student.studentID) return false;
        return studentName != null ? studentName.equals(student.studentName) : student.studentName == null;
    }

    @Override
    public int hashCode() {
        int result = studentName != null ? studentName.hashCode() : 0;
        result = 31 * result + studentID;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentID=" + studentID +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getStudentID() - o.getStudentID();
    }

}
