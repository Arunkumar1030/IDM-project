package com.Project.ProjectBackend.DTO;

public class IdmUpdateDTO {


    private int idmid;
    private String idmname;
    private String idmemail;
    private String idmphonenumber;


    public IdmUpdateDTO(int idmid,String idmname, String idmemail, String idmphonenumber) {
        this.idmid = idmid;
        this.idmname = idmname;
        this.idmemail = idmemail;
        this.idmphonenumber = idmphonenumber;
    }

    public IdmUpdateDTO() {
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
                ", idmname='" + idmname + '\'' +
                ", idmemail='" + idmemail + '\'' +
                ", idmphonenumber='" + idmphonenumber + '\'' +
                '}';
    }
}
