package org.example.MtOU;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sid;
    private String sname;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "AID")
    private Address1 address;

    public Student( String sname, Address1 address) {
        this.sname = sname;
        this.address = address;
    }

    public Student() {
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

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", address=" + address +
                '}';
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Address1 getAddress() {
        return address;
    }

    public void setAddress(Address1 address) {
        this.address = address;
    }
}
