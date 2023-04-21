package org.example.MtOU;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS")
public class Address1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int aid;
    private String city;
    private String zipcode;

    public Address1(String city, String zipcode) {
        this.city = city;
        this.zipcode = zipcode;
    }

    public Address1() {
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "aid=" + aid +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
