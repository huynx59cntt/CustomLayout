package vn.edu.ntu.tuananh.model;

import java.util.Date;

public class ListCustom {
    String name, ngaySinh,sdt;

    public ListCustom() {
    }

    public ListCustom(String name, String ngaySinh, String sdt) {
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
