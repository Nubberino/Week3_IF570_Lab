package example.myapp

fun buildAquarium()
{
    val myAquarium1 = Aquarium()
    myAquarium1.printSize()

    val myAquarium2 = Aquarium(width = 3)
    myAquarium2.printSize()

    val myAquarium3 = Aquarium(height = 4)
    myAquarium3.printSize()

    val myAquarium4 = Aquarium(length = 21)
    myAquarium4.printSize()

    val myAquarium5 = Aquarium(Fishes = 21)
    myAquarium5.printSize()

    val myAquarium6 = Aquarium(Fishes = 29)
    myAquarium6.printSize()
    myAquarium6.volume = 70
    myAquarium6.printSize()

}

fun main()
{
    buildAquarium()
}
