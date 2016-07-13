
public class Student extends Person {
	private float score;

	Student(String name, int age, boolean isMale, float score) {
		super(name, age, isMale);
		setScore(score);
	}

	void setScore(float score) {
		if (score >= 2 && score <= 6) {
			this.score = score;
		} else {
			if (score < 2) {
				this.score = 2;
			}
			if (score > 6) {
				this.score = 6;
			}
		}
	}

	void showStudentInfo() {
		this.showPersonInfo();
		System.out.println("Score: " + this.score);
	}

}
