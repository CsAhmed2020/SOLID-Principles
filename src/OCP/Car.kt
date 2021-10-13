package OCP

class BMW {
    private val basePrice = 500000
    private val tax = 10000.0
    fun getPrice(): Double {
        return basePrice + tax
    }
}
class Audi {
    private val basePrice = 400000
    private val discount=0.15
    fun getPrice(): Double {
        return basePrice * discount
    }
}

class CarsPrice {
    fun calculatePrices(cars : List<Any>) : Double {
        var price = 0.0
        cars.forEach {
            price += when (it) {
                is BMW -> {
                    it.getPrice()
                }
                is Audi -> {
                    it.getPrice()
                }
                else -> {
                    throw RuntimeException("Car Not Founded.")
                }
            }
        }
        return price
    }
}

fun main() {
    print(CarsPrice().calculatePrices(listOf(BMW(), Audi())))
}