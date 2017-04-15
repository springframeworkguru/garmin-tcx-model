package guru.springframework;

import guru.springframework.garmin.entity.ActivityLapT;
import guru.springframework.garmin.entity.ActivityT;
import guru.springframework.garmin.entity.TrainingCenterDatabaseT;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Mohd Farid
 *
 * @since 16/04/17
 */
public class UnMarshalTest {

    @Test
    public void testUnMarshaling() throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(TrainingCenterDatabaseT.class);
        Unmarshaller um = context.createUnmarshaller();
        URL resource = this.getClass().getResource("../../activity.tcx");

        TrainingCenterDatabaseT trainingCenterDatabaseT = (TrainingCenterDatabaseT) ((JAXBElement)um.unmarshal(resource)).getValue();

        assertNotNull(trainingCenterDatabaseT);

        assertEquals(1, trainingCenterDatabaseT.getActivities().getActivity().size());

        ActivityT activityT = trainingCenterDatabaseT.getActivities().getActivity().get(0);
        assertEquals("Forerunner 735XT", activityT.getCreator().getName());
        assertEquals("2017-04-12T13:22:50.000Z", activityT.getId().toString());
        assertEquals(null, activityT.getNotes());
        assertEquals("RUNNING", activityT.getSport().toString());
        assertEquals(4, activityT.getLap().size());

        ActivityLapT activityLapFirst = activityT.getLap().get(0);
        assertEquals(0, Double.compare(870, activityLapFirst.getTotalTimeSeconds()));
        assertEquals("Active", activityLapFirst.getIntensity().value());
        assertEquals("Manual", activityLapFirst.getTriggerMethod().value());
    }
}
