package SRP

//Here we will fix the another code to achieve SRP
//bill class should have only one process
//we will isolate print bill process in another class
class BookSRP(var name: String, var versionNo: Int, var author: String, var price: Double) {
    inner class Bill(val bookSrp: BookSRP, val quantity: Int, val discount: Double) {
        val totalPrice: Double
        fun calculateTotalPrice(): Double {
            return bookSrp.price * discount * quantity
        }

        init {
            totalPrice = calculateTotalPrice()
        }
    }

    //Here we isolate print bill process in another class
    //if we have other process, also will be isolated to be here
    inner class BillPrinter(private val bill: Bill) {
        fun printBill() {
            println(bill.quantity.toString() + "x " + bill.bookSrp.name + " " + bill.bookSrp.price + " $")
            println("Discount Rate: " + bill.discount)
            println("Total Price: " + bill.totalPrice + " $")
        }
    }
}