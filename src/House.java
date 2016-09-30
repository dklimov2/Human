import java.util.ArrayList;

public class House {

	protected String address = "n/a";
	protected ArrayList<Person> listOfResidents = new ArrayList<Person>();

	public String address() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void settlePerson(Person p) {

	}

}
