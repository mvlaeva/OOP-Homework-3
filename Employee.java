
public class Employee extends Person {
	private static final int FULL_TIME_WORKING_HOURS = 8;
	private static final int MINIMAL_AGE_TO_WORK = 18;
	private static final int MAX_DAY_SALARY = 50;
	private static final double OVERTIME_COEF = 1.5;
	private float daySalary;

	Employee(String name, int age, boolean isMale, float daySalary) {
		super(name, age, isMale);
		setDaySalary(daySalary);
	}

	void setDaySalary(float daySalary) {
		if (daySalary > 0 && daySalary < MAX_DAY_SALARY) {
			this.daySalary = daySalary;
		} else {
			this.daySalary = 0;
		}
	}

	float calculateOvertime(double hours) {
		if (this.getAge() < MINIMAL_AGE_TO_WORK) {
			return 0;
		} else {
			return (float) ((this.daySalary/FULL_TIME_WORKING_HOURS) * hours * OVERTIME_COEF);
		}
	}

	void showEmployeeInfo() {
		this.showPersonInfo();
		System.out.println("Day Salary: " + this.daySalary);
	}
}
