public class EmployeeHours extends Employee{

    private double hours;
    private static final double HOURS_VAL = 0;

    public EmployeeHours(String name, String lastName, Department department, double hours) {
        super(name, lastName, department);
        this.hours = hours;
    }

    @Override
    public double calculateSalary() {
        return this.hours*HOURS_VAL;
    }

    @Override
    public String toString(){
        return super.toString() + " payment by hours.";
    }
}
