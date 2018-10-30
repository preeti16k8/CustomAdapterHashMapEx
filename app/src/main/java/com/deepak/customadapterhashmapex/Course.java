package com.deepak.customadapterhashmapex;

/**
 * Created by Deepak on 27-Sep-16.
 */
public class Course {
    String cname, cdur, cass, ctest;

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

    public String getCass() {
        return cass;
    }

    public void setCass(String cass) {
        this.cass = cass;
    }

    public String getCtest() {
        return ctest;
    }

    public void setCtest(String ctest) {
        this.ctest = ctest;
    }

    public Course(String cname, String cdur, String cass, String ctest) {

        this.cname = cname;
        this.cdur = cdur;
        this.cass = cass;
        this.ctest = ctest;
    }
}
