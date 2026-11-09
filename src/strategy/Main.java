package strategy;

public class Main {
    public static void main(String[] args) {
        Cart carrinho = new Cart(200, new NoDiscount());
        System.out.println("Total (sem desconto): " + carrinho.total());

        carrinho.setDiscountStrategy(new PercentageDiscount(10));
        System.out.println("Total (10%): " + carrinho.total());

        carrinho.setDiscountStrategy(new FixedDiscount(20));
        System.out.println("Total (-20): " + carrinho.total());
    }
}
