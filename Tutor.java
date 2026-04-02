public class Tutor extends Teacher {
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;

    public Tutor(String teacherId, String teacherName, String address, String workingType, String employmentStatus, int workingHours, double salary, String specialization, String academicQualifications, int performanceIndex) {
        super(teacherId, teacherName, address, workingType, employmentStatus);
        setWorkingHours(workingHours);
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
    }

    public void setSalary(double salary, int performanceIndex) {
        if (performanceIndex > 5 && getWorkingHours() > 20) {
            double appraisal = 0;
            if (performanceIndex >= 5 && performanceIndex <= 7) appraisal = 0.05;
            else if (performanceIndex >= 8 && performanceIndex <= 9) appraisal = 0.1;
            else if (performanceIndex == 10) appraisal = 0.2;

            this.salary = salary + (appraisal * salary);
            this.isCertified = true;
        } else {
            System.out.println("Salary cannot be approved yet.");
        }
    }

    public void removeTutor() {
        if (!isCertified) {
            this.salary = 0;
            this.specialization = "";
            this.academicQualifications = "";
            this.performanceIndex = 0;
            this.isCertified = false;
        }
    }

    @Override
    public void display() {
        super.display();
        if (isCertified) {
            System.out.println("Salary: " + salary);
            System.out.println("Specialization: " + specialization);
            System.out.println("Academic Qualifications: " + academicQualifications);
            System.out.println("Performance Index: " + performanceIndex);
        }
    }
}
