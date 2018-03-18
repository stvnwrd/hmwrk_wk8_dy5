import models.Manager;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestManager {

    Manager manager1;
    Team team1;


    @Before
    public void setUp() throws Exception {
        team1 = new Team("Athletico Muirhead", "Red", 12, manager1);
        manager1 = new Manager("Cliff", team1);

    }

    @Test
    public void canGetName() {
        assertEquals("Cliff", manager1.getName());
    }

    @Test
    public void canGetTeam() {
        assertEquals(team1, manager1.getTeam());
    }

    @Test
    public void canGetManagersTeamsPoints() {
        assertEquals(12, manager1.getTeam().getPoints());
    }
}
