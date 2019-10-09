data class SomeThing(var property: String)

fun main() {
    stringSplitting()
}

fun stringSplitting() {
    val stuff = "Hello, goodbyte, 'shallome',           what     ,hi,asdf"

    stuff.split(",").forEach {
        println(it.trim())
    }
}

fun objectsInContainers() {
    val thing1 = SomeThing("thing1")
    val thing2 = SomeThing("thing2")
    val thing3 = SomeThing("thing3")

    println("Before: ${thing1.property}")

    val thingList = mutableListOf(
        thing1, thing2, thing3
    )

    val thingMap = mutableMapOf(
        "1" to thing1,
        "2" to thing2,
        "3" to thing3
    )

    thingList.forEach { thing ->
        if(thing.property == "thing1") {
            thing.property = "New thing1"
        }
    }

    println("After, in list: ${thing1.property}")

    println("After, in map: ${thingMap.get("1")!!.property}")
}
