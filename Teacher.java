public class Teacher {
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;

    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }

    // Getters and Setters 
    public int getTeacherId() { return teacherId; }
    public String getTeacherName() { return teacherName; }
    public void setWorkingHours(int hours) { this.workingHours = hours; }
}
