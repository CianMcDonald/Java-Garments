public class WinterCoat extends Coats {
    private static String NAME = "wintercoat";
    private static Fabric FABRIC_TYPE = new Polyster();
    private static Double FABRIC_UNITS = 2.5;

    public WinterCoat () {
        super(NAME, FABRIC_TYPE, FABRIC_UNITS);
    }
}
