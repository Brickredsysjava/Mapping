package org.example.OtOU;

import javax.persistence.*;


@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @Column(name = "EMPID")
    private int empid;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "EMPID")
    private Employeedetail employeedetails;

    public Employee(int empid,String name) {
        this.empid=empid;
        this.name = name;

    }

    public Employee() {
    }



    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employeedetail getEmployeedetails() {
        return employeedetails;
    }

    public void setEmployeedetails(Employeedetail employeedetails) {
        this.employeedetails = employeedetails;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", employeedetails=" + employeedetails +
                '}';
    }
}
