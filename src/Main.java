
public class Main {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person("Elvis", 55);
		House house = new House();
		house.setAddress("5th avenu");
		person1.setName("John");
		person1.setAge(23);
		person2.setName("Mike");
		person2.setAge(35);
		house.settlePerson(person1);
		house.settlePerson(person2);
		house.settlePerson(person3);
		person1.descriptionOfPerson();
		person2.descriptionOfPerson();

		house.descriptionOfHouse();
		Person.testStatic();
	}

}
