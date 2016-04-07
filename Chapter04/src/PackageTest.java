/**
 * Created by udayanga on 4/7/16.
 */
import com.udayanga.corejava.*;

import java.util.Date;
import java.util.GregorianCalendar;

import static java.lang.System.*;

public class PackageTest {
    public static void main(String[] args) {
        com.udayanga.corejava.Employee_3 udayanga= new Employee_3("Udayanga,50000,1989,10,1");
        udayanga.raiseSalary(5);
        out.println("name=" + udayanga.getName() + ",salary=" + udayanga.getSalary());
    }

    public static class Employee_3 {
        public Employee_3(String n, double s, int year, int month, int day){
            name =n;
            salary =s;
            GregorianCalendar calendar= new GregorianCalendar(year,month-1, day);
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
        private String name;
        private double salary;
        private Date hireDay;
    }
}
