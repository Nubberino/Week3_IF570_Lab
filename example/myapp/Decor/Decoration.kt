package example.myapp.Decor

data class Decoration(val rocks: String) {

}

data class Decoration2(val Rocks: String, val wood:String, val diver: String)
{

}

fun makeDecorations()
{
    val d5 = Decoration2("Crystal", "Wood", "Griver")
    println(d5)

    val(rock,wood,diver) = d5
    println(rock)
    println(wood)
    println(diver)
}

enum class Color (val rgb: Int)
{
    RED(0xff0000),GREEN(0x00ff00),BLUE(0x000ff)
}

enum class Direction (val degrees: Int)
{
    NORTH(0),SOUTH(180),EAST(90),WEST(270)
}


class Choice
{
    companion object
    {
        var name: String = "Liric"
        fun showDescription(name: String) = println("My favorite $name")
    }
}

fun main()
{
    println(Choice.name)
    Choice.showDescription("pick")
    Choice.showDescription("selection")
}