
package guru.springframework.garmin.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SensorState_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SensorState_t">
 *   &lt;restriction base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Token_t">
 *     &lt;enumeration value="Present"/>
 *     &lt;enumeration value="Absent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SensorState_t", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
@XmlEnum
public enum SensorStateT {

    @XmlEnumValue("Present")
    PRESENT("Present"),
    @XmlEnumValue("Absent")
    ABSENT("Absent");
    private final String value;

    SensorStateT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SensorStateT fromValue(String v) {
        for (SensorStateT c: SensorStateT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
