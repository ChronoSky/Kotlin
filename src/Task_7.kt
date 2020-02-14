fun main() {

    var mark: Int = 0
    var answer : String?

    println("Предлагаю пройти тест на знание Астраномии.")
    println("В качестве ответа на вопрос укажите вариант ответа и нажмите Enter.")
    println("Вопрос 1 : Радиус планеты Земля ~6371 км")
    println("1. Верно")
    println("2. Не верно")
    answer = readLine()!!
    if (answer.toInt()==1) {mark += 1}

    println()
    println("Вопрос 2 : Земля это 4 планета от Солнца")
    println("1. Верно")
    println("2. Не верно")
    answer = readLine()!!
    if (answer.toInt()==2) {mark += 1}

    println()
    println("Вопрос 3 : В нашей солничной системе 8 планет")
    println("1. Верно")
    println("2. Не верно")
    answer = readLine()!!
    if (answer.toInt()==1) {mark += 1}

    println()
    println("Вопрос 4 : Сатурн ближе к солнцу чем Юпитер")
    println("1. Верно")
    println("2. Не верно")
    answer = readLine()!!
    if (answer.toInt()==2) {mark += 1}

    println()
    println("Вопрос 5 : Луна спутник планеты Земля")
    println("1. Верно")
    println("2. Не верно")
    answer = readLine()!!
    if (answer.toInt()==1) {mark += 1}

    println()
    println()
    print("Результат : ")
    when(mark){

        0,1 -> println("IQ = 0")

        2 -> println("Второе место с конца тоже не плохо")

        3 -> println("3 из 5. Я ожидал от тебя большего")

        4 -> println("Хорошо")

        5 -> println("Ты круче чем Чак Норис")

        else -> println("неопределенное значение")

    }

}