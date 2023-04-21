package org.example.OtOB;

import javax.persistence.*;

@Entity
@Table(name = "passport")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "passport_id")
    private int passportId;

    @Column(name = "pnumber")
    private String pnumber;

    @OneToOne(mappedBy = "passport", cascade = CascadeType.ALL)
    private Citizen citizen;

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    public Citizen getCitizen() {
        return citizen;
    }

    public void setCitizen(Citizen citizen) {
        this.citizen = citizen;
    }


}



