
public class Demo {

	private static final int TWO_HOURS_OVERTIME = 2;

	public static void main(String[] args) {
		Person[] people = new Person[10];
		people[0] = new Person("Anelia", 21, false);
		people[1] = new Person("Radostin", 26, true);
		people[2] = new Student("Cvetan", 17, true, 3.45f);
		people[3] = new Student("Iordan", 34, true, 5.62f);
		people[4] = new Employee("Maria", 43, false, 4.25f);
		people[5] = new Employee("Ivelina", 25, false, 7.34f);

		for (int index = 0; index < people.length; ++index) {
			if (people[index] == null)
				break;
			
			if (people[index] instanceof Employee) {
				((Employee) people[index]).showEmployeeInfo();
				System.out.println();
				continue;
			}
			
			if (people[index] instanceof Student) {
				((Student) people[index]).showStudentInfo();
				System.out.println();
				continue;
			}
			
			if (people[index] instanceof Person) {
				people[index].showPersonInfo();
				System.out.println();
			}
			
			
		}

		for (int index = 0; index < people.length; ++index) {
			if (people[index] == null)
				break;

			if (people[index] instanceof Employee)
				System.out.println("Extra salary for " + people[index].getName() + ": "
						+ ((Employee) people[index]).calculateOvertime(TWO_HOURS_OVERTIME));
		}

	}

}
