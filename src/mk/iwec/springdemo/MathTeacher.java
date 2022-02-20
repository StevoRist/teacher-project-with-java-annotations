package mk.iwec.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {
	@Autowired
	@Qualifier("randomGradeService")
	private GradeService gradeService;

	// define a default constructor
	public MathTeacher() {
		System.out.println(">> MathTeacher: inside default constructor");
	}

	/*
	 * // define a setter method
	 * 
	 * @Autowired private void setGradeService(GradeService theGradeService) {
	 * System.out.println(">> MathTeacher: inside GradeService method");
	 * gradeService = theGradeService; }
	 */
	/*
	 * @Autowired public MathTeacher(GradeService theGradeService) { gradeService =
	 * theGradeService; }
	 */
	@Override
	public String doYourDailyHomework() {

		return "Do your tasks from chapter 11";
	}

	@Override
	public String getYourGrade() {

		return gradeService.getGrade();
	}

}
