import kotlin.text.*;
fun main(){
    print("Hello ")
    print("world!")
    println("Hello world!")
    println(42)

}
fun sum(a:Int, b:Int): Int{
    return a + b
}

fun main(args: Array<String>){
    println(args.contentToString())
    println(sum(2,3))
}
