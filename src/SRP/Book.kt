package SRP

class JBook(var name: String, var versionNo: Int, var author: String, var price: Double)


internal class Jbill(private val book: JBook, private val quantity: Int, private val discount: Double) {
    private val totalPrice: Double
    fun calculateTotalPrice(): Double {
        return book.price * discount * quantity
    }

    fun printBill() {
        println(quantity.toString() + "____ " + book.name + " " + book.price + "$")
        println("Discount Rate: $discount")
        println("Total Price: $totalPrice")
    } // Here we have two processes in Bill class

    //first one  calculateTotalPrice second print a bill
    //that violates SRP
    init {
        totalPrice = calculateTotalPrice()
    }
}



