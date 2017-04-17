
package guru.springframework.garmin.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Time_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Time_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Duration_t">
 *       &lt;sequence>
 *         &lt;element name="Seconds" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Time_t", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", propOrder = {
    "seconds"
})
public class TimeT
    extends DurationT
{

    @XmlElement(name = "Seconds", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
    @XmlSchemaType(name = "unsignedShort")
    protected int seconds;

    /**
     * Gets the value of the seconds property.
     * 
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * Sets the value of the seconds property.
     * 
     */
    public void setSeconds(int value) {
        this.seconds = value;
    }

}
