import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get bean from constructor of spring container
        Coach baseballCoach = context.getBean("myBaseballCoach", Coach.class);

        //get bean from setter of spring container
        CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //call method on the beans
        System.out.println(baseballCoach.getDailyFortune());
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.toString());

        //close the context
        context.close();
    }
}
