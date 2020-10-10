package sample.spring.practice;

public class Student {

	private String name;
	private int id;
	Marks marks;
	
	/*public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}*/
		
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void setMarks(Marks marks) {
		this.marks = marks;
	}

	public void display() {
		System.out.println("Name of student is "+ name + " and id is " +id);
		marks.displayCutoff();
	}	
}
