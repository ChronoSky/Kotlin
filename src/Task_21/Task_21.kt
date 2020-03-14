package Task_21

fun main(args: Array<String>){
    var b1 : Boing747 = Boing747(737, 6000.0, 48600.0)
    println(b1.type)
    println(b1.seats)


}

abstract class AirCraft {
    // тип воздушного судна
    abstract var type: String

    // номер воздушного судна
    abstract var num : Int

    // максимальная дальность полета
    abstract var airLength : Double

    // объем бака
    abstract var tankVolume : Double

    val fuelRate : Double
        get() = tankVolume*100/airLength
}

class Boing747(num : Int, airLength : Double, tankVolume : Double ): AirCraft(),  Passenger{

    override val seats: Int = 386

    override var type: String
        get() =  "Boing747"
        set(value) {}

    override var num: Int
        get() = num
        set(value) {}

    override var airLength: Double
        get() = airLength
        set(value) {}

    override var tankVolume: Double
        get() = tankVolume
        set(value) {}

}

