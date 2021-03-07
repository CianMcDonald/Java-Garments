public class Jacket extends Coats {
    private static String NAME = "jacket";
    private static Fabric FABRIC_TYPE = new Tweed();
    private static Double FABRIC_UNITS = 2.0;

    public Jacket () {
        super(NAME, FABRIC_TYPE, FABRIC_UNITS);
    }
}
