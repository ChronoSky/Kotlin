package Task_22

fun main(args: Array<String>){

    var b1 : Boing747 = Boing747(737, 6000.0, 48600.0, 0)
    b1.print()

}

class Boing747(num: Int, airLength: Double, tankVolume: Double, num1: Int): AirCraft(), Passenger {

    override val seats: Int = 386

    protected override var type: String
        get() =  "Boing747"
        set(value) {}

    protected override var num: Int = num

    protected override var airLength: Double = airLength

    protected override var tankVolume: Double = tankVolume

    override fun print(){
        println("""Тип судна : $type |Номер судна : $num |Максимальная дальность : $airLength |Объем бака : $tankVolume | Расход топлива (на 100 км) : $fuelRate | Количество мест : $seats """.trimMargin())
    }
}


