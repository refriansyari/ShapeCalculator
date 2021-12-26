package shape

class Circle(
    private val radius  : Double,
//    private val phi : Double

) : Shape ("Circle") {
    override fun calculateArea(): Double {
        return 3.14 * (radius*radius)
    }

    override fun calculateCircular(): Double {
        return 2 * 3.14 * radius
    }

}