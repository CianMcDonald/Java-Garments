/***
 * Class for Jacket
 * @author Cian McDonald (ID 119363843)
 */

public class Jacket extends Coats {
    private static String NAME = "jacket";
    private static Fabric FABRIC_TYPE = new Tweed();
    private static Double FABRIC_UNITS = 2.0;

    /**
     * Construct an instance of this class with a given fabric and number of fabric units used
 */
    public Jacket () {
        super(NAME, FABRIC_TYPE, FABRIC_UNITS);
    }
}
