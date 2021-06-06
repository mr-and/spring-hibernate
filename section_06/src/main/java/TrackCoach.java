import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {

    private final FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return fortuneService.getFortune();
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("TrackCoach: inside destroy method");
    }
}
