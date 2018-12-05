package com.nolawee;

public class DepthChartsMain {

    public static void main( String args[] ) {

        final DepthCharts depthCharts = new DepthCharts();
        final Sport sport = new Sport("NFL");

        final Player bob = new Player.Builder()
                .id( 1 )
                .name( "Bob" )
                .build();

        final Player alice = new Player.Builder()
                .id( 2 )
                .name( "Alice" )
                .build();

        final Player charlie = new Player.Builder()
                .id( 3 )
                .name( "Charlie" )
                .build();

        depthCharts.addPlayerToDepthChart(bob, "WR", 0);
        depthCharts.addPlayerToDepthChart(alice, "WR", 0);
        depthCharts.addPlayerToDepthChart(charlie, "WR", 2);
        depthCharts.addPlayerToDepthChart(bob, "KR");

        /*
         * Outputs:
         * WR: [2, 1, 3]
         * KR: [1]
         */
        depthCharts.getFullDepthChart();

        /*
         * Outputs:
         * [1,3]
         */
        depthCharts.getPlayersUnderPlayerInDepthChart(alice, "WR");



    }
}
