import db.DBHelper;
import models.Manager;
import models.Team;

public class Runner {

    public static void main(String[] args) {

        Manager manager1 = new Manager("Dave", team1);
        DBHelper.saveOrUpdate(manager1);

        Team team1 = new Team("Spartak Tontine", "Black & White", 15, manager1);
        DBHelper.saveOrUpdate(team1);




    }
}
