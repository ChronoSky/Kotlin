fun main(args: Array<String>) {

    val air_1 = AirCraft2(737, 3000.0, 48600.0)
    println(air_1.fuelRate)

    val air_2 = AirCraft2(777, 6000.0, 48600.0)
    println(air_2.fuelRate)
}

class AirCraft2(num : Int, airLength : Double, tankVolume : Double){

    // номер судна
    var num : Int = num

    // максимальная дальность полета
    var airLength : Double = airLength

    // объем бака
    private val tankVolume : Double = tankVolume

    // расход топлива на 100 км
    val fuelRate : Double
        get() = tankVolume*100/airLength

}