package linkedListExercise;

import java.util.Iterator;
import java.util.LinkedList;

public class Classes {
	LinkedList<Student> linkedSt = new LinkedList<>();

	public Classes(LinkedList<Student> linkedSt) {
		super();
		this.linkedSt = linkedSt;
	}
	public void addStudent(Student stu){
		if (linkedSt.isEmpty()) {
			linkedSt.add(stu);
		}else if (stu.getAverageScore() >= linkedSt.getFirst().getAverageScore()) {
			linkedSt.addFirst(stu);
		}else if (stu.getAverageScore() <= linkedSt.getLast().getAverageScore()) {
			linkedSt.addLast(stu);
		}else {
			for (int i = 0; i < linkedSt.size(); i++) {
				if (stu.getAverageScore() >= linkedSt.get(i).getAverageScore()) {
					linkedSt.add(i, stu);
					break;
				}
			}
		}
	}
	public LinkedList<Student> getTopStudents(int numOfStudent){
		LinkedList<Student> result = new LinkedList<>();
		for (int i = 0; i < numOfStudent; i++) {
			result.add(linkedSt.get(i));
		}
		return result;
	}
	public LinkedList<Student> getBottomStudents(int numOfStudent){
		LinkedList<Student> result = new LinkedList<>();
		int size = linkedSt.size();
		int startIndex = size - numOfStudent;
		if (startIndex < 0) {
			startIndex = 0;
		}
		for (int i = startIndex; i < size; i++) {
			result.add(linkedSt.get(i));
		}
		return result;
	}
	public double getAverageScore(LinkedList<Student> listSt) {
		double result = 0;
		double totalScore = 0;
		for (Student student : listSt) {
			totalScore += student.getAverageScore();
		}
		result = totalScore / listSt.size();
		return result;
	}
	public double findAverageScoreOfStudent(String name) {
		double result = 0;
		for (Student student : linkedSt) {
			if (name.equals(student.getFullName())) {
				result = student.getAverageScore();
			}
		}
		return result;
	}
	public void removeStudentUnderAvgScore1(double avgScore) {
		Iterator<Student> iterator = linkedSt.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			if (student.getAverageScore() < avgScore) {
				iterator.remove();
			}
		}
	}
	public void  removeStudentUnderAvgScore2(double avgScore) {
		LinkedList<Student> listStUnderAvg = new LinkedList<>();
		for (Student student : linkedSt) {
			if (student.getAverageScore() < avgScore) {
				listStUnderAvg.add(student);
			}
		}
		linkedSt.removeAll(listStUnderAvg);
	}
    public static void displayStudentList(LinkedList<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
    
	public static void main(String[] args) {
		LinkedList<Student> studentList = new LinkedList<>();
		Classes classes = new Classes(studentList);
		Student student1 = new Student("Kamen Rider Sun", "9999", 9.9);
		Student student2 = new Student("Kamen Rider Ryuki", "8888", 9.7);
		Student student3 = new Student("Kamen Rider Decade", "7777", 9.5);
		Student student4 = new Student("Kamen Rider Diend", "6666", 9.3);
		Student student5 = new Student("Kamen Rider Faiz", "5555", 9.0);
		Student student6 = new Student("Kamen Rider Den O", "4444", 8.9);
		Student student7 = new Student("Kamen Rider Kabuto", "3333", 8.7);
		Student student8 = new Student("Kamen Rider Knight", "2222", 8.5);
		Student student9 = new Student("Kamen Rider Kuuga", "1111", 8.3);
		Student student10 = new Student("Kamen Rider Kiva", "1919", 8.1);
		classes.addStudent(student1);
		classes.addStudent(student2);
		classes.addStudent(student3);
		classes.addStudent(student4);
		classes.addStudent(student5);
		classes.addStudent(student6);
		classes.addStudent(student7);
		classes.addStudent(student8);
		classes.addStudent(student9);
		classes.addStudent(student10);
		System.out.println("LIST STUDENTS: ");
		displayStudentList(studentList);
		classes.getTopStudents(3);
		System.out.println("TOP 3 STUDENT: ");
		displayStudentList(classes.getTopStudents(3));
		System.out.println("BOTTOM 3 STUDENT: ");
		displayStudentList(classes.getBottomStudents(3));
		System.out.println("TOTAL SCORE OF CLASS: ");
		System.out.println(classes.getAverageScore(studentList));
		System.out.println("FIND AVERAGE SCORE OF STUDENT: ");
		System.out.println(classes.findAverageScoreOfStudent("Kamen Rider Sun"));
		System.out.println("List after remove students have average score under average score of the class: ");
		classes.removeStudentUnderAvgScore2(classes.getAverageScore(studentList));
		displayStudentList(studentList);
	}
}
