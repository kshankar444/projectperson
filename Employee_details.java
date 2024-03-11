import java.util.Scanner;
public class Employee_details  extends Person
{
     void emp_info()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter employee id:");
        int emp_id = s.nextInt();
        System.out.println("Enter the salary:");
        float salary = s.nextInt();
        System.out.println("id: "+emp_id);
        System.out.println("salary : "+salary);
    }
}
    