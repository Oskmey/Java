package exercises;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 *  Utilities to input/output player data for a command line game
 *
 *  See:
 *  - UseAConstructor
 *  - ObjectArrMeth
 *
 */
public class Ex4ReadPlayers {
    public static void main(String[] args) {
        new Ex4ReadPlayers().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        Player[] players = inputPlayers();
        outPlayers(players);
    }

    // This class captures the concept of a Player
    class Player {
        String name; // A Player has a name and...
        int points; // ... and points

        
        Player(String name, int points) {
            this.name = name;
            this.points = points;
        }
    }

    // ---------- Methods -------------------

    Player[] inputPlayers() {
        System.out.print("How many players do you want? > ");
        int numberOfPlayers = sc.nextInt();
        Player[] players = new Player[numberOfPlayers];
        for (int i = 0; i <= (numberOfPlayers-1); i++) {
            System.out.println("What is player " + (i+1) + " name?");
            String name = sc.nextln();
            players[i] = new Player(name, 0);
        }
        return players;
    }

    void outPlayers(Player[] players) {
        for (int i = 0; i <= (players.length-1); i++) {
            System.out.println("player " + (i+1) + " " + players[i].name + " points > " + players[i].points);
        }
    }

}
