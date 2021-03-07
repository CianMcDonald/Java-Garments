public class TShirt extends Shirts {
    private static String NAME = "t-Shirt";
    private static Fabric FABRIC_TYPE = new Cotton();
    private static Double FABRIC_UNITS = 1.5;

    public TShirt () {
        super(NAME, FABRIC_TYPE, FABRIC_UNITS);
    }
}

