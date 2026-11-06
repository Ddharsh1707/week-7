/**
 * Week 7 Assignment 5 - The Shopping Cart (private prices, total computed on request)
 */
public class A5_ShoppingCart {

    static class Cart {
        private final String cartId;
        private final double[] prices;
        private int itemCount = 0;

        public Cart(String cartId, int maxItems) {
            this.cartId = cartId;
            this.prices = new double[maxItems];
        }

        public boolean addItem(double price) {
            if (price < 0 || itemCount >= prices.length) {
                System.out.println("Item rejected");
                return false;
            }
            prices[itemCount++] = price;
            return true;
        }

        public double getTotal() {
            double total = 0;
            for (int i = 0; i < itemCount; i++) total += prices[i];
            return total;
        }

        public int getItemCount() { return itemCount; }
        public String getCartId() { return cartId; }
    }

    public static void main(String[] args) {
        Cart cart = new Cart("CART-5", 20);
        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);
        System.out.println("cart.getTotal() -> " + (int) cart.getTotal());
        System.out.println("cart.getItemCount() -> " + cart.getItemCount());
    }
}
