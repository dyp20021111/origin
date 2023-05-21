package com.itheima.pojo;

public class c_course {
    private  int id;
    private  String  name;
    private  int hours;
    private  int schools;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSchools() {
        return schools;
    }

    public void setSchools(int schools) {
        this.schools = schools;
    }

    @Override
    public String toString() {
        return "c_course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hours=" + hours +
                ", schools=" + schools +
                '}';
    }

    public c_course(int id, String name, int hours, int schools) {
        this.id = id;
        this.name = name;
        this.hours = hours;
        this.schools = schools;
    }

    public c_course() {
    }
}
