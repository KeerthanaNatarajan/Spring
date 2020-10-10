package sample.spring.practice;

public class StudentThree {
	private Marks marks;

	public StudentThree() {
		System.out.println("Student Three");
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	public void displayThree() {
		marks.displayCutoff();
	}
	

}
