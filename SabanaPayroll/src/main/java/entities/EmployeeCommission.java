package entities;

import entities.Department;
import entities.Employee;

public class EmployeeCommission extends Employee {


    private double soldProducts;
    private static final double COMMISION_VAL = 0;

    public EmployeeCommission(String name, String lastName, Department department, double soldProducts) {
        super(name, lastName, department);
        this.soldProducts = soldProducts;
    }

    @Override
    public double calculateSalary() {
        return this.soldProducts*COMMISION_VAL;
    }

    @Override
    public String toString(){
        return super.toString() + " payment by commission.";
    }
}
