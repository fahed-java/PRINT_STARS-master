package com.firstApp;

public class Student {

    //Global Variables
    private int id;

    //Global Variables
    private String name;

    //Global Variables
    private int degree1;

    //Global Variables
    private int degree2;

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

    public int getDegree1() {
        return degree1;
    }

    public void setDegree1(int degree1) {
        this.degree1 = degree1;
    }

    public int getDegree2() {
        return degree2;
    }

    public void setDegree2(int degree2) {
        this.degree2 = degree2;
    }

    //دالة لحساب مجموع العلامات
    public int getSumDegree() {
        return this.degree1 + this.degree2;
    }

    //دالة لحساب نسبة الاختبار العملي
    public double getNesba() {
        return (10 * this.getSumDegree()) / 100;
    }

    //حساب الدرجة النهائية
    public double getFinal() {
        return this.getSumDegree() + this.getNesba();
    }
}
