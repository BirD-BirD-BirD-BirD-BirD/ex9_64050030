//64050030 Kitipum Nornua
public class Sprinkler implements Colleague{
    String name;
    Mediator mediator;

    public Sprinkler(String name){
        this.name = name;
    }

    public void doSprinkler() {
        mediator.actionSprinkler();
        mediator.stopAlarm(name);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName(){
        return name;
    }
}
