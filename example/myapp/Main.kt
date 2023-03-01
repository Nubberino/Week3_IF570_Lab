package example.myapp
import example.myapp.Decor.Decoration
import java.lang.Math

fun buildAquarium()
{
    val myAquarium1 = Aquarium(width = 25, length = 25, height = 40)
    myAquarium1.printSize()
    val myTower = Aquarium.TowerTank(diameter = 25, height = 40)
    myTower.printSize()

//
//    val myAquarium2 = Aquarium(width = 3)
//    myAquarium2.printSize()
//
//    val myAquarium3 = Aquarium(height = 4)
//    myAquarium3.printSize()
//
//    val myAquarium4 = Aquarium(length = 21)
//    myAquarium4.printSize()
//
//    val myAquarium5 = Aquarium(Fishes = 21)
//    myAquarium5.printSize()
//
//    val myAquarium6 = Aquarium(length = 25, width = 25, height = 40)
//    myAquarium6.printSize()
//    myAquarium6.volume = 70
//    myAquarium6.printSize()


}

fun main()
{
//    buildAquarium()
    makeFish()
    makedecor()
}

fun makeFish()
{
    val shark = shark()
    val playco = plescositomus()

    println("Shark: ${shark.color}")
    shark.eat()
    println("Plescco: ${playco.color}")
    playco.eat()
}

fun callDeco()
{

}


fun makedecor()
{
    val decoration1 = Decoration("Granite")
    println(decoration1)
    val decoration2 = Decoration("Slate")
    println(decoration2)
    val decoration3 = Decoration("slate")
    println(decoration3)

    println (decoration3.equals(decoration1))
    println (decoration2.equals(decoration3))
}