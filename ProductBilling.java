public class ProductBilling {
    
    // Method 1 : billing for one product
    void bill (int price) {
        System.out.println("Total bill for one product: " + price);
    }
    
    //method 2: billing for two products 
    void bill (int price1, int price2) {
         System.out.println("Total bill for two products: " + (price1 + price2));
    }

    //method 3: billing for three products 
    void bill (int price1, int price2, int price3) {
         System.out.println("Total bill for three products: " + (price1 + price2 + price3));
    }

    public static void main(String[] args) {
        
        // step 1: create object 
        ProductBilling billing = new ProductBilling();

        //step 2:call overloaded methods
        billing.bill(500); 
        billing.bill(500, 300);
        billing.bill(500, 300, 200);
   }
}
