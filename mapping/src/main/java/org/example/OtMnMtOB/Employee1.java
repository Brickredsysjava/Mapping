package org.example.OtMnMtOB;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "EMPLOYEE1")
public class Employee1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMPID")
    private int empid;
    @Column(name = "ENAME")
     private String ename;
    @Column(name = "EMAIL")
    private String email;
    @ManyToOne
    @JoinColumn(name = "DEPTID")
    private Department department;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee1)) return false;
        Employee1 employee = (Employee1) o;
        return empid == employee.empid && Objects.equals(ename, employee.ename) && Objects.equals(email, employee.email) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empid, ename, email, department);
    }

    public Employee1(String ename, String email, Department department) {
        this.ename = ename;
        this.email = email;
        this.department = department;
    }

    public Employee1() {
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", ename='" + ename + '\'' +
                ", email='" + email + '\'' +
                ", department=" + department +
                '}';
    }
}
