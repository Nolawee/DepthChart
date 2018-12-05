package com.nolawee;

import java.util.*;
import java.util.stream.Collectors;

public class DepthCharts {

    /**
     * Adds a player to a depth chart for a given position (at a specific spot). If you
     * are entering two players into the same slot, the last player entered gets priority and bumps
     * the existing player down a depth spot.
     * @param player
     * @param position
     * @param depth
     */

    private Map<String, List<Player>> depthChart;

    public DepthCharts() {
        this.depthChart = new HashMap<String, List<Player>>();
    }

    public void addPlayerToDepthChart(final Player player, final String position,
                                      final int depth ) {
        // TODO implement me
        List<Player> players;
        if(depthChart.containsKey(position)) {
            players = depthChart.get(position);
        }
        else {
            players = new ArrayList<Player>();
            depthChart.put(position, players);
        }

        int calculatedDepth = depth > players.size() ? players.size() : depth ;

        players.add(calculatedDepth, player);
    }

    /**
     * Adds a player to the end of the depth chart for a given position.
     * @param player
     * @param position
     */
    public void addPlayerToDepthChart( final Player player, final String position ) {
        // TODO implement me
        addPlayerToDepthChart(player, position, depthChart.size() - 1);
    }

    /**
     * Removes a player from the depth chart for a position
     * @param player
     * @param position
     */
    public void removePlayerFromDepthChart( final Player player, final String position ) {
        // TODO implement me
        depthChart.get(position).remove(player);
    }

    /**
     * Prints out all depth chart positions
     */
    public void getFullDepthChart() {
        // TODO implement me
        for(String position : depthChart.keySet()) {
            String pos = position;
            String player = depthChart.get(position).stream().map(p -> String.valueOf(p.getId())).collect(Collectors.joining(","));

            System.out.println("[" + pos + ":" + player + "]" + "\n");
        }

    }

    /**
     * For a given player find all players below them on the depth chart.
     * @param player
     * @param position
     */
    public void getPlayersUnderPlayerInDepthChart( final Player player, final String position ) {
        // TODO implement me
        boolean checkifUnder = false;
        for(Player p : depthChart.get(position)) {
            if(checkifUnder == true)
                checkifUnder = p.equals(player);
            else
                System.out.println(p.getId());
        }
    }
}
