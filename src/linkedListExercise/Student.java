package linkedListExercise;

public class Student {
	private String fullName;
	private String studentID;
	private double averageScore;
	
	public Student(String fullName, String studentID, double averageScore) {
		super();
		this.fullName = fullName;
		this.studentID = studentID;
		this.averageScore = averageScore;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public double getAverageScore() {
		return averageScore;
	}
	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}
	@Override
	public String toString() {
		return "FullName: " + fullName + ", StudentID: " + studentID + ", AverageScore: " + averageScore;
	}
	
}
