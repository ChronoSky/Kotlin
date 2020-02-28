fun main(){
    userInfo("Иванов Иван Иванович" , "менеджер")
    userInfo("Иванов Иван Иванович" , 35 , "менеджер" )
    userInfo("Иванов Иван Иванович" , "менеджер" , "не женат")
    userInfo("Иванов Иван Иванович" , 35 , "менеджер" , "не женат")
}

fun userInfo(FIO: String, position : String){
    println("ФИО : $FIO  " +
            "| Должность : $position")
}

fun userInfo(FIO: String, age: Int , position : String){
    println("ФИО : $FIO  " +
            "| Возвраст : $age " +
            "| Должность : $position")
}

fun userInfo(FIO: String, position : String , familyStatus : String){
    println("ФИО : $FIO  " +
            "| Должность : $position " +
            "| Семейное положение : $familyStatus")
}

fun userInfo(FIO : String, age : Int , position : String , familyStatus : String){
    println("ФИО : $FIO  " +
            "| Возвраст : $age " +
            "| Должность : $position " +
            "| Семейное положение : $familyStatus")
}

