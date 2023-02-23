package example.myapp

import kotlin.math.PI

open class Aquarium(open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {
    init{
        println("Aquarium, Innit?")
    }

   open var volume: Int
        get() = width * height * length/ 1000
        /* private */ set(value)
        {
            height = (value * 1000) / (width*length)
        }

    open val shape = "Recktangle"
    open var water: Double = 0.0
        get() = volume * 0.89

    fun printSize()
    {
        println(shape)
        println("Witdh = $width cm " + "lenth = $length cm " + "hight = $height cm")
        println("Volume = $volume litres   water: $water litres (${water/volume * 100.0}% filled)")
    }

    constructor(Fishes: Int) : this()
    {
        val tank = Fishes * 2000 * 1.1

        height = (tank/ (length * width)).toInt()
    }


    class TowerTank(override var height: Int, var diameter: Int):Aquarium(height = height, width = diameter, length = diameter)
    {
        override var volume: Int
            get() = (width/2 * length/2 * height/1000 * PI).toInt()
            set(value)
            {
                height = ((value *1000 / PI) / (width/2 * length/2)).toInt()
            }
        override var water = volume * 0.77
        override val shape = "Circular"

    }
}

