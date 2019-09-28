package com.nefu.test01.pojo;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private  int no;
    private  String lass;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getLass() {
        return lass;
    }

    public void setLass(String lass) {
        this.lass = lass;
    }
}
