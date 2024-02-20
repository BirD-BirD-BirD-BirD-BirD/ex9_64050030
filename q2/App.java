//64050030 Kitipum Nornua
public class App {
    public static void main(String[] args){
        GameManager gameManager = new GameManager();

        gameManager.setGame(new FootballGame());
        gameManager.launch();

        gameManager.setGame(new BasketballGame());
        gameManager.launch();
    }
}
