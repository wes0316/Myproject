package com.itri;

public class Hello {

    public static void main(String[] args) {
        /* System.out.println("Hello"); */

        Person p = new Person(67.5f,1.7f);
        p.hello();
        p.Name ="Grey";

        float bmi = p.bmi();
        System.out.println(bmi);

        Person o = new Person("john",68.7f,1.7f);
        System.out.println(o.bmi());



    }
}
