
public class Person {
	private String name;
	private int age;
	private boolean isMale;

	Person(final String name, int age, final boolean isMale) {
		setName(name);
		setAge(age);
		this.isMale = isMale;
	}

	void setName(String name) {
		if (name.trim().length() > 0) {
			this.name = name;
		} else {
			this.name = "";
		}
	}

	void setAge(int age) {
		if (age > 0 && age < 99) {
			this.age = age;
		} else {
			if (age < 0) {
				this.age = 0;
			}
			if (age > 99) {
				this.age = 99;
			}
		}
	}

	int getAge() {
		return this.age;
	}

	String getName() {
		return this.name;
	}

	void showPersonInfo() {
		System.out.println("Name: " + this.name + "\nAge: " + this.age);
		if (isMale == true)
			System.out.println("Male");
		else
			System.out.println("Female");
	}

}
