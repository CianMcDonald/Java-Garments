public class Shirts extends Garment {
    private static String DEFAULT_PURPOSE = "cover the body";

    public Shirts(String name, Fabric fabricType, Double fabricUnits) {
        this(name, fabricType, fabricUnits, DEFAULT_PURPOSE);
    }

    public Shirts(String name, Fabric fabricType, Double fabricUnits, String purpose){
        super(name, fabricType, fabricUnits, purpose);
    }
}
