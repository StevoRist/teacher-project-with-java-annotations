package mk.iwec.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomGradeService implements GradeService {
	// create array of Strings
	private String[] data = { "You will get B- today", "Nice work, A for you",
			"I'm not happy with your studing, F this time" };
	// create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getGrade() {
		// pick a random grade from array
		int index = myRandom.nextInt(data.length);
		String theGrade = data[index];

		return theGrade;
	}

}
