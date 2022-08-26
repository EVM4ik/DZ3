package util;

import domain.Student;

import java.util.Random;

public class StudentUtil {

    public static Student[] generateStudents(int arrayCapacity) {
        Student[] arrayStudents = new Student[arrayCapacity];

        for (int i = 0; i < arrayCapacity; i++) {

            Student student = new Student();
            student.setStudentName(generateStudentName());
            student.setStudentID(i+1);
            arrayStudents[i] = student;

        }
        return (arrayStudents);
    }

    private static String generateStudentName() {
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        return (generatedString);
    }

}

