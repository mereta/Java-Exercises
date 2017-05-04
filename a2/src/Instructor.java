
public class Instructor extends Person {

	private String position;
	private Module module;

	public Instructor (Name name, Address address, String position) {
		super(name, address);
		this.position = position;
	}

	public void setModule(Module newModule) { // setter method
		module = newModule;
	} 

	@Override
	public String toString() {
		String details;
		details = "name: " + this.name.toString() + "\n" + "address: " + this.address.toString();
		details = details + "\n" + "position: " + this.position;
		details = details + "\n" + "module: ";
		if (this.module != null){
			details = details + this.module.code + " " + "(" + this.module.title + ")" + "\n";
		}
		else{
			details = details + "not set" + "\n";
		}
		return details;
	}
}
