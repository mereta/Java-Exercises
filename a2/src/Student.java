
public class Student extends Person {
	private String programme;

	Module modules[] = new Module[12];
	public static final int MAX_NUMBER_MODULES = 12;

	public Student (Name name, Address address, String programme) {
		super(name, address);
		this.programme = programme;
	}


	public boolean addModule(Module m){
		if (modules.length <= MAX_NUMBER_MODULES){
			for (int i=0;i<modules.length;i++) { 
				if (modules[i] == null) {
					modules[i] = m;
					break;
				}
			}
			return true;
		}
		else {
			return false;	
		}	
	}

	@Override
	public String toString() {
		String details;
		details ="name: " + this.name.toString() + '\n' + "address: " + this.address.toString();
		details = details + "\n" + "programme: " + this.programme;
		details = details + "\n" + "modules: ";
		int cnt = 0;

		for (int i=0;i<modules.length;i++) { 
			if (modules[i] != null) {
				details = details + '\n' + '\t' + modules[i].getCode() + " " + "(" + modules[i].getTitle() + ")";
				cnt++;
			}
			else{
				if (cnt == 0){
					details = details + '\n' + '\t' + "none";
				}
				break;
			}
		}
		details = details + "\n";
		return details;
	}
}

