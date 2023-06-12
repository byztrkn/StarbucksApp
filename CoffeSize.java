public enum CoffeSize {
    SHORT(23),
    TALL(35),
    GRANDE(47),
    VENTI(59),
    TRENTA(100);

    private int sizeSelect;

    private CoffeSize(int sizeSelect){
       this.sizeSelect=sizeSelect;
    }
    public int getSizeSelect(){
        return this.sizeSelect;
    }
}
