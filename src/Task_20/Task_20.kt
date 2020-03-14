package Task_20

fun main(){
    var b1 = Boing747(777, 6000.0, 48600.0)
    println(b1.fuelRate)
    println(b1.seats)
}

open class AirCraft(num : Int, airLength : Double, tankVolume : Double){

    // номер судна
    var num : Int = num

    // максимальная дальность полета
    var airLength : Double = airLength

    // объем бака
    val tankVolume : Double = tankVolume

    // расход топлива на 100 км
    val fuelRate : Double
        get() = tankVolume*100/airLength

}

class Boing747(num : Int, airLength : Double, tankVolume : Double ) :  AirCraft(num , airLength , tankVolume ), Passenger{

    override val seats: Int = 386

}
