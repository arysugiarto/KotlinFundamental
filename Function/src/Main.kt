fun main(){
    val user = setUser("Alfian", 19)
    print(user)

    printUser("Alfian")

}

fun setUser(name:String, age: Int)= "Your name is $name, and $age years old"

fun printUser(name: String){
    println("Your name is $name")
}