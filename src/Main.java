import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import folder1.*;
import folder2.*;

public class Main {




    public static void main(String[] args) throws FileNotFoundException{


        Scanner playersFile = new Scanner(new File("Players.csv"));
        ArrayList<Player> playerData = new ArrayList<>();

        playersFile.nextLine();

        while (playersFile.hasNextLine()) {
            String playerRow = playersFile.nextLine();
            String[] playerRowData = playerRow.split("\\,");

            String name = playerRowData[0];
            String surName = playerRowData[1];
            String team = playerRowData[2];
            String position = playerRowData[3];
            double fitness = Double.parseDouble(playerRowData[4]);
            double passingAccuracy = Double.parseDouble(playerRowData[5]);
            double shotAccuracy = Double.parseDouble(playerRowData[6]);
            double shotFrequency = Double.parseDouble(playerRowData[7]);
            double defensiveness = Double.parseDouble(playerRowData[8]);
            double aggression = Double.parseDouble(playerRowData[9]);
            double positioning = Double.parseDouble(playerRowData[10]);
            double dribbling = Double.parseDouble(playerRowData[11]);
            double chanceCreation = Double.parseDouble(playerRowData[12]);
            double offsideAdherence = Double.parseDouble(playerRowData[13]);

            playerData.add(new Player(name, surName, team, position, fitness, passingAccuracy, shotAccuracy, shotFrequency, defensiveness, aggression, positioning, dribbling, chanceCreation, offsideAdherence));


        }
        System.out.println(playerData);


        Scanner managersFile = new Scanner(new File("Managers.csv"));
        ArrayList<Manager> managerData = new ArrayList<>();

        managersFile.nextLine();

        while (managersFile.hasNextLine()) {

            String managerRow = managersFile.nextLine();
            String[] managerRowData = managerRow.split("\\,");
            String name = managerRowData[0];
            String surName = managerRowData[1];
            String team = managerRowData[2];
            String favouredFormation = managerRowData[3];
            double respect = Double.parseDouble(managerRowData[4]);
            double ability = Double.parseDouble(managerRowData[5]);
            double knowledge = Double.parseDouble(managerRowData[6]);
            double belief = Double.parseDouble(managerRowData[7]);

            managerData.add(new Manager(name, surName, team, favouredFormation, respect, ability, knowledge, belief));

        }
        System.out.println(managerData);

       ArrayList<Squad> squadData = new ArrayList<>();

        for (int i = 0; i < 32; i++) {
            squadData.add( new Squad(managerData[i].getTeam(), managerData[i]););
        }


    }






    public static Team getTeam(Squad s){
        Team t = new Team(s.getTeamName(), s.getManager());


        return t;
    }

    public static void runTournament(){

    }
}