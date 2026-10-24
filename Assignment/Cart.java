public class Cart {
    private final String cartId;

    private final Double[] prices;

    public Cart(String cartId, int maximumItems) {
        if (maximumItems < 0) {
            throw new IllegalArgumentException("Maximum item count cannot be negative.");
        }
        this.cartId = cartId;
        this.prices = new Double[maximumItems];
    }

    public void addItem(double price) {
        if (price < 0) {
            System.out.println("Item not added: price cannot be negative.");
            return;
        }
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == null) {
                prices[i] = price;
                return;
            }
        }
        System.out.println("Item not added: cart is full.");
    }

    public double getTotal() {
        double total = 0.0;
        for (Double price : prices) {
            if (price != null) {
                total += price;
            }
        }
        return total;
    }

    public int getItemCount() {
        int count = 0;
        for (Double price : prices) {
            if (price != null) {
                count++;
            }
        }
        return count;
    }

    public String getCartId() {
        return cartId;
    }

    public static void main(String[] args) {
        Cart cart = new Cart("CART-5", 20);
        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);
        System.out.println("Total: " + cart.getTotal());
        System.out.println("Item count: " + cart.getItemCount());
    }
}
