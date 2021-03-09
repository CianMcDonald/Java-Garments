/***
 * Class for Jeans
 * @author Cian McDonald (ID 119363843)
 */


public class Jeans extends Trousers{
    private static String NAME = "jeans";
    private static Fabric FABRIC_TYPE = new Cotton();
    private static Double FABRIC_UNITS = 2.0;

    /**
     * Construct an instance of this class with a given fabric and number of fabric units used.
 */
    public Jeans () {
        super(NAME, FABRIC_TYPE, FABRIC_UNITS);
    }
}
