import models.Manager;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestTeam {

    Manager manager1;
    Team team1;

    @Before
    public void setUp() throws Exception {
        manager1 = new Manager("Cliff", team1);
        team1 = new Team("Athletico Muirhead", "Red", 12, manager1);
    }

    @Test
    public void canGetTeamName() {
        assertEquals("Athletico Muirhead", team1.getName());
    }

    @Test
    public void canGetColours() {
        assertEquals("Red", team1.getColours());
    }

    @Test
    public void canGetPoints() {
        assertEquals(12, team1.getPoints());
    }

    @Test
    public void canGetManager() {
        assertEquals(manager1, team1.getManager());
    }

    @Test
    public void canGetManagersName() {
        assertEquals("Cliff", team1.getManager().getName());
    }
}


