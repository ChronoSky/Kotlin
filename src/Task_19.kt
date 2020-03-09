fun main(){
    var b1 = Boing747(777, 6000.0, 48600.0)
    println(b1.fuelRate)
    println(b1.seats)
}

open class AirCraft3(num : Int, airLength : Double, tankVolume : Double){

    // номер судна
    open var num : Int = num

    // максимальная дальность полета
    open var airLength : Double = airLength

    // объем бака
    open val tankVolume : Double = tankVolume

    // расход топлива на 100 км
    open val fuelRate : Double
        get() = tankVolume*100/airLength

}

class Boing747(num : Int, airLength : Double, tankVolume : Double) :  AirCraft3(num , airLength , tankVolume ){

    var seats: Int = 386

}
