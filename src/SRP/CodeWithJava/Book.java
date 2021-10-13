package SRP.CodeWithJava;

class JBook {
    String name;
    int versionNo;
    String author;
    double price;

    public JBook(String name, int versionNo, String author, double price) {
        this.name = name;
        this.versionNo = versionNo;
        this.author = author;
        this.price = price;
    }
}
    class Jbill {
        private JBook book;
       private int quantity;
        private double discount;
        private double totalPrice;

        public Jbill(JBook book, int quantity, double discount) {
            this.book = book;
            this.quantity = quantity;
            this.discount = discount;
            this.totalPrice = this.calculateTotalPrice();
        }


        public double calculateTotalPrice(){
            double price = ((book.price  * discount) * this.quantity);
            return price;
        }

        public void printBill() {
            System.out.println(quantity + "____ " + book.name + " " +    book.price + "$");
            System.out.println("Discount Rate: " + discount);
            System.out.println("Total Price: " + totalPrice);
        }
        // Here we have two processes in Bill class
        //first one  calculateTotalPrice second print a bill
        //that violates SRP
    }



