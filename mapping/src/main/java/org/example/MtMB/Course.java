package org.example.MtMB;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "COURSE")
public class Course {
    @Id
    @Column(name = "CID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int cid;
    @Column(name = "CNAME")
    private String cname;
    @ManyToMany(mappedBy = "courses",cascade=CascadeType.ALL)
    private Set<Student0> students;

    public Course(String cname, Set<Student0> students) {
        this.cname = cname;
        this.students = students;
    }

    public Course() {
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Set<Student0> getStudents() {
        return students;
    }

    public void setStudents(Set<Student0> students) {
        this.students = students;
    }


}
