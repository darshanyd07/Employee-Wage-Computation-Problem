public class Employee_Wage_UC1
    {
        double empcheck;
        int isEmPresent = 1;
        void set()
        {
            empcheck = Math.floor(Math.random() * 10) % 2;
        }
        void get()
        {
            System.out.println("-----Welcome to Employee Wage Computation Program------");
            if (empcheck == isEmPresent)
            {
                System.out.println("Employee is present");
            }
            else
            {
                System.out.println("Emloyee is Absent");
            }
        }
        public static void main(String[] darsh) {
            Employee_Wage_UC1 u1 = new Employee_Wage_UC1();
            u1.set();
            u1.get();
        }
    }

