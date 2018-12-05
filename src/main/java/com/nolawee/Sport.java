package com.nolawee;

import java.util.List;

public class Sport {
    private String sportType;
    // list of positions for any given sport
    private List<String> positions;

    public Sport() {
    }

    public Sport(String sportType) {
        this.sportType = sportType;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public List<String> getPositions() {
        return positions;
    }

    public void setPositions(List<String> positions) {
        this.positions = positions;
    }
}


