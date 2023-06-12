public class CaffeOrder {
    private String coffeType;
    private CoffeSize size;

    public CaffeOrder(String coffeType,CoffeSize size){
        this.coffeType=coffeType;
        this.size=size;
    }

    public String getCoffeType(){
        return coffeType;
    }
    public CoffeSize getSize(){
        return size;
    }
}
