package com.itri.student

fun main(args: Array<String>) {

    val stu = Student_kt("Luna",80,70);
    stu.print();

}

class Student_kt(var name:String,var english:Int,var math:Int) {

    fun print(){

        println(name+"\t"+english+"\t"+math+"\t"+(english+math)/2)
    }
}