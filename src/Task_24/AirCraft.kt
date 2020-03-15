package Task_24

abstract class AirCraft : Passenger, Cargo {

    // тип воздушного судна
    internal abstract var type: String

    // номер воздушного судна
    internal abstract var num : Int

    // максимальная дальность полета
    internal abstract var airLength : Double

    // объем бака
    internal abstract var tankVolume : Double

    internal val fuelRate : Double
        get() = tankVolume*100/airLength

    open fun print(){
        println("""Тип судна : $type | Номер судна : $num | Максимальная дальность : $airLength |Объем бака : $tankVolume | Расход топлива (на 100 км) : $fuelRate""".trimMargin())
    }
}