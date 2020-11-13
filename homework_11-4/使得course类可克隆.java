import java.lang.*;
public class 使得course类可克隆 {
	public static void main(String[] args) {
		Course c1 = new Course("课程1");
		//c2克隆c1
		Course c2 = (Course)c1.clone();
		System.out.println("c1 == c2   " + (c1 == c2));
	}
	
}
//course方法，继承Cloneable接口
class Course implements Cloneable{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String[] getStudent() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		
	}
	
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException ex) {
			return null;
		}
	}
}


