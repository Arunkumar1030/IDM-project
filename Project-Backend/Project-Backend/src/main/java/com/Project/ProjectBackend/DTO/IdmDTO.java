package com.Project.ProjectBackend.DTO;

public class IdmDTO {
    private String idmname;
    private String idmemail;
    private String idmphonenumber;

    public IdmDTO(int idmid, String idmname, String idmemail, String idmphonenumber) {
        this.idmname = idmname;
        this.idmemail = idmemail;
        this.idmphonenumber = idmphonenumber;
    }

    public IdmDTO() {
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
                ", idmname='" + idmname + '\'' +
                ", idmemail='" + idmemail + '\'' +
                ", idmphonenumber='" + idmphonenumber + '\'' +
                '}';
    }
}


