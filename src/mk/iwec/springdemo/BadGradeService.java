package mk.iwec.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BadGradeService implements GradeService {

	@Override
	public String getGrade() {

		return "Oh, you haven't study hard. You get F-";
	}

}
