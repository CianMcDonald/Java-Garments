/***
 * Class for TShirt
 * @author Cian McDonald (ID 119363843)
 */
public class TShirt extends Shirts {
    private static String NAME = "t-Shirt";
    private static Fabric FABRIC_TYPE = new Cotton();
    private static Double FABRIC_UNITS = 1.5;

      /**
     * Construct an instance of this class with a given fabric, number of fabric units used
     */
    public TShirt () {
        super(NAME, FABRIC_TYPE, FABRIC_UNITS);
    }
}

