package com.lsh

fun main(args: Array<String>) {
    println("hello world")
    println(sum(3, 5))
    printSum(3, 5)
    vars(1, 2, 3, 4, 5)
    val sumLambda:(Int,Int)->Int={x,y->x+y}
    println(sumLambda(1,2))

}

fun sum(a: Int, b: Int): Int {  //Int参数，返回值Int
    return a + b
}

//无返回值的函数
fun printSum(a: Int, b: Int): Unit {
    println(a + b)
}

//可变长参数函数
fun vars(vararg v: Int) {
    for (vt in v) {
        println(vt)
    }
}






