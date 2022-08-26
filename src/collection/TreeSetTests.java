package collection;

import domain.Student;
import util.CollectionsUtil;
import util.StudentUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class TreeSetTests {

    public static void main(String[] args) {

        Student[] students = StudentUtil.generateStudents(10);
        Arrays.sort(students);

        TreeSet<Student> studentsTreeSet = new TreeSet<>();
        Collections.addAll(studentsTreeSet, students);
        studentsTreeSet.addAll( Arrays.asList(students));
        CollectionsUtil.print(studentsTreeSet);

        TreeSet<Student> studentsTreeSetModified = new TreeSet<>();
        for (Student s : studentsTreeSet) {
            if(s.getStudentID() %2 == 0) {
                studentsTreeSetModified.add(s);
            } else {
                studentsTreeSetModified.remove(s);
            }
        }
        CollectionsUtil.print(studentsTreeSetModified);
    }
}
