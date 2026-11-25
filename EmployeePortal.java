class Employee
{
    static String company;
    String name;
    String position;
    private int ID;
        public int getID()
        {
            return ID;
        }

        public void setID(int a)
        {
            ID = a;
        }
    
    private double salary;
        public double getSalary()
        {
            return salary;
        }

        public void setSalary(double s)
        {
            salary = s;
        }

    static
    {
        System.out.println("Employee File Records");
    }
}


public class EmployeePortal
{
    public static void main(String a[])
    {
        
        Employee e1 = new Employee();
        e1.name = "Youssef";
        e1.position = "Lead";
        e1.setID (1234);
        e1.setSalary (100500.00);

        Employee e2 = new Employee();
        e2.name = "Sai";
        e2.position = "Lead";
        e2.setID (1112);
        e2.setSalary (120500.00);

        Employee e3 = new Employee();
        e3.name = "Claude";
        e3.position = "programming";
        e3.setID (3311);
        e3.setSalary (82000.00);

        Employee.company = "Dacula Droids";

        StringBuilder sb1 = new StringBuilder("Employee");
        sb1.append(" Number 1");

        StringBuilder sb2 = new StringBuilder("Employee");
        sb2.append(" Number 2");

        StringBuilder sb3 = new StringBuilder("Employee");
        sb3.append(" Number 3");

        System.out.println("-------------------------------------");
        System.out.println(sb1);
        System.out.println("Name : " + e1.name + "__ Position: " + e1.position + "__ ID: " + e1.getID() + "__ Salary: " + e1.getSalary());
        System.out.println(" ");
        System.out.println(sb2);
        System.out.println("Name : " + e2.name + "__     Position: " + e2.position + "__ ID: " + e2.getID() + "__ Salary: " + e2.getSalary());
        System.out.println(" ");
        System.out.println(sb3);
        System.out.println("Name : " + e3.name + "__  Position: " + e3.position + "__ ID: " + e3.getID() + "__ Salary: " + e3.getSalary());
        System.out.println("______________________________________");
    }
} 