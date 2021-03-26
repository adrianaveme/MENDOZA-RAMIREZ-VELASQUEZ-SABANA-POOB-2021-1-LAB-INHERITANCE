import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SabanaPayroll {

    private List<Department> departments;

    public double calculateUniversitySalaries() {
        double cont = 0;
        for (Department d : departments) {
            cont += d.calculateDepartmentSalaries();
        }
        return cont;
    }

    public double calculateDepartmentSalaries(UUID id) {
        double cont = 0;
        for (Department d : departments) {
            if (d.getId() == id) {
                cont = d.calculateDepartmentSalaries();
            }
        }
        return cont;
    }

    public double calculateEmployeeSalary(UUID id) {
        double cont = 0;
        for (Department d : departments) {
           List<Employee> employees = d.getEmployees();
           for (Employee e : employees){
               if (e.getId() == id){
                   cont = e.calculateSalary();
               }
           }
        }
        return cont;
    }
}
