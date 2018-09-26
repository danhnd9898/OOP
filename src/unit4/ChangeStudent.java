package unit4;

public class ChangeStudent {
	public static void change(Student std)
	{
		std = new Student(1995, "hung");
	}
	public static void main(String [] args )
	{
		Student std = new Student(1990, " Nam");
		System.out.println(std.getYear());
		//Student std1 = new Student(1990, "hung");
		change(std);
		System.out.println(std.getYear());
	}
	
}
