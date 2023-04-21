package org.example.OtOU;

import javax.persistence.*;

@Entity
public class Employeedetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empdetailid;
    private int age;
    private String state;
    @Column(name="EMPID")
    private int empid;

    public Employeedetail(int age, String state, int empid) {
        this.age = age;
        this.state = state;
        this.empid = empid;
    }

    public Employeedetail() {
    }

    public int getEmpdetailid() {
        return empdetailid;
    }

    public void setEmpdetailid(int empdetailid) {
        this.empdetailid = empdetailid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    @Override
    public String toString() {
        return "Employeedetail{" +
                "empdetailid=" + empdetailid +
                ", age=" + age +
                ", state='" + state + '\'' +
                '}';
    }
}
