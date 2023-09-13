package com.Project.ProjectBackend.entity;

import javax.persistence.*;

@Entity
@Table(name = "idm")

public class Idm {
    @Id
    @Column(name = "idm_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idmid;

    @Column(name = "idm_name", length = 50)
    private String idmname;


    @Column(name = "idm_email", length = 50)
    private String idmemail;


    @Column(name = "idm_phonenumber", length = 50)
    private String idmphonenumber;


    public Idm(int idmid, String idmname ,String mrcphonenumber, String idmemail) {
        this.idmid = idmid;
        this.idmname = idmname;
        this.idmemail = idmemail;
        this.idmphonenumber = idmphonenumber;


    }
    public Idm() {
    }

    public Idm(String idmname,String idmphonenumber, String idmemail ) {
        this.idmname = idmname;
        this.idmphonenumber = idmphonenumber;
        this.idmemail = idmemail;

    }

    public int getIdmid() {
        return idmid;
    }

    public void setIdmid(int idmid) {
        this.idmid = idmid;
    }

    public String getIdmname() {
        return idmname;
    }

    public void setIdmname(String idmname) {
        this.idmname = idmname;
    }
    public String getIdmemail() {
        return idmemail;
    }

    public void setIdmemail(String idmemail) {
        this.idmemail = idmemail;
    }

    public String getIdmphonenumber() {
        return idmphonenumber;
    }

    public void setIdmphonenumber(String idmphonenumber) {
        this.idmphonenumber = idmphonenumber;
    }




    @Override
    public String toString() {
        return "IdmDTO{" +
                "idmid=" + idmid +
                ", idmname ='" + idmname + '\'' +
                ", idmemail ='" + idmemail + '\'' +
                ", idmphonenumber='" + idmphonenumber + '\'' +


                '}';
    }
}

