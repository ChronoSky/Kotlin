package Task_24

class AN12 (num: Int, airLength: Double, tankVolume: Double): AirCraft(), Cargo, Passenger {

    override val seats: Int = 90

    override val carrying: Int = 21000

    override var type: String
        get() =  "АН-12"
        set(value) {}

    override var num: Int = num

    override var airLength: Double = airLength

    override var tankVolume: Double = tankVolume

    override fun print(){
        println("""Тип судна : $type |Номер судна : $num |Максимальная дальность : $airLength |Объем бака : $tankVolume | Расход топлива (на 100 км) : $fuelRate | Грузоподъемность : $carrying """.trimMargin())
    }
}