package com.mycompany.footballplayer;

public class FootbalPlayerTest {
    public static void main(String[] args) {
        FootballPlayer alex = new FootballPlayer();
        alex.no = 10;
        alex.name = "Alex De Souza";
        alex.minutes = 0;
        alex.inPlay = true;
        alex.numberOfGoals = 0;
        
        alex.play(90);
        alex.score();
        alex.score();
        
        System.out.println("Number of goals Alex scored: " + alex.numberOfGoals);
        System.out.println("Alex played totally " + alex.minutes + " minutes so far.");
    
        alex.play(60);
        alex.score();
    
        System.out.println("Number of goals Alex scored: " + alex.numberOfGoals);
        System.out.println("Alex played totally " + alex.minutes + " minutes so far.");
    
        System.out.println("*********");
        
        FootballPlayer oguzhan = new FootballPlayer();
        alex.no = 10;
        alex.name = "Oguzhan";
        alex.minutes = 0;
        alex.inPlay = true;
        alex.numberOfGoals = 0;
        
        alex.play(90);
        alex.score();
        alex.score();
        alex.score();
        
        System.out.println("Number of goals Oguzhan scored: " + alex.numberOfGoals);
        System.out.println("Oguzhan played totally " + oguzhan.minutes + " minutes so far.");
    
    }
}
