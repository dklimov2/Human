
public class Person {
	protected String name = "n/a";
	protected int age = 0;
	protected String address = "n/a";

	public Person() {
	}

	public Person(String name, int age) {
		System.out.println("New persons name: " + name);
		System.out.println("New persons age: " + age);
		this.name = name;
		this.age = age;

	}

	public void setName(String n) {
		this.name = n;
	}

	public String name() {
		return this.name;
	}

	public void setAge(int a) {
		this.age = a;
	}

	public int age() {
		return this.age;
	}

	public void setAddress(String ad) {
		this.address = ad;
	}

	public String address() {
		return this.address;
	}

	public void descriptionOfPerson() {
		System.out.println("-----------");
		System.out.println("My name is " + name);
		System.out.println("I am " + age + " years old");
		System.out.println("My address is " + address);
	}

	public static void testStatic() {
		System.out.println("Test static method");
	}
}
