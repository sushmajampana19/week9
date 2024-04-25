class OutOfStockException extends Exception {
    public OutOfStockException() {
        System.out.println("Not enough apples in stock.");
    }
}
class InsufficientCashException extends Exception {
    public String getMessage() {
        return "Insufficient Cash to buy items";
    }
}
public class UserException {
    public static void main(String[] args) {
        int applesInStock = 20;
        int applesToBuy = 30;
        try {
            if (applesInStock < applesToBuy) {
                throw new OutOfStockException();
            }
        } catch (OutOfStockException e) {
            System.out.println("Apples are out of stock");
        }

        int customerBalance = 60;
        int costOfItems = 90;
        try {
            if (customerBalance < costOfItems) {
                throw new InsufficientCashException();
            }
        } catch (InsufficientCashException e) {
            System.out.println(e.getMessage());
        }
    }
}
