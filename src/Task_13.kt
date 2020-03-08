fun main(args:Array<String>){
    var array: Array<String> = arrayOf("Иван", "Николай" , "Иван", "Петр" , "Максим")
    count(*array)

}
fun count(vararg users: String)  {
    val mapUserNames : MutableMap<String, Int> = mutableMapOf()

    for (user in users){
        if (mapUserNames.containsKey(user)){
            var curCount = mapUserNames.getValue(user)
            mapUserNames.put(user, curCount+1)
        }else {
            mapUserNames.put(user, 1)
        }
    }

    for (user in mapUserNames){
        println(user.key +" - " + user.value)
    }
}