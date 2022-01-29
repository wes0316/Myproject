package com.itri;

public class Person {

    String Name;
    float weight;
    float height;

    //建構子
    public Person(float weight,float height)
    {

        this.weight= weight;
        this.height =height;
    }

    public Person(String name,float weight,float height)
    {
        /*      this(weight, height); 呼叫其它建構子一定要在第一行做*/
        this(weight, height);
        this.Name= name;
/*
//        this.weight= weight;
//        this.height =height;
*/

    }
    public float bmi(){

        float bmi = weight/(height*height);
        return  bmi;
    }
    public void  hello(){
        System.out.println("Hello java11");
    }
}
