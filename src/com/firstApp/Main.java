package com.firstApp;

public class Main {

    public static void main(String[] args) {

        Student mohamed = new Student();
        mohamed.setName("محمد");
        mohamed.setDegree1(25);
        mohamed.setDegree2(15);
        System.out.println("درجات الطالب / " + mohamed.getName());
        System.out.println("مجموع الدرجات = " + mohamed.getSumDegree());
        System.out.println("نسبة الاختبار العملي = " + mohamed.getNesba());
        System.out.println("الدرجة النهائية = " + mohamed.getFinal());
        System.out.println("/////////////////////////////////////////////");

        Student omar = new Student();
        omar.setName("عمر");
        omar.setDegree1(5);
        omar.setDegree2(20);
        System.out.println("درجات الطالب / " + omar.getName());
        System.out.println("مجموع الدرجات = " + omar.getNesba());
        System.out.println("نسبة الاختبار العملي = " + omar.getSumDegree());
        System.out.println("الدرجة النهائية = " + omar.getFinal());
        System.out.println("/////////////////////////////////////////////");

        Student ali = new Student();
        ali.setName("علي");
        ali.setDegree1(20);
        ali.setDegree2(20);
        System.out.println("درجات الطالب / " + ali.getName());
        System.out.println("مجموع الدرجات = " + ali.getNesba());
        System.out.println("نسبة الاختبار العملي = " + ali.getSumDegree());
        System.out.println("الدرجة النهائية = " + ali.getFinal());
        System.out.println("/////////////////////////////////////////////");

        Student othman = new Student();
        othman.setName("عثمان");
        othman.setDegree1(16);
        othman.setDegree2(10);
        System.out.println("درجات الطالب / " + othman.getName());
        System.out.println("مجموع الدرجات = " + othman.getSumDegree());
        System.out.println("نسبة الاختبار العملي = " + othman.getNesba());
        System.out.println("الدرجة النهائية = " + othman.getFinal());


    }
}
