#kotlin 高级函数 let apply run also

#run
###函数定义：
###````````
public inline fun <R> run(block: () -> R): R = block()
###```````
示例：

val a = run {
    println("run")
    return@run 3
}
println(a)
运行结果：

run
3
#######
#apply
 函数定义：
 
 public inline fun <T> T.apply(block: T.() -> Unit): T { block(); return this }
 功能：调用某对象的apply函数，在函数块内可以通过 this 指代该对象。返回值为该对象自己。
 
 示例：
 
 val a = "string".apply {
     println(this)
 }
 println(a)
 运行结果：
 
 string
 string
 #########
 ###let
 函数定义：
 
 public inline fun <T, R> T.let(block: (T) -> R): R = block(this)
 功能：调用某对象的let函数，则该对象为函数的参数。在函数块内可以通过 it 指代该对象。返回值为函数块的最后一行或指定return表达式。
 
 示例：
 
 val a = "string".let {
     println(it)
     3
 }
 println(a)
 运行结果：
 
 string
 3
 ######
 ###also
 函数定义（Kotlin1.1新增的）：
 
 public inline fun <T> T.also(block: (T) -> Unit): T { block(this); return this }
 功能：调用某对象的also函数，则该对象为函数的参数。在函数块内可以通过 it 指代该对象。返回值为该对象自己。
 
 示例：
 
 val a = "string".also {
     println(it)
 }
 println(a)
 运行结果：
 
 string
 string
 jdfdfgh
 12312313
 