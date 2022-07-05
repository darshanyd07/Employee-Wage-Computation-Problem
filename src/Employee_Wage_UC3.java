public class Employee_Wage_UC3
{
    int empCheck = (int)Math.floor(Math.random() *10) % 3;
    Employee_Wage_UC3(int Full_time,int Part_time,int wage_Per_Hrs,int empHrs) //parameter in constructor
    {
        System.out.println("-----Welcome to Employee Wage Computation Program------");
        if ( empCheck == Full_time )
        {
            System.out.println("Employee Is Full Time");
            empHrs = 8;
        }
        else if (empCheck == Part_time )
        {
            System.out.println("Employee Is Part Time");
            empHrs = 4;
        }
        else
        {
            System.out.println("Employee Is Absent");
        }
        int empWage = empHrs * wage_Per_Hrs;
        System.out.println("Emp Wage : " +empWage);
    }
    public static void main(String[] darsh)
    {
        Employee_Wage_UC3 u3 = new Employee_Wage_UC3(1,2,20,0);
    }
}