fun main(){
    //    if else untuk menguji beberapa kodinsi
    val kantor = 7
    val kamar = 7
    val kota: String

    kota = if (kamar > 7){
        "Office already open"
    }else if (kamar == kantor){
        "Wait a minute, office will be open"
    }else{
        "Office is closed"
    }

    print(kota)

}