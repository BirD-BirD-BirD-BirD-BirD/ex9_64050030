//64050030 Kitipum Nornua
public class App {
    public static void main(String[] args) {
        Sprinkler sprinkler = new Sprinkler("Sprinkler");
        CoffeePot coffeePot = new CoffeePot("CoffeePot");
        Alarm alarm = new Alarm("Alarm");
        TimeMediator mediator = new TimeMediator();
        mediator.setAlarm(alarm);
        mediator.setSprinkler(sprinkler);
        mediator.setCoffeePot(coffeePot);

        alarm.setMediator(mediator);
        sprinkler.setMediator(mediator);
        coffeePot.setMediator(mediator);
        alarm.doAlarm();
        sprinkler.doSprinkler();
        coffeePot.doCoffeePot();
    }    
}
