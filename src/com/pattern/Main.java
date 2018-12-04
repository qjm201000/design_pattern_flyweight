package com.pattern;

public class Main {
    public static void main(String[] args) {
        TeacherFactory factory = new TeacherFactory();//创建老师生产类
        Teacher teacher001 = factory.getTeacher("0001");//
        Teacher teacher002 = factory.getTeacher("0002");
        Teacher teacher = factory.getTeacher("0001");
        Teacher teacher004 = factory.getTeacher("0004");

        System.out.println(teacher001.getNumber());
        System.out.println(teacher002.getNumber());
        System.out.println(teacher.getNumber());
        System.out.println(teacher004.getNumber());

        if(teacher001 == teacher){//查看两次对象是否相同
            System.out.println(true);
        }else{
            System.out.println(teacher001);
            System.out.println(teacher);
            System.out.println(false);
        }
    }
}
