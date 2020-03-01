fun main(){
    val array : Array<String> = arrayOf("Иван", "Петр", "Василий")
    val myPrint = {arr:Array<String> ->
                    for(name in arr){println(name)}
                 }
    myPrint(array)
}