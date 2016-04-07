/**
 * Created by udayanga on 4/7/16.
 */
public class ParamTest {
    public static void main(String[] args) {
        System.out.println("Testing triple value");
        double percent =10;
        System.out.println("Before percent ="+percent);
        tripleValue(percent);
        System.out.println("After percent =" +percent);

        System.out.println("\nTesting tripleSalary:");
        Employee_2 harry = new Employee_2("Harry", 50000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());

        System.out.println("\nTesting swap:");
        Employee_2 a = new Employee_2("Alice", 70000);
        Employee_2 b = new Employee_2("Bob", 60000);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());

    }
    public static void tripleValue(double x){
        x=3*x;
        System.out.println("End of method : x="+x);
    }
    public static void tripleSalary(Employee_2 x) // works
    {
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }

    public static void swap(Employee_2 x, Employee_2 y)
    {
        Employee_2 temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }
}
class Employee_2{
    public Employee_2(String n, double s){
        name =n;
        salary = s;

    }
    public String getName(){
        return name;

    }
    public double getSalary(){
        return salary;
    }
    public void raiseSalary(double byPercent){
        double raise = salary *byPercent/100;
        salary += raise;
    }
    private String name;
    private double salary;
}