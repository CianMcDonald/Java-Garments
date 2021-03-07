public class Jeans extends Trousers{
    private static String NAME = "jeans";
    private static Fabric FABRIC_TYPE = new Cotton();
    private static Double FABRIC_UNITS = 2.0;

    public Jeans () {
        super(NAME, FABRIC_TYPE, FABRIC_UNITS);
    }
}
