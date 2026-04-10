
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class TrainConsistManagementAppTest {

    private List<TrainConsistManagementApp.Bogie> getBogies() {
        return Arrays.asList(
                new TrainConsistManagementApp.Bogie("Sleeper", 72),
                new TrainConsistManagementApp.Bogie("AC Chair", 56),
                new TrainConsistManagementApp.Bogie("First Class", 24),
                new TrainConsistManagementApp.Bogie("Sleeper", 70),
                new TrainConsistManagementApp.Bogie("AC Chair", 60)
        );
    }

    @Test
    public void testGrouping() {
        Map<String, List<TrainConsistManagementApp.Bogie>> grouped =
                TrainConsistManagementApp.groupBogies(getBogies());

        assertEquals(3, grouped.size());
        assertEquals(2, grouped.get("Sleeper").size());
        assertEquals(2, grouped.get("AC Chair").size());
        assertEquals(1, grouped.get("First Class").size());

    }

    @Test
    public void testMultipleBogiesInSameGroup() {
        Map<String, List<TrainConsistManagementApp.Bogie>> grouped =
                TrainConsistManagementApp.groupBogies(getBogies());

        assertEquals(2, grouped.get("Sleeper").size());
    }

    @Test
    public void testDifferentBogieTypes() {
        Map<String, List<TrainConsistManagementApp.Bogie>> grouped =
                TrainConsistManagementApp.groupBogies(getBogies());

        assertEquals(3, grouped.size());
    }
}


