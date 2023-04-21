package org.example.MtMB;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "STUDENT0")
public class Student0 {
    @Id
    @Column(name = "SID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sid;
    @Column(name = "SNAME")
    private String sname;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "STUDENTCOURSE", joinColumns = { @JoinColumn(name = "SID") },
            inverseJoinColumns = { @JoinColumn(name = "CID") })
    private Set<Course> courses;

    public Student0(String sname, Set<Course> courses) {
        this.sname = sname;
        this.courses = courses;
    }

    public Student0() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", courses=" + courses +
                '}';
    }
}
