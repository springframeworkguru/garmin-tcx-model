
package guru.springframework.garmin.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Activity_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Activity_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Lap" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}ActivityLap_t" maxOccurs="unbounded"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Training" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Training_t" minOccurs="0"/>
 *         &lt;element name="Creator" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}AbstractSource_t" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Extensions_t" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Sport" use="required" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Sport_t" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Activity_t", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", propOrder = {
    "id",
    "lap",
    "notes",
    "training",
    "creator",
    "extensions"
})
public class ActivityT {

    @XmlElement(name = "Id", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar id;
    @XmlElement(name = "Lap", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", required = true)
    protected List<ActivityLapT> lap;
    @XmlElement(name = "Notes", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
    protected String notes;
    @XmlElement(name = "Training", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
    protected TrainingT training;
    @XmlElement(name = "Creator", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
    protected AbstractSourceT creator;
    @XmlElement(name = "Extensions", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
    protected ExtensionsT extensions;
    @XmlAttribute(name = "Sport", required = true)
    protected SportT sport;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setId(XMLGregorianCalendar value) {
        this.id = value;
    }

    /**
     * Gets the value of the lap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityLapT }
     * 
     * 
     */
    public List<ActivityLapT> getLap() {
        if (lap == null) {
            lap = new ArrayList<ActivityLapT>();
        }
        return this.lap;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the training property.
     * 
     * @return
     *     possible object is
     *     {@link TrainingT }
     *     
     */
    public TrainingT getTraining() {
        return training;
    }

    /**
     * Sets the value of the training property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainingT }
     *     
     */
    public void setTraining(TrainingT value) {
        this.training = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractSourceT }
     *     
     */
    public AbstractSourceT getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractSourceT }
     *     
     */
    public void setCreator(AbstractSourceT value) {
        this.creator = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsT }
     *     
     */
    public ExtensionsT getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsT }
     *     
     */
    public void setExtensions(ExtensionsT value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the sport property.
     * 
     * @return
     *     possible object is
     *     {@link SportT }
     *     
     */
    public SportT getSport() {
        return sport;
    }

    /**
     * Sets the value of the sport property.
     * 
     * @param value
     *     allowed object is
     *     {@link SportT }
     *     
     */
    public void setSport(SportT value) {
        this.sport = value;
    }

}
