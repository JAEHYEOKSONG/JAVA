package Ex1;

import java.util.ArrayList;

public class Student {
	protected int studentID;
	protected String studentName;
	
	ArrayList<Subject>subjectList = new ArrayList<>();
	
	public Student(int studentid, String studentName) {
		this.studentID = studentid;
		this.studentName = studentName;
	}
	
	public void addSubject(String name, int point) {
		Subject subject =new Subject();
		subject.setName(name);
		subject.setScorePoint(point);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for (Subject subject : subjectList) {
			total += subject.getScorePoint();
			System.out.println(studentName + "학생의" + subject.getName() + "과목의 성적은" + subject.getScorePoint() + "입니다.");
		}
		System.out.println(studentName + "학생의 총점은" + total + "점입니다.");
		
	}
}
