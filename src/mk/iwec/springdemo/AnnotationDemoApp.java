package mk.iwec.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// get beans from spring container
		Teacher theTeacher = context.getBean("mathTeacher", Teacher.class);

		// call a method on bean
		System.out.println(theTeacher.doYourDailyHomework());
		// call a method to get your grade
		System.out.println(theTeacher.getYourGrade());

		// close the context
		context.close();
	}

}
