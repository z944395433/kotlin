package com.example.demo

import org.apache.commons.lang3.StringUtils
import org.codehaus.jackson.JsonNode
import org.codehaus.jackson.map.ObjectMapper
import org.json.JSONObject
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import reactor.core.publisher.toMono
import kotlin.concurrent.thread
import org.springframework.test.context.transaction.TestTransaction.start
import java.io.File
import java.util.*
import kotlin.collections.ArrayList


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
//        var a = 1
//        // 模板中的简单名称：
//        val s1 = "a is $a"
//        println(s1)
//        a = 2
//        // 模板中的任意表达式：
//        val s2 = "${s1.replace("is", "was")}, but now is $a"
//        println(s2)

        var b: String? = "abc"
        b= null
        val l = b?.length ?: -1
        b?.let {
            println("${b.length}")
        }?:let {
            println()
        }
    }

    /*@Test
    fun test4(){

            for ( i in 1..3){
                for (j in 1..2){
                    p
                }
            }
    }*/
    @Test
    fun testt():Unit{
       /* mutableListOf<String>().apply {
            this.add("123")
            this.add("321")
        }.filterIndexed{i,x ->
            x == "123"
        }.map {
            it == "321"
        }*/
       StringUtils.join(listOf<String>("123","321","520"),"*").apply {
           println(this)
    }
    }
    @Test
    fun hhhhh() {
        /*ArrayList<String>().apply {
            this.add("123")
        }.map {
            "AAA" to it
       }.toMap().toMutableMap().apply {
           print(this)
       }

        mutableMapOf<String,Any>("123" to "123").apply {
            println(this)
        }*/

        /**
         *把数组中对象转化列子
         */


        var str : String = """[{"A":"1","B":"2"},{"C":"3","D":"4"}]"""
        ObjectMapper().let {
            it.readTree(str).map {

                (Math.random()*100).toString() to it
            }.toMap().toMutableMap().apply {
                println(this)
            }
        }


        /* mutableMapOf<String,Any>().app {
               ObjectMapper().let {ob->
                   ob.readTree(str).forEach {json->
                       println(Math.random()*100)
                       it[(Math.random()*100).toString()] to json
                   }
               }
           }*/


       }


    @Test
    fun testMap() = listOf(1, 2, 3, 4, 5, 6).map {
        it
    }.let {
        println(it)
        it
    }.flatMap { i ->
        mutableListOf<String>("1")
    }.let {
        println(it)
    }

//@Test
//fun testmap() =
//        mutableListOf<String>("name:123","123","erw").map {
//    (Math.random()*100) to it
//}.toMap().apply {
//    println(this)
//}.toMutableMap().let {
//    println(it)
//    ObjectMapper().readTree(File("E:\\json.txt")).map {
//        println(it)
//    }.let {
//
//    }
//}

//@Test
//fun yys() = ObjectMapper().readTree("""{"name":"yys","age":"18"}""").let {
//   // println(it["name"])
//    it["name"] to "man"
//}.









}
