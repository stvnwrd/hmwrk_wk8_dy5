import models.Competition;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestCompetition {

    Competition competition1;


    @Before
    public void setUp() throws Exception {
        competition1 = new Competition("League");
    }

    @Test
    public void canGetName() {
        assertEquals("League", competition1.getName());
    }
}
