public class Lecturer extends Teacher {
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;

    public Lecturer(String teacherId, String teacherName, String address, String workingType, String employmentStatus, String department, int yearsOfExperience) {
        super(teacherId, teacherName, address, workingType, employmentStatus);
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0;
        this.hasGraded = false;
    }

    public void gradeAssignment(int assignmentScore, String studentDepartment, int studentYearsOfExperience) {
        if (!hasGraded && yearsOfExperience >= 5 && department.equals(studentDepartment)) {
            this.gradedScore = assignmentScore;
            this.hasGraded = true;
        } else {
            System.out.println("The lecturer has already graded or does not meet the criteria for grading.");
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Years of Experience: " + yearsOfExperience);
        if (hasGraded) {
            System.out.println("Graded Score: " + gradedScore);
        } else {
            System.out.println("Graded Score: Not graded yet");
        }
    }
}
