package example.myapp

abstract class AquariumFish
{
    abstract val color: String
}
interface fishAction
{
    fun eat()
}
interface fishColor
{
    val color:String
}


class shark: AquariumFish(), fishAction,fishColor
{
    override val color = "grey"
    override fun eat()
    {
        println("FishHunting")
    }
}

class plescositomus(fishcolor: fishColor = Golde):fishAction by printingFishaction("Im Vegan"),fishColor by Golde
{

}


object Golde: fishColor
{
    override val color = "gold"

}


class printingFishaction(val food: String) : fishAction
{
    override fun eat()
    {
        println(food)
    }
}


