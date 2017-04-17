
package guru.springframework.garmin.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Identifies a PC software application.
 * 
 * <p>Java class for Application_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Application_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}AbstractSource_t">
 *       &lt;sequence>
 *         &lt;element name="Build" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Build_t"/>
 *         &lt;element name="LangID" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}LangID_t"/>
 *         &lt;element name="PartNumber" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}PartNumber_t"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Application_t", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", propOrder = {
    "build",
    "langID",
    "partNumber"
})
public class ApplicationT
    extends AbstractSourceT
{

    @XmlElement(name = "Build", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", required = true)
    protected BuildT build;
    @XmlElement(name = "LangID", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String langID;
    @XmlElement(name = "PartNumber", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String partNumber;

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link BuildT }
     *     
     */
    public BuildT getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildT }
     *     
     */
    public void setBuild(BuildT value) {
        this.build = value;
    }

    /**
     * Gets the value of the langID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangID() {
        return langID;
    }

    /**
     * Sets the value of the langID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangID(String value) {
        this.langID = value;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

}