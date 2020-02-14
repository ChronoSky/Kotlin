fun main() {

    println("Введите сумму вклада")
    var rl = readLine()!!
    var sum : Double = rl.toDouble()
    println()

    println("Введите длительность вклада (кол-во месяцев)")
    rl = readLine()!!
    var len : Int = rl.toInt()
    println()

    println("Введите ежемесячный процент по вкладу")
    rl = readLine()!!
    var proc : Double = rl.toDouble()
    println()

    var i = 0
    var res : Double

    while (i!=len){
        i++
        res = sum*proc/100
        sum += res
        println("$i месяц. Вкладу увеличился на $res. Общая сумма : $sum")
    }

}