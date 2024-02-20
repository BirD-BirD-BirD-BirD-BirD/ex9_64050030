//64050030 Kitipum Nornua
public class CoffeePot implements Colleague{
    String name;
    Mediator mediator;
    
    public CoffeePot(String name){
        this.name = name;
    }
    public void doCoffeePot() {
        mediator.actionCoffeePot();
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
