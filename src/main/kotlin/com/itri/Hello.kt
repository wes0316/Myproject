package com.itri

    fun main(args:Array<String>)
    {
       //println("Hello Kt")
       // Human().hello();
        val h = Human(weight = 66.5f, height = 1.7f)
        h.hello()
        println(h.bmi())
    }

class  Human(var weight:Float,var height:Float,var name:String="") {

    init {
        println("test$weight")
    }

    /*次要建構子*/
//    constructor(name:String,weight: Float,height: Float):this(weight,height);

    fun bmi():Float {

        var bmi = weight / (height*height)
        return  bmi
    }
    fun hello(){

        println("Hello Human")

    }
}