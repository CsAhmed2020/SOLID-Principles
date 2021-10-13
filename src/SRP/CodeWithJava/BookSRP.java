package SRP.CodeWithJava;

//Here we will fix the another code to achieve SRP
//bill class should have only one process
//we will isolate print bill process in another class
class JBookSRP {
    String name;
    int versionNo;
    String author;
    double price;

    public JBookSRP(String name, int versionNo, String author, double price) {
        this.name = name;
        this.versionNo = versionNo;
        this.author = author;
        this.price = price;
    }

    public class JBill {
        private JBookSRP bookSrp;
        private int quantity;
        private double discount;
        private double totalPrice;

        public JBill(JBookSRP bookSrp, int quantity, double discount) {
            this.bookSrp = bookSrp;
            this.quantity = quantity;
            this.discount = discount;
            this.totalPrice = this.calculateTotalPrice();
        }


        public double calculateTotalPrice(){
            double price = ((bookSrp.price  * discount) * this.quantity);
            return price;
        }

    }

    //Here we isolate print bill process in another class
    //if we have other process, also will be isolated to be here
    public class BillPrinter {
        private JBill bill;

        public BillPrinter(JBill bill) {
            this.bill = bill;
        }

        public void printBill() {
            System.out.println(bill.quantity + "x " + bill.bookSrp.name + " " + bill.bookSrp.price + " $");
            System.out.println("Discount Rate: " + bill.discount);
            System.out.println("Total Price: " + bill.totalPrice + " $");
        }
    }
}
