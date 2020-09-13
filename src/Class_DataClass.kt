class Admin(name: String, age: Int) {

}

data class User(var name: String, var age: Int)

fun main(args: Array<String>) {

    val u1 = User("Maimoona Al-Rozmi", 25)
    println("Output of Data Class")
    println("Name = ${u1.name}")
    println("Age = ${u1.age}")

    var admin = Admin("Mohammed", 50)
    println("----------------------------------")
    println("Output of  Class")

    println(admin)
}