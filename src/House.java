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
		if (listOfResidents.contains(p)) {
			System.out.println("He lives here already");
		} else {
			listOfResidents.add(p);
			p.setAddress(this.address);
		}

	}

	public void evictPerson(Person p) {
		listOfResidents.remove(p);
		p.setAddress("n/a");
	}

	public void descriptionOfHouse() {
		System.out.println("# ----------");
		System.out.println("# Address of this house is: " + this.address);
		System.out.println("# List of residents:");
		if (listOfResidents != null) {
			for (int i = 0; i < listOfResidents.size(); i++) {
				Person p = listOfResidents.get(i);
				System.out.println("# - " + p.name());
			}
		}

	}

}
