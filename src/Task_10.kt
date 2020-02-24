fun main() {

    println("Вы запустили программу 'Города'")
    var info : String = """Список доступных действий : 
    |1 - Добавить город в программу
    |2 - Вывести список городов на экран
    |3 - Вывести список городов на экран (без дублей)    
    |4 - Выход из программы    
    |
    |Введите номер действия и нажмите Enter""".trimMargin()

    var cityList : ArrayList<String> = arrayListOf()
    /*
    cityList.add("Москва")
    cityList.add("Тюмень")
    cityList.add("Москва")
    cityList.add("Томск")
    cityList.add("Тюмень")
     */
    var exit : Boolean = false
    var action : String?
    do{
        println(info)
        action = readLine()!!
        if (action.isNullOrEmpty()) continue
        when(action){

            "1" -> {var add : Boolean = false
                    var sityName : String?
                    do{
                        println("Введите название города , которое необходимо сохранить и нажмите Enter :")
                        sityName = readLine()!!
                    }while(sityName.isNullOrEmpty())
                    cityList.add(sityName.toString())
                    println("Добавлен город : $sityName")
                    println()
            }


            "2" -> {
                    println("Список добавленных городов :")
                    for (cityName in cityList){
                        println(cityName)
                    }
                    println()
                }

            "3" -> {
                    println("Список добавленных городов (без дублей):")
                    var sitySet : MutableSet<String> = mutableSetOf()
                    for (cityName in cityList){
                        sitySet.add(cityName)
                    }
                    for (cityName in sitySet){
                        println(cityName)
                    }
                    println()
                }

            "4" -> {println("Выход из программы")
                  exit = true}




        }

    }
    while(!exit)




}