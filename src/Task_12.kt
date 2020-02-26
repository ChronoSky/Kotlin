fun main(args: Array<String>) {
    println(IsHighGradeYear(2019))
    println(IsHighGradeYear(2020))
    println(IsHighGradeYear(2000))
    println(IsHighGradeYear(3000))
    println(IsHighGradeYear(4000))
}
fun IsHighGradeYear(year: Int) : String{

    if (year%100==0 && year %400 ==0){
        return "Год $year - высокосный";
    }else if (year % 4 == 0 && year % 100 > 0){
        return "Год $year - высокосный";
    }else if (year % 100 == 0) {
        return "Год $year - не высокосный";
    }else {
        return "Год $year - не высокосный";
    }
}