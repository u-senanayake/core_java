import sun.util.calendar.Gregorian;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by udayanga on 4/7/16.
 */
public class ClassAndObject {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Udayanga",75000,1987,12,15);
        staff[1] = new Employee("Senanayake",65000,1989,11,5);
        staff[2] = new Employee("Udayanga Senanayake",55000,1981,3,16);

        for (Employee e :staff)
            e.raiseSalary(5);

        for (Employee e: staff)
            System.out.println("Name = "+e.getName()+"\t"+"Salary = "+e.getSalary()
            +"\t"+"Hire day = "+ e.getHireDay()
            );
    }
}

class Employee{
    public Employee(String n, double s, int year, int month, int day){
        name =n;
        salary =s;
        GregorianCalendar calendar =  new GregorianCalendar(year,month-1,day);
        //Gregorian use 0 for january
        hireDay = calendar.getTime();
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
    public void raiseSalary(double byPercent){
        double raise = salary *byPercent/100;
        salary += raise;
    }
    private String name;
    private double salary;
    private Date hireDay;
}