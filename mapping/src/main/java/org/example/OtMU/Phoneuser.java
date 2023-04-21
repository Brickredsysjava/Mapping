package org.example.OtMU;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="PHONEUSER")
public class Phoneuser {
    @Id
    private int userid;
    private String useremail;
    private String username;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="USERID")
    private List<Phone> phoneTables;

    public Phoneuser(String useremail, String username, List<Phone> phoneTables) {
        this.useremail = useremail;
        this.username = username;
        this.phoneTables = phoneTables;
    }

    public Phoneuser() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Phone> getPhoneTables() {
        return phoneTables;
    }

    public void setPhoneTables(List<Phone> phoneTables) {
        this.phoneTables = phoneTables;
    }

    @Override
    public String toString() {
        return "Phoneuser{" +
                "userid=" + userid +
                ", useremail='" + useremail + '\'' +
                ", username='" + username + '\'' +
                ", phoneTables=" + phoneTables +
                '}';
    }
}
