
public class Driver {

	public static void main(String[] args) {
		Person joe = new Person("Joe", "123 RealStreet Lane", "123-867-5309", "joe@gmail.com");
		Student jim = new Student("Jim", "786 Lane Street", "123-173-2192", "jim@studentemail.com", "freshmen");
		Employee john = new Employee("John", "888 Walk Drive", "999-888-7777", "john@workemail.com", "Sales", 15.0);
		Faculty jeremy = new Faculty("Jeremy", "12 Boulevard", "987-012-4567", "joe@fhda.com", "Professor", 18.0, "12am - 12pm", 1);
		Staff jennifer = new Staff("Jennifer", "97 Street Way", "675-765-7676", "jen@fhda.com", "Admissions", 18.0, "Dean of Admissions");
		
		System.out.println(joe);
		System.out.println(jim);
		System.out.println(john);
		System.out.println(jeremy);
		System.out.println(jennifer);
	}

}
