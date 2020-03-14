package Task_22

abstract class AirCraft {

    // тип воздушного судна
    protected abstract var type: String

    // номер воздушного судна
    protected abstract var num : Int

    // максимальная дальность полета
    protected abstract var airLength : Double

    // объем бака
    protected abstract var tankVolume : Double

    protected val fuelRate : Double
        get() = tankVolume*100/airLength

    open fun print(){
        println("""Тип судна : $type | Номер судна : $num | Максимальная дальность : $airLength |Объем бака : $tankVolume | Расход топлива (на 100 км) : $fuelRate""".trimMargin())
    }
}