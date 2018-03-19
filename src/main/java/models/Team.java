package models;


import javax.persistence.*;
import java.awt.datatransfer.FlavorEvent;
import java.util.Set;

@Entity
@Table(name="teams")
public class Team {
    private int id;
    private String name;
    private String colours;
    private int points;
    private Manager manager;
    private Set<Player> players;
    private Set<Competition> competitions;


    public Team() {
    }

    public Team(String name, String colours, int points, Manager manager) {
        this.name = name;
        this.colours = colours;
        this.points = points;
        this.manager = manager;
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "colours")
    public String getColours() {
        return colours;
    }

    public void setColours(String colours) {
        this.colours = colours;
    }

    @Column(name = "points")
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @OneToOne
    @JoinColumn(name="manager_id")
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @OneToMany(mappedBy = "team", fetch=FetchType.EAGER)
    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    @ManyToMany(mappedBy = "teams", fetch = FetchType.EAGER)
    public Set<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(Set<Competition> competitions) {
        this.competitions = competitions;
    }
}
