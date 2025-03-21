package Day_9;
import java.util.*;
class Employee1
{
	private int EmpId;
	private String Name;
	public int getEmployeeId() {
		return EmpId;
	}
	public void setEmployeeId(int empId) {
		EmpId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public void display()
	{
		System.out.println("Employee name:" +Name+ "Employee ID:" +EmpId);
	}
}
public class Encapsulation
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int EmpId = sc.nextInt();
		sc.nextLine();
		String Name = sc.nextLine();
		Employee1 emp = new Employee1();
		emp.setEmployeeId(EmpId);
		emp.setName(Name);
		System.out.println("empId:"+emp.getEmployeeId());
		System.out.println("empname:"+emp.getName());
	}
}