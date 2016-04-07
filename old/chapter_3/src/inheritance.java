import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by udayanga on 4/7/16.
 */
public class inheritance {
    public static void main(String[] args) {

    }
}

class Employee{
    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1, day);
        hireDay=calendar.getTime();
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public Date getHireDay(){
        return hireDay;
    }
    public void raiseSalary(double byParcent){
        double raise = salary = salary * byParcent/100;
        salary+=raise;
    }
    private String name;
    private double salary;
    private Date hireDay;
}

class Manager extends Employee{
    public  Manager(String n, double s, int year,int month, int day){
        super(n,s,year,month, day);
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
    private double bonus;
}