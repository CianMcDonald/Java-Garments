public class RainCoat extends Coats {
    private static String NAME = "raincoat";
    private static Fabric FABRIC_TYPE = new Acrylic();
    private static Double FABRIC_UNITS = 2.5;

    public RainCoat () {
        super(NAME, FABRIC_TYPE, FABRIC_UNITS);
    }
}
