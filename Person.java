
public class Person {
	private String name;
	private int age;
	private boolean isMale;

	Person(String name, int age, boolean isMale) {
		setName(name);
		this.age = age;
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
			this.age = 0;
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
