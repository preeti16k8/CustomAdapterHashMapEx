package com.deepak.customadapterhashmapex;

/**
 * Created by Deepak on 27-Sep-16.
 */
public class Details {
    private String cno, cname, cdur, vkey;

    public Details(String cno, String cname, String cdur, String vkey) {
        this.cno = cno;
        this.cname = cname;
        this.cdur = cdur;
        this.vkey = vkey;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCdur() {
        return cdur;
    }

    public void setCdur(String cdur) {
        this.cdur = cdur;
    }

    public String getvkey() {
        return vkey;
    }

    public void setvkey(String vkey) {
        this.vkey = vkey;
    }
}
