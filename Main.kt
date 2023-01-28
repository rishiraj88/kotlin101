val name: String = "Rishi Raj"
//val nameNullable: String? =null
var greeting: String? =null
fun main() {
    if(null != greeting) {
        print(greeting)
        println(name)} else {
        greeting = "Hello, "
        print(greeting)
        println(name)
    }
}