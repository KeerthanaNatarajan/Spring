package sample.spring.practice;

public class StudentTwo {
	private Marks marks;

	public StudentTwo() {
		System.out.println("Student Two");
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	public void displayTwo() {
		marks.displayCutoff();
	}

}
