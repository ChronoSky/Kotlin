package Task_24


fun main(args: Array<String>){

    // создание авиакомпании
    var airList : MutableList<AirCraft> = mutableListOf()
    // тип - Boing747
    airList.add(Boing747(1, 6000.0, 48600.0))
    // тип - АН-12
    airList.add(AN12(2, 5530.0, 24000.0))
    // тип - ТУ-154
    airList.add(TU154(3, 5100.0, 39000.0))

    // интерфейс пользоватлея
    println("Вы запустили программу 'Авиа'")
    var info : String = """Список доступных действий : 
    |1 - Найти самолет(ы) по номеру и вывести его характеристики на экран
    |2 - Вывести список самолетов (марки) в авиа-парке
    |3 - Вывести на экран информаци по количеству мест в самомлете (требуется указать марку самолета)
    |4 - Вывести на экран информаци по грузоподъемности самомлета (требуется указать марку самолета)    
    |0 - Выход из программы    
    |
    |Введите номер действия и нажмите Enter""".trimMargin()

    var exit : Boolean = false
    var action : String?
    do{
        println(info)
        action = readLine()!!
        if (action.isNullOrEmpty()) continue
        when(action){

            "1" -> {

                var airNum : Int? = null
                var exist: Boolean = false
                do{
                    println("Введите номер самолета для поиска и нажмите Enter.")
                    airNum = readLine()!!.toInt()?:0
                }while(airNum==0)

                for (air in airList){
                    if (air.num==airNum) {
                        println("Самолет с номером $airNum найден")
                        println("Информация о самолете :")
                        println(air.print())
                        exist = true
                        break
                    }
                }
                if (!exist){
                    println("Самолет с номером $airNum не найден")
                }
                println()

            }


            "2" -> {
                println("Список самолетов (марки) авиа-парка :")
                for (air in airList){
                    println(air.type)
                }
                println()
            }

            "3" -> {
                var airType : String?
                var exist: Boolean = false
                do{
                    println("Введите тип самолета для получения информации по кол-ву мест и нажмите Enter.")
                    airType = readLine()!!
                }while(airType.isNullOrEmpty())
                for (air in airList){
                    if (air.type==airType){
                        var _air : Passenger = air
                        var seats : Int = _air.seats
                        println("У самолета типа $airType имеется $seats")
                        exist = true
                        break
                    }
                }
                if (!exist){
                    println("Самолет с типом '$airType' не найден")
                }
                println()
            }

            "4" -> {
                var airType : String?
                var exist: Boolean = false
                do{
                    println("Введите тип самолета для получения информации по грузоподъемности и нажмите Enter.")
                    airType = readLine()!!
                }while(airType.isNullOrEmpty())
                for (air in airList){
                    if (air.type==airType){
                        if (air is AN12){
                            var _air : Cargo = air
                            var carrying : Int  = _air.carrying
                            println("У самолета типа $airType имеется $carrying кг грузоподъемности")
                        } else {
                            println("Cамолет типа $airType не перевозит грузы")
                        }
                        exist = true
                        break
                    }
                }
                if (!exist){
                    println("Самолет с типом '$airType' не найден")
                }
                println()
            }

            "0" -> {
                println("Выход из программы")
                exit = true
            }


        }

    }
    while(!exit)
    

}



