public class Material {
    private String name;
    boolean isFragile;

    public Material(String name, boolean isFragile) {
        this.name = name;
        this.isFragile = isFragile;
    }

    public boolean isFragile() {
        return isFragile;
    }
}
