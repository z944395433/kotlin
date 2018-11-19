package com.example.demo

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/*@RunWith(SpringRunner::class)
@SpringBootTest*/
class DemoApplicationTests {

    @Test
    fun contextLoads() {
        println("hello world")
    }

    /**
     * kotlin fun (参数: 类型):返回值类型 {}
     */
    @Test
    fun myFirstKotlin() {
        println(sum(1,2))
    }

    fun main(args: Array<String>){

    }

    fun sum(a: Int,b: Int): Int{
        return a+b
    }

    public fun suma(a: Int,b: Int):Int {
        return a+b
    }

    public fun sumb(a: Int,b: Int):Unit {
        print(a+b)
    }
    /**
     * vararg
     */
    @Test
    fun test1(){
        vars(1,2,3,4)
    }

    fun vars(vararg v: Int){
        for (vt in v){
            print(vt)
        }
    }


    /**
     * 定义了一个还是
     * param是二个int
     * return int
     */
    @Test
    fun test2(){
        //max(strings, { a, b -> a.length < b.length })
        //fun compare(a: String, b: String): Boolean = a.length < b.length
        val sumLambda: (Int, Int) -> Int = {x,y -> x+y}
        println(sumLambda(1,2))  // 输出 3
    }

    @Test
    fun test3(){
        var a = 1
        // 模板中的简单名称：
        val s1 = "a is $a"
        println(s1)
        a = 2
        // 模板中的任意表达式：
        val s2 = "${s1.replace("is", "was")}, but now is $a"
        println(s2)
    }
}
