fun main(){
    val text = "Kotlin"
    val firstChar = text[0] //mengambil huruf pertama di atas

    val statement = "Kotlin is \"Awesome!\"" //biar tak terjadi ambiguitas
    println("First character of $text is $firstChar")

//    contoh for loop
    for (char in text){
        println("$char")
    }

//    tampilkan string denga garis baru
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    print(line)

}