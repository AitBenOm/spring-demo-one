package com.AitBenOm.springdemo;

public class CricketCoach implements Coach
{
    private FortuneService fortuneService;
    private String email;
    private String team;

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15min";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public CricketCoach() {
        System.out.println("Cricket: Inside no-arg constructor");

    }

    public CricketCoach(FortuneService fortuneService) {
        System.out.println("Cricket: Inside no-arg constructor");
        this.fortuneService = fortuneService;
    }
    // setter methods
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket: Inside Setter Method");
        this.fortuneService = fortuneService;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("Cricket: Inside Set Email");
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Cricket: Inside set Team");
        this.team = team;
    }
}
