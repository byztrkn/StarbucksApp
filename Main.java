public class Main {
    public static void main(String[] args) {

        CaffeOrder order=new CaffeOrder("Java Chip",CoffeSize.SHORT);
        System.out.println("Sipariş: "+order.getCoffeType()+" "+order.getSize().getSizeSelect()+" cc");
    }
}