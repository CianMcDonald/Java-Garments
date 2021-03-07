/***
 * Class for Garments with purpose beahvior
 * @author Cian McDonald (ID 119363843)
 */
public abstract class Garment {
    private final String name;
    private final Fabric fabricType;
    private final Double fabricUnits;
    private final String purpose;
    private final Double EURO_ENVIRO_TAX = 2.0;

    /**
     * Construct an instance of this class with a given fabric and number of fabric units used
     * 
     * @param name The proper English name of the Garment.
     * @param fabricType The fabric used in making the Garment.
     * @param fabricUnits The number of pieces of fabric used for the Garment.
     */

    public Garment (final String name, final Fabric fabricType, final Double fabricUnits, final String purpose) {
        this.name = name;
        this.fabricType = fabricType;
        this.fabricUnits = fabricUnits;
        this.purpose = purpose;
    }

    /**
     * Get the name of the instance
     * @return The name of the instance
     */
    public String getName () {
        return name;   
    }

    /**
     * Print the purpose of the class
     */
    public void printPurpose () { System.out.println(name + " " + purpose); }

    /**
     * Print the price of the garment
     */
    public void printItemisedBill() {
        /**
         * Itemised bill for NAME
         * Made of __ units of fabName | made of source 
         * enviroment tax: calculateEnviromentTax()
         * base price: calculateBasePrice()
         * grand total: calculateGrandTotal()
         */
        System.out.printf("Itemised bill for %s%n", getName());
        System.out.printf("Made of %.1f units of %s ", fabricUnits, fabricType.getName());
        if (isNatural().equals(true)) {
            System.out.printf("made of %s", ((NaturalFabrics) fabricType).getSource());
        }
        System.out.printf("%n enviroment tax: %s%n", calculateEnviromentTax());
        System.out.printf("     base price: %s%n", calculateBasePrice());
        System.out.printf("    grand total: %s%n", calculateGrandTotal());
    }

    private String calculateBasePrice() {
        return String.format("%.1f * %.1f = %.1f", fabricType.getPrice(), fabricUnits, fabricType.getPrice() * fabricUnits);

    }

    private String calculateEnviromentTax() {
        String output;
        if (isNatural().equals(true)) {
            output = String.format("%.1f * 0.0 = 0.0", fabricUnits);
        } else {
            output = String.format("%.1f * %.1f = %.1f", fabricUnits, EURO_ENVIRO_TAX, (fabricUnits * EURO_ENVIRO_TAX));
        }
        return output;
    }

    private String calculateGrandTotal() {
        String output;
        if (isNatural().equals(true)) {
            output = calculateBasePrice();
        } else {
            output = String.format("(%.1f + %.1f) * %.1f = %.1f", fabricType.getPrice(), EURO_ENVIRO_TAX, fabricUnits, ((fabricType.getPrice() + EURO_ENVIRO_TAX)*fabricUnits));
        }
        return output;
    }

    private Boolean isNatural() {
        boolean result;
        if (fabricType instanceof NaturalFabrics) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}