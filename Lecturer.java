public class Lecturer extends Teacher { 
/** Additional attributes for Lecturer*/ 
private String department; 
private int yearsOfExperience; 
private int gradedScore; 
private boolean hasGraded; 
/**Constructor*/ 
public Lecturer(String teacherId, String teacherName, String address, 
String workingType, 
String employmentStatus, String department, int 
yearsOfExperience) { 
/** Call superclass constructor with five parameters*/ 
super(teacherId, teacherName, address, workingType, 
employmentStatus); 
// Assign additional attributes 
this.department = department; 
this.yearsOfExperience = yearsOfExperience; 
this.gradedScore = 0; 
this.hasGraded = false; 
} 
/**Accessor methods for additional attributes*/ 
public String getDepartment() { 
return department; 
} 
public int getYearsOfExperience() { 
return yearsOfExperience; 
} 
public int getGradedScore() { 
return gradedScore; 
} 
public boolean hasGraded() { 
return hasGraded; 
} 
/** Mutator method for gradedScore*/ 
public void setGradedScore(int gradedScore) { 
this.gradedScore = gradedScore; 
} 
/** Method to grade assignments* 
public void gradeAssignment(int assignmentScore, String 
studentDepartment, int studentYearsOfExperience) { 
if (!hasGraded && yearsOfExperience >= 5 && 
department.equals(studentDepartment)) { 
if (assignmentScore >= 70) { 
gradedScore = assignmentScore; 
} else if (assignmentScore >= 60) { 
gradedScore = assignmentScore; 
} else if (assignmentScore >= 50) { 
gradedScore = assignmentScore; 
} else if (assignmentScore >= 40) { 
gradedScore = assignmentScore; 
} else { 
gradedScore = assignmentScore; 
} 
hasGraded = true; 
} else { 
System.out.println("The lecturer has already graded or does not 
meet the criteria for grading."); 
} 
} 
/** Method to display details of the Lecturer*/ 
public void display() { 
super.display(); // Call the display method in the superclass 
System.out.println("Department: " + department); 
System.out.println("Years of Experience: " + yearsOfExperience); 
if (hasGraded) { 
System.out.println("Graded Score: " + gradedScore); 
} else { 
System.out.println("Graded Score: Not graded yet"); 
} 
} 
/**Example usage*/ 
public static void main(String[] args) { 
Teacher t1 = new Teacher("T111", "Cindy Kimberly", "Butwal", "Full- 
time", "Employeed"); 
t1.setWorkingHours(40); 
t1.display(); 
Lecturer lecturer = new Lecturer("T112", "Madison Beer", 
"Kathmandu", "Part-time", "Employeed", "Computer Science", 7); 
lecturer.gradeAssignment(75, "Computer Science", 2); 
lecturer.display(); 
} 
}
