//64050030 Kitipum Nornua
public class Alarm implements Colleague{
    String name;
    Mediator mediator;

    public Alarm(String name) {
        this.name = name;
    }

    public void doAlarm() {
        mediator.alarm();
    }   
    public void endAlarm(String from) {
        mediator.stopAlarm(from);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName(){
        return name;
    }

}