import entities.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SabanaNominaTest2 {

    private static Department d1;
    private static Department d2;
    private static Employee e1;
    private static Employee e2;
    private static Employee e3;
    private static EmployeeCommission ec1;
    private static EmployeeSalary es1;
    private static EmployeeHours eh1;
    private static SabanaPayroll sp;

    @BeforeAll
    public static void setUp(){

        List<Department> departments = new ArrayList<>();
        List<Employee> employeesArt = new ArrayList<>();
        List<Employee> employeesEngineering = new ArrayList<>();

        Department d1 = new Department("arts", employeesArt);
        Department d2 = new Department("engineering", employeesEngineering);

        departments.add(d1);
        departments.add(d2);

        Employee e1 = new Employee("Bobby", "Brown", d1);
        Employee e2 = new Employee("Philbert", "Horseman", d1);
        Employee e3 = new Employee("Donald", "Lee", d1);

        EmployeeCommission ec1 = new EmployeeCommission("Stan", "Ursic", d2, 200.0);
        EmployeeSalary es1 = new EmployeeSalary("Harry", "Porter", d2, 500.0);
        EmployeeHours eh1 = new EmployeeHours("Danielle", "Vergara", d2, 3.0);

        employeesArt.add(e1);
        employeesArt.add(e2);
        employeesArt.add(e3);
        employeesEngineering.add(ec1);
        employeesEngineering.add(es1);
        employeesEngineering.add(eh1);

        SabanaPayroll sp = new SabanaPayroll(departments);
    }

    @Test
    public void shouldCalculateEmployeeSalary(){
        assertEquals(400.0, sp.calculateEmployeeSalary(ec1.getId()));
        assertEquals(460.0, sp.calculateEmployeeSalary(es1.getId()));
        assertEquals(30.0, sp.calculateEmployeeSalary(eh1.getId()));
    }

    @Test
    public void shouldCalculateDepartmentSalaries(){
        assertEquals(0, sp.calculateDepartmentSalaries(d1.getId()));

    }

    @Test
    public void shouldCalculateUniversitySalaries(){

    }

    @Test
    public void shouldPrintPayroll(){

    }









}
