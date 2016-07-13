
public class Employee extends Person {
	private static final double OVERTIME_COEF = 1.5;
	private float daySalary;

	Employee(String name, int age, boolean isMale, float daySalary) {
		super(name, age, isMale);
		setDaySalary(daySalary);
	}

	void setDaySalary(float daySalary) {
		if (daySalary > 0 && daySalary < 20) {
			this.daySalary = daySalary;
		} else {
			this.daySalary = 0;
		}
	}

	float calculateOvertime(double hours) {
		if (this.getAge() < 18) {
			return 0;
		} else {
			return (float) (this.daySalary * hours * OVERTIME_COEF);
		}
	}

	void showEmployeeInfo() {
		this.showPersonInfo();
		System.out.println("Day Salary: " + this.daySalary);
	}
}
