package mk.iwec.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HistoryTeacher implements Teacher {
	@Autowired
	@Qualifier("badGradeService")
	private GradeService gradeService;

	// create default constructor
	public HistoryTeacher() {
		System.out.println(">> HistoryTeacher: inside default constructor");
	}

	/*
	 * // define a setter method
	 * 
	 * @Autowired private void setGradeService(GradeService theGradeService) {
	 * System.out.println(">> HistoryTeacher: inside GradeService method");
	 * gradeService = theGradeService; }
	 */
	/*
	 * @Autowired public HistoryTeacher(GradeService theGradeService) { gradeService
	 * = theGradeService; }
	 */
	@Override
	public String doYourDailyHomework() {

		return "Learn chapters about WW2";
	}

	@Override
	public String getYourGrade() {

		return gradeService.getGrade();
	}

}
