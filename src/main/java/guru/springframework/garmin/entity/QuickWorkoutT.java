
package guru.springframework.garmin.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuickWorkout_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuickWorkout_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalTimeSeconds" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DistanceMeters" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuickWorkout_t", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", propOrder = {
    "totalTimeSeconds",
    "distanceMeters"
})
public class QuickWorkoutT {

    @XmlElement(name = "TotalTimeSeconds", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
    protected double totalTimeSeconds;
    @XmlElement(name = "DistanceMeters", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
    protected double distanceMeters;

    /**
     * Gets the value of the totalTimeSeconds property.
     * 
     */
    public double getTotalTimeSeconds() {
        return totalTimeSeconds;
    }

    /**
     * Sets the value of the totalTimeSeconds property.
     * 
     */
    public void setTotalTimeSeconds(double value) {
        this.totalTimeSeconds = value;
    }

    /**
     * Gets the value of the distanceMeters property.
     * 
     */
    public double getDistanceMeters() {
        return distanceMeters;
    }

    /**
     * Sets the value of the distanceMeters property.
     * 
     */
    public void setDistanceMeters(double value) {
        this.distanceMeters = value;
    }

}
