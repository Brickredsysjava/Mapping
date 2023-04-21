package org.example.OtMU;







import javax.persistence.*;

@Entity
@Table(name = "PHONE")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int phoneid;
    private String phonetype;
    private long phoneno;
    private int userid;

    public Phone( String phonetype, long phoneno, int userid) {
        this.phonetype = phonetype;
        this.phoneno = phoneno;
        this.userid = userid;
    }

    public Phone() {
    }

    public int getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(int phoneid) {
        this.phoneid = phoneid;
    }

    public String getPhonetype() {
        return phonetype;
    }

    public void setPhonetype(String phonetype) {
        this.phonetype = phonetype;
    }

    public long getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneid=" + phoneid +
                ", phonetype='" + phonetype + '\'' +
                ", phoneno=" + phoneno +
                ", userid=" + userid +
                '}';
    }
}
