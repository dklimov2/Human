
public class Main {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();

		person1.setName("John");
		person1.setAge(23);
		person2.setName("Mike");
		person2.setAge(35);
		person1.descriptionOfPerson();
		person2.descriptionOfPerson();
	}

}
