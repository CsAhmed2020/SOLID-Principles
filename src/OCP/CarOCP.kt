package OCP

interface Car {
    fun getPrice():Double
}

class BMWOCP : Car {
    private val basePrice = 500000
    private val tax = 10000.0
   override fun getPrice(): Double {
        return basePrice + tax
    }
}
class AudiOCP :Car {
    private val basePrice = 400000
    private val discount = 0.15
    override fun getPrice(): Double {
        return basePrice * discount
    }
}
    class ToyotaOCP : Car{
        private val basePrice = 200000
        private val discount = 0.10
        private val tax = 5000
       override fun getPrice(): Double {
            return (basePrice * discount) + tax
        }
    }

class CarsPrices{
    fun calculatePrices(cars : List<Car> ) : Double{
        var price=0.0
        cars.forEach {
            price += it.getPrice()
        }
        return price
    }
}

fun main(){
    print(CarsPrices().calculatePrices(listOf(BMWOCP(),AudiOCP(),ToyotaOCP())))
}


