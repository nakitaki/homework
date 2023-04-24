public class WeightedItem extends DeliverableItem{
    private Material material;
    private double pricePerKg;

    private double weight;

    public WeightedItem(boolean toClientsAddress, Material material, double pricePerKg, double weight) {
        super(toClientsAddress);
        this.material = material;
        if(pricePerKg<=0) this.pricePerKg = 1;
        else this.pricePerKg = pricePerKg;
        if(weight<=0) this.weight = 1;
        else this.weight = weight;
    }


    @Override
    public double deliveryPrice() {
        double sum;
        if(isToClientsAddress()) sum = pricePerKg*weight+getAdditionalPrice();
        else sum = pricePerKg*weight;
        if(material.isFragile()) return sum+sum*0.01;
        else return sum;
    }
}
