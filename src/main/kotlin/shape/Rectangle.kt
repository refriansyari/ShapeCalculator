package shape

class Rectangle(                    //Implement = alt+enter - implement
    private val length: Double,
    private val width: Double

) : Shape("Rectangle") {            //Tips: Alt+Enter
    override fun calculateArea(): Double {
        return length * width
    }

    override fun calculateCircular(): Double {
        return 2 * (length + width)
    }
}