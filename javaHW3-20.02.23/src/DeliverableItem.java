import org.w3c.dom.ls.LSOutput;

public abstract class DeliverableItem implements Deliverable{
    private boolean toClientsAddress;
    private static double additionalPrice;


    public DeliverableItem(boolean toClientsAddress) {
        this.toClientsAddress = toClientsAddress;
    }

    public static void setAdditionalPrice(double additionalPric) {
        if(additionalPric>0) {
            additionalPrice = additionalPric;
        }
        else {
            additionalPrice = 1;
        }
    }

    public static double getAdditionalPrice() {
        return additionalPrice;
    }

    public boolean isToClientsAddress() {
        return toClientsAddress;
    }
}