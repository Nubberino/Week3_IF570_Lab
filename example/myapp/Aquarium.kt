package example.myapp

class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
    init{
        println("Aquarium, Innit?")
    }



    var width: Int = length;
    var length: Int = width;
    var height: Int = height;
    var volume: Int
        get() = width * height * length/ 1000
        /* private */ set(value)
        {
            height = (value * 1000) / (width*length)
        }
    fun printSize()
    {
        println("Witdh = $width cm " + "lenth = $length cm " + "hight = $height cm")
        println("Volume = $volume litres")
    }

    constructor(Fishes: Int) : this()
    {
        val tank = Fishes * 2000 * 1.1

        height = (tank/ (length * width)).toInt()
    }
}

