package com.lambdaschool.solution;

public class MyApp implements Processor
{
    //constructor injections
    private AthleteCreation athleteCreation;

     MyApp(AthleteCreation athleteCreation)
    {
        this.athleteCreation = athleteCreation;
    }

    @Override
    public void displayAthlete()
    {
        System.out.println("\n**************");
        athleteCreation.displayAthlete();
        System.out.println("**************\n");
    }
}
