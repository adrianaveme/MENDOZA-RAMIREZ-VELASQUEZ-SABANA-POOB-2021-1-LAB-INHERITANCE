import entities.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SabanaNominaTest2 {

    @BeforeAll
    public static void setUp(){

        List<Department> departments = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();

        Department d1 = new Department("arts");
        Department d2 = new Department("engineering");

        departments.add(d1);
        departments.add(d2);

        Employee e1 = new Employee("Bobby", "Brown", d1);
        Employee e2 = new Employee("Philbert", "Horseman", d1);
        Employee e3 = new Employee("Donald", "Lee", d1);

        EmployeeCommission ec1 = new EmployeeCommission("Stan", "Ursic", d2, 200.0);
        EmployeeSalary es1 = new EmployeeSalary("Harry", "Porter", d2, 500.0);
        EmployeeHours eh1 = new EmployeeHours("Danielle", "Vergara", d2, 3.0);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

    }

    @Test
    public void shouldCalculateEmployeeSalary(){


    }

    @Test
    public void shouldCalculateDepartmentSalaries(){
        

    }

    @Test
    public void shouldCalculateUniversitySalaries(){

    }

    @Test
    public void shouldPrintPayroll(){

    }









}
