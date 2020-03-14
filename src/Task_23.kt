fun main(args: Array<String>){

    var car_1 : Car = Car("VW" , "Blue", "а001бв177")
    println(car_1.toString())
}

data class Car(var mark: String , var color : String , var num : String){

    override fun toString(): String {
        return "Марка = $mark , Цвет = $color, Номер = $num"
    }
}

