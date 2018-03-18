import models.Manager;
import models.Player;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestPlayer {

    Manager manager1;
    Team team1;
    Player player1;


    @Before
    public void setUp() throws Exception {
        manager1 = new Manager("Cliff", team1);
        team1 = new Team("Athletico Muirhead", "Red", 12, manager1);
        player1 = new Player("Larry", 35, "Midfield", team1);
    }

    @Test
    public void canGetName() {
        assertEquals("Larry", player1.getName());
    }

    @Test
    public void canGetAge() {
        assertEquals(35, player1.getAge());
    }

    @Test
    public void canGetPosition() {
        assertEquals("Midfield", player1.getPosition() );
    }

    @Test
    public void canGetTeam() {
        assertEquals(team1, player1.getTeam());
    }

    @Test
    public void canGetPlayersTeamName() {
        assertEquals("Athletico Muirhead", player1.getTeam().getName());
    }

    @Test
    public void canGetPlayersTeamsManager() {
        assertEquals("Cliff", player1.getTeam().getManager().getName());
    }
}
