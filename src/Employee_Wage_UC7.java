public class Employee_Wage_UC7
{
    double empcheck = (Math.floor(Math.random() * 10) % 2);
    void result(int isEmpPresent,int Emp_Wage_Hr,int Emp_Day_Hr) //Parameter in Function
    {
        System.out.println("-----Welcome to Employee Wage Computation Program------");
        if (empcheck == isEmpPresent)
        {
            System.out.println("Employee is present "+"Employee Daily Wages is :- " + Emp_Day_Hr * Emp_Wage_Hr);
        }
        else
        {
            System.out.println("Employee is Absent Employee Daily Wage is 0");
        }
    }
    public static void main(String[] darsh)
    {
        Employee_Wage_UC7 u7 = new Employee_Wage_UC7();
        u7.result(1,20,8);
    }
}