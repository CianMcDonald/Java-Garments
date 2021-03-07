public abstract class NaturalFabrics extends Fabric{
    private final String source;

    public NaturalFabrics(String name, Double price, String source) {
        super(name, price);
        this.source = source;
    }

    public String getSource() {
        return source;
    }    
}
