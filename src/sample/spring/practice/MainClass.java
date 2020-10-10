package sample.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = context.getBean("student", Student.class);
		student.display();
		
		StudentTwo studentTwo =  context.getBean("studentTwo", StudentTwo.class);
		studentTwo.displayTwo();
		
		StudentThree studentThree = context.getBean("studentThree", StudentThree.class);
		studentThree.displayThree();
		
	}

}
