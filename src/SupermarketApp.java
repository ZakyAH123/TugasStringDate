
public class SupermarketApp {
    public static void main(String[] args) {
        
        Captcha login = new Captcha();

        Customer customer = new Customer("", "", " ", " ");
        customer.displaySupermarketInfo();
        System.out.println("-----DATA PELANGGAN-----");
        customer.inputCustomerData();

        Purchase purchase = new Purchase("", "");
        System.out.println("--DATA PEMBELIAN BARANG-");
        purchase.inputPurchaseData();
        purchase.displayPurchaseData();
    }
}