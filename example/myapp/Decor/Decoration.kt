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