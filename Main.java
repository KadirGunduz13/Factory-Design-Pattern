import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PaymentFactory paymentFactory = new PaymentFactory();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n====ÖDEME SİSTEMİ====");

        while (true) {

            System.out.println("****************************************\n");

            System.out.println("1. EFT/Havale ile ödeme");
            System.out.println("2. Kredi Kartı ile ödeme");
            System.out.println("3. PayPal ile ödeme");
            System.out.println("4. Sistemden çıkış");

            System.out.println();

            System.out.print("Bir işlem seçin: ");
            String islem = scanner.nextLine();

            if (islem.equals("1")) {
                Payment bankTransferPayment = paymentFactory.createPayment("BankTransfer");
                bankTransferPayment.processPayment();
            } else if (islem.equals("2")) {
                Payment creditCardPayment = paymentFactory.createPayment("CreditCard");
                creditCardPayment.processPayment();
            } else if (islem.equals("3")) {
                Payment paypalPayment = paymentFactory.createPayment("PayPal");
                paypalPayment.processPayment();
            } else if (islem.equals("4")) {
                System.out.println("Sistemden çıkılıyor.");
                break;
            }
        }



    }
}