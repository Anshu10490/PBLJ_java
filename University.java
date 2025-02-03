import java.util.Scanner;

class CourseFullException extends Exception {
    private String message;
    
    public CourseFullException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

class PrerequisiteNotMetException extends Exception {
    private String message;
    
    public PrerequisiteNotMetException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

public class Solution {

    static final int MAX_ENROLLMENT = 30;
    static int currentEnrollment = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the course to enroll in: ");
        String course = sc.nextLine();

        System.out.print("Enter your status for prerequisites (Completed/Not Completed): ");
        String prerequisiteStatus = sc.nextLine();

        try {
            enrollInCourse(course, prerequisiteStatus);
        } catch (CourseFullException | PrerequisiteNotMetException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static void enrollInCourse(String course, String prerequisiteStatus) throws CourseFullException, PrerequisiteNotMetException {
        if (currentEnrollment >= MAX_ENROLLMENT) {
            throw new CourseFullException("The course " + course + " is full. Enrollment limit reached.");
        }

        if ("Not Completed".equalsIgnoreCase(prerequisiteStatus)) {
            throw new PrerequisiteNotMetException("Complete Core Java before enrolling in " + course + ".");
        }

        currentEnrollment++;
        System.out.println("Successfully enrolled in " + course + ". Current Enrollment: " + currentEnrollment);
    }
}
