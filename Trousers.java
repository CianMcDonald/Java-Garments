public abstract class Trousers extends Garment{
    private static String DEFAULT_PURPOSE = "Cover the legs";

    public Trousers(String name, Fabric fabric_type, Double fabric_units) {
        this(name, fabric_type, fabric_units, DEFAULT_PURPOSE);
    }

    public Trousers(String name, Fabric fabric_type, Double fabric_units, String purpose){
        super(name, fabric_type, fabric_units, purpose);
    }
}
