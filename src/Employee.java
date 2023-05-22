import java.util.Date;

public class Employee {
    private int emp_no;
    private String name;
    private double salary;
    private String department;
    private String DOB;

    // Constructor
    public Employee(int emp_no, String name, double salary, String department, String DOB) {
        this.emp_no = emp_no;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.DOB = DOB;
    }
    // Getters and setters
    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_no=" + emp_no +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", DOB='" + DOB + '\'' +
                '}';
    }
}
