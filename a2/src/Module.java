
public class Module {

	protected String code;
	protected String title;
	private Instructor instructor;

	Student students[] = new Student[80];
	public static final int MAX_NUMBER_STUDENTS = 80;

	public Module (String code, String title) {
		this.code = code;
		this.title = title;
	}

	public String getCode() {
		return this.code;
	}
	public String getTitle() {
		return this.title;
	}
	public Instructor getInstructor() {
		return this.instructor;
	}

	public void setInstructor(Instructor newInstructor) { // setter method
		instructor = newInstructor;
	} 

	public boolean addStudent(Student s){
		if (students.length <= MAX_NUMBER_STUDENTS){
			for (int i=0;i<students.length;i++) { 
				if (students[i] == null) {
					students[i] = s;
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
		details ="code: " + this.code.toString() + "\n" + "title: " + this.title.toString();
		details = details + "\n" + "instructor: ";
		int cnt = 0;
		if (this.instructor != null){
			details = details + this.instructor.name.toString();
		}
		else{
			details = details + "not set";
		}
		details = details + "\n" + "students: ";

		for (int i=0;i<students.length;i++) { 
			if (students[i] != null) {
				details = details +  '\n' + '\t' + students[i].name.toString();
				cnt++;
			}
			else{
				if (cnt == 0){
					details = details + '\n' + '\t'  + "none";
				}
				break;
			}
		}
		details = details + "\n";
		return details;	
	}
}
