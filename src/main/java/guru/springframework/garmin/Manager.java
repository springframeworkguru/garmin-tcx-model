package guru.springframework.garmin;

import guru.springframework.garmin.entity.TrainingCenterDatabaseT;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Mohd Farid
 *
 * @author mohdfarid@cloud.upwork.com
 * @since 16/04/17
 */
public class Manager {

    @Value(value = "classpath:xmlToParse/companies.xml")
    private Resource companiesXml;

    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        // create JAXB context and instantiate marshaller



        JAXBContext context = JAXBContext.newInstance(TrainingCenterDatabaseT.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        // Write to System.out
//        m.marshal(bookstore, System.out);

        // Write to File
//        m.marshal(bookstore, new File(BOOKSTORE_XML));

        // get variables from our xml file, created before
        System.out.println();
        System.out.println("Output from our XML File: ");
        Unmarshaller um = context.createUnmarshaller();


        TrainingCenterDatabaseT trainingCenterDatabaseT = (TrainingCenterDatabaseT) um.unmarshal(new FileReader("abc"));
    }
}
