package org.example.OtMnMtOB;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "DEPARTMENT")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DEPTID")
    private int deptid;
    @Column(name = "DNAME")
    private String dname;
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<Employee1> employees = new HashSet<Employee1>();

    public Department(String dname, Set<Employee1> employees) {
        this.dname = dname;
        this.employees = employees;
    }

    public Department() {
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Set<Employee1> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee1> employees) {
        this.employees = employees;
    }
}

