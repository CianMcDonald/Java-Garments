public abstract class Trousers extends Garment {
    private static String DEFAULT_PURPOSE = "cover the legs";

    public Trousers(String name, Fabric fabricType, Double fabricUnits) {
        this(name, fabricType, fabricUnits, DEFAULT_PURPOSE);
    }

    public Trousers(String name, Fabric fabricType, Double fabricUnits, String purpose){
        super(name, fabricType, fabricUnits, purpose);
    }
}
