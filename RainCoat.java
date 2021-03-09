
/***
 * Class for RainCoat
 * @author Cian McDonald (ID 119363843)
 */
public class RainCoat extends Coats {
    private static String NAME = "raincoat";
    private static Fabric FABRIC_TYPE = new Acrylic();
    private static Double FABRIC_UNITS = 2.5;

      /**
     * Construct an instance of this class with a given fabric, number of fabric units used
     */
    public RainCoat () {
        super(NAME, FABRIC_TYPE, FABRIC_UNITS);
    }
}
