fun main() {
    var workers : Map<Int, String> = mapOf(1 to "Иванов Иван Иванович", 2 to "Петров Петр Петрович", 3 to "Путин Владимир Владимирович")

    var text : String?
    do {
        println("Укажите номер рабочего места и нажмите Enter. Для выхода из программы введите 'exit'")
        text = readLine()

        // для выхода из программы
        if (text=="exit") break

        // проверка на пустое значение
        if (text.isNullOrEmpty()) continue

        var place : Int = text.toInt()

        if (workers.containsKey(place)){
            println("Рабочее место №$place занимает сотрудник - " + workers[place])
            println()
        }else{
            println("Номера рабочего места $place не существует. Укажите другой номер или введите 'exit' для выхода из программы")
        }

    } while(true)

}