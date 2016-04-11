import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by udayanga on 4/8/16.
 */
public class EqualMethodsTest {
    public static void main(String[] args) {

    }
}
class Employee_2{
    public Employee_2(String n , double s, int year, int month, int day){
        name= n;
        salary =s;
        GregorianCalendar calendar= new GregorianCalendar(year, month-1, day);
        hireDay = calendar.getTime();
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public Date getHireDay()
    {
        return hireDay;
    }
    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    public boolean equals(Object otherObject){
        if(this == otherObject) return false;
        if (otherObject == null) return false;
        if(getClass() != otherObject.getClass())return  false;
        Employee_2 other=(Employee_2)otherObject;
        return getName().equals(other.name) && salary == other.salary && hireDay.equals(other.hireDay);

    }
    public int hashCode(){
        return 7 * name.hashCode() + 11 * new Double(salary).hashCode() + 13 * hireDay.hashCode();
    }

    public String toString()
    {
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay
                + "]";
    }
    private String name;
    private double salary;
    private Date hireDay;

}
class Manager_2 extends Employee_2{
    public Manager_2(String n, double s, int year, int month, int day)
    {
        super(n, s, year, month, day);
        bonus = 0;
    }
    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
    public void setBonus(double b)
    {
        bonus = b;
    }
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        Manager other = (Manager) otherObject;
// super.equals checked that this and other belong to the same class

    }
    public int hashCode()
    {
        return super.hashCode() + 17 * new Double(bonus).hashCode();
    }
    public String toString()
    {
        return super.toString() + "[bonus=" + bonus + "]";
    }
    private double bonus;
}