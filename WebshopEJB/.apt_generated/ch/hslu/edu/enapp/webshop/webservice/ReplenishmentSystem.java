//
// Generated By:JAX-WS RI IBM 2.2.1-07/09/2014 01:53 PM(foreman)- (JAXB RI IBM 2.2.3-07/07/2014 12:56 PM(foreman)-)
//


package ch.hslu.edu.enapp.webshop.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Replenishment_System.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Replenishment_System">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Purchase"/>
 *     &lt;enumeration value="Prod_Order"/>
 *     &lt;enumeration value="_blank_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Replenishment_System")
@XmlEnum
public enum ReplenishmentSystem {

    @XmlEnumValue("Purchase")
    PURCHASE("Purchase"),
    @XmlEnumValue("Prod_Order")
    PROD_ORDER("Prod_Order"),
    @XmlEnumValue("_blank_")
    BLANK("_blank_");
    private final String value;

    ReplenishmentSystem(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReplenishmentSystem fromValue(String v) {
        for (ReplenishmentSystem c: ReplenishmentSystem.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
