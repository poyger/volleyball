package com.volly.result;

import com.volly.player.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Poyan Gerami
 * Email: poyan.gerami@eniro.com
 * Date: 2017-02-28
 */
public class Result {
    private List<Player> homeTeam = new ArrayList<>();
    private List<Player> awayTeam = new ArrayList<>();
    private List<Set> sets = new ArrayList<>();

    public List<Player> getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(List<Player> homeTeam) {
        this.homeTeam = homeTeam;
    }

    public List<Player> getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(List<Player> awayTeam) {
        this.awayTeam = awayTeam;
    }

    public List<Set> getSets() {
        return sets;
    }

    public void setSets(List<Set> sets) {
        this.sets = sets;
    }
}
