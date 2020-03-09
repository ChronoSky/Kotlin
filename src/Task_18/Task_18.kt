package Task_18

fun main(args: Array<String>) {

    val air_1 = AirCraft(737, 3000.0, 48600.0)
    println(air_1.fuelRate)

    val air_2 = AirCraft(777, 6000.0, 48600.0)
    println(air_2.fuelRate)
}

private class AirCraft(num : Int, airLength : Double, tankVolume : Double){

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