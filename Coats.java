public class Coats extends Garment {
    private static String DEFAULT_PURPOSE = "provide extra protection against the elements";

    public Coats(String name, Fabric fabricType, Double fabricUnits) {
        this(name, fabricType, fabricUnits, DEFAULT_PURPOSE);
    }

    public Coats(String name, Fabric fabricType, Double fabricUnits, String purpose){
        super(name, fabricType, fabricUnits, purpose);
    }
}
