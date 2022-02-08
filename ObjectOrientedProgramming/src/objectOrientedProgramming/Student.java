package objectOrientedProgramming;

public class Student{
		
		   private String firstName;
	       private String lastName;
	       private int registration;
	       private int grade;
	       private int year;
	       
	       public static void main(String[] args) {
	   		
	   		Student student1 = new Student("Ernesto","Díaz",1,3,1992);	
	   		Student student2 = new Student("Arturo","Cuellar",2,3,1995);	
	
	   		
	   	System.out.println("El nombre del estudiante es " + student1.getFirstName() + " y su apellido es " + student1.getLastName() + " su registro es " + student1.getRegistration() + " su grado es " + student1.getGrade() + " y su año de nacimiento es " + student1.getYear());
	   	System.out.println("El nombre del estudiante es " + student2.getFirstName() + " y su apellido es " + student2.getLastName() + " su registro es " + student2.getRegistration() + " su grado es " + student2.getGrade() + " y su año de nacimiento es " + student2.getYear());
	       }
	   	public Student(String firstName, String lastName, int registration, int grade, int year) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.registration = registration;
			this.grade = grade;
			this.year = year;
			
		}
	       

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getRegistration() {
			return registration;
		}

		public void setRegistration(int registration) {
			this.registration = registration;
		}

		public int getGrade() {
			return grade;
		}

		public void setGrade(int grade) {
			this.grade = grade;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}
	       

	       

}
