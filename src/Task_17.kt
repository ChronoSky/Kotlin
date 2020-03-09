fun main(args: Array<String>) {

    val air = AirCraft()
    println(air.fuelRate)

}

class AirCraft {

    // номер судна
    var num : Int = 737

    // максимальная дальность полета
    var airLength : Double = 3000.0

    // объем бака
    private val tankVolume : Double = 46200.0

    // расход топлива на 100 км
    val fuelRate : Double
        get() = tankVolume*100/airLength

}

