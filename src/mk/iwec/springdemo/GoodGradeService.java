package mk.iwec.springdemo;

import org.springframework.stereotype.Component;

@Component
public class GoodGradeService implements GradeService {

	@Override
	public String getGrade() {

		return "Well done, A+ for you";
	}

}
