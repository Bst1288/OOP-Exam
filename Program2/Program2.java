import java.util.Scanner;

public class Program2{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter course name : ");
        String course = input.nextLine();
		System.out.print("Enter student #1 : ");
        String student1 = input.nextLine();
		System.out.print("Enter student #2 : ");
        String student2 = input.nextLine();
		System.out.print("Enter student #3 : ");
        String student3 = input.nextLine();
		System.out.print("Enter student #4 : ");
        String student4 = input.nextLine();
		// Add course name
		Course courseName = new Course(course);
		// Add three students
		courseName.addStudent(student1);
		courseName.addStudent(student2);
		courseName.addStudent(student3);
		courseName.addStudent(student4);
		// remove one student
        courseName.dropStudent(student1);

        courseName.clear();

        //courseName.addStudent(student1);
		// Displays
		System.out.println("----------------------------------------------------------");
		System.out.println("The students in the " + courseName.getCourseName() + " :");
		String[] students = courseName.getStudents();
		for (int i = 0; i < courseName.getNumOfStudent(); i++) {
			System.out.print(students[i] + " ");
		}
		System.out.printf("\n => and " + student2 + " isn't in the " + courseName.getCourseName() + " course");
		System.out.println(" ");
		System.out.println("----------------------------------------------------------");
		System.out.println(courseName.getStudents().length);
		System.out.println("----------------------------------------------------------");
		input.close();
    }
}