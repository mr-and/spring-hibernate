public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    //add an init method
    public void doStartupStuff() {
        System.out.println("TrackCoach: inside method doStartupStuff");
    }

    //add an destroy method
    public void doCleanupStuff() {
        System.out.println("TrackCoach: inside method doCleanupStuff");
    }

}