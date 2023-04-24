public class Document extends DeliverableItem{
    private double minPrice;

    public Document(boolean toClientsAddress, double minPrice) {
        super(toClientsAddress);
        if(minPrice>0) this.minPrice = minPrice;
        else this.minPrice = 1;
    }


    @Override
    public double deliveryPrice() {
        if(isToClientsAddress()) return this.minPrice+getAdditionalPrice();
        else return this.minPrice;
    }
}
