//64050030 Kitipum Nornua
public class TimeMediator implements Mediator{
    Alarm alarm;
    CoffeePot coffeePot;
    Sprinkler sprinkler;

    public void setAlarm(Alarm alarm){
        this.alarm = alarm;
    }

    public void setCoffeePot(CoffeePot coffeePot){
        this.coffeePot = coffeePot;
    }

    public void setSprinkler(Sprinkler sprinkler){
        this.sprinkler = sprinkler;
    }

    @Override
    public void alarm() {
        System.out.println(alarm.getName() + " is sending event to all...");
    }

    @Override
    public void stopAlarm(String source) {
        System.out.println(alarm.getName() + " event ended from " + source);
    }

    @Override
    public void actionCoffeePot() {
        System.out.println("I am coffee pot,... doing my task");
    }

    @Override
    public void actionSprinkler() {
        System.out.println("I am sprinkler,... doing my task");
    }
    
}
