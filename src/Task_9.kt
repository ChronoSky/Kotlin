fun main(args: Array<String>) {

    var table : Array<Array<String>> = Array(3) { Array(3){""} }

    table[0] = arrayOf("Россия", "США", "Китай")
    table[1] = arrayOf( "Пекин", "Москва", "Вашингтон")
    table[2] = arrayOf("Доллары", "Рубли",  "Юань")

    var rusInfo : String = table[0][0] + " " + table[1][1] + " " + table[2][1]
    var usaInfo : String =  table[0][1] + " " + table[1][2] + " " + table[2][0]
    var chinaInfo : String =  table[0][2] + " " + table[1][0] + " " + table[2][2]

    println(rusInfo)
    println(usaInfo)
    println(chinaInfo)

}