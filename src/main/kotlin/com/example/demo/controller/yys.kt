package com.example.demo.controller

import java.lang.Thread.sleep
import java.util.*

class yys : man {
    override fun sleep() {
        println("睡觉")
    }

}
class hh{
    fun test(){
        /*无参*/
        Thread(Runnable { sleep(3) }).start()
        listOf<String>("1","2")

    }
}

    fun main(args: Array<String>){
//        var a =yys()
//        println(a.sleep())
//        println(a.eat())
//        listOf<Int>(1,2,3).map {
//            it.compareTo(1) > 1
//        }
        //val a : (b:Int,c:Int) -> Int run { b, c -> b + c }
        //源码
//        fun add(a:Int, b:Int):Int{
//            return a+b
//        }
//        //lambda
//        val test : (Int , Int) -> Int = {a , b -> a + b}
//        //方法2
//        val test2 = {a : Int , b : Int -> a + b}
//
//        println(test2(5,{it>5}))
//
//
//        val map = mapOf("key1" to "value1","key2" to "value2","key3" to "value3")
//
//        map.forEach{
//            key , value -> println("$key \t $value")
//        }


//       print(t(5,{it>1}))

        Scanner(System.`in`).let {
            print("输入你想说的话")
            while (true){
                it.nextLine().apply {
                    this.replace("吗？","!").let {
                        println(it)
                    }

                }

            }
        }

    }

fun test(num1 : Int, bool : (Int) -> Boolean) : Int{
    return if (bool(num1)){ num1 } else 0
}

    fun test2 (a:Int,bool : (Int) -> Boolean) : Int{
        return if (bool(a)){ a } else 0
}


fun tets3(){
    /*列子*/
    val test = {a : Int , b : Int -> a + b}
    /*考试*/

}
fun t(a:Int,b: (Int) -> Boolean): Int {
    return if (b(a)) {a}
    else 0
}

