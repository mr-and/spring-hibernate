public class CricketCoach implements Coach {

    private String emailAddress;
    private String team;

    public FortuneService fortuneService;

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;

    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "CricketCoach{" +
                "emailAddress='" + emailAddress + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
