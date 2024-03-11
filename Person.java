import java.sql.Date;
import java.util.Scanner;
public class Person
{
     void Person_info()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = s.nextLine();
        System.out.println("Enter the age:");
        int age = s.nextInt();
        System.out.println("Name : "+name);
        System.out.println("Date of birth : "+age);
    }
    public static void main(String args[])
    {
    Person p1 =new Person();
    p1.Person_info();
    Employee_details E1 = new Employee_details();
    E1.emp_info();
}
}