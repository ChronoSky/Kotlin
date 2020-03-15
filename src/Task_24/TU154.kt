package Task_24

class TU154 (num: Int, airLength: Double, tankVolume: Double): AirCraft(), Passenger {

    override val seats: Int = 210

    override var type: String
        get() =  "ТУ-154"
        set(value) {}

    override var num: Int = num

    override var airLength: Double = airLength

    override var tankVolume: Double = tankVolume

    override fun print(){
        println("""Тип судна : $type |Номер судна : $num |Максимальная дальность : $airLength |Объем бака : $tankVolume | Расход топлива (на 100 км) : $fuelRate | Количество мест : $seats """.trimMargin())
    }
}