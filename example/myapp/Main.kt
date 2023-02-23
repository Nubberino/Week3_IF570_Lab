package example.myapp

fun buildAquarium()
{
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 21
    myAquarium.printSize()
}

fun main()
{
    buildAquarium()
}
