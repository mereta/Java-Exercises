
public class Person {
	protected Name name;
	protected Address address;
	
	public Person (Name name, Address address) {
		this.name = name;
		this.address = address;
	}
	

	public Name getName() { //getter method
		return this.name;
	}
	
	@Override
	public String toString() {
		return this.name.toString() + "/n" + this.address.toString();
	}
}
