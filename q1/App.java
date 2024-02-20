//64050030 Kitipum Nornua
public class App {
    public static void main(String[] args){
        GameInterface FootballGame = new FootballGame();
        FootballGame.launch();

        GameInterface BasketballGame = new BasketballGame();
        BasketballGame.launch();
    }
}
