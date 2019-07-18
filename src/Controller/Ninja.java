package Controller;

import Model.BananaClass;
import Model.BerryFruit;
import Model.Command;
import Model.FruitsFactory;
import Model.Load;
import Model.MangoFruit;
import view.Menu;
import Model.Save;
import view.DeadScene;
import view.HighestScore;
import view.Game;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
import view.LevelsChoice;
import Model.StrategyOne;
import Model.StrategyThree;
import Model.StrategyTwo;
import Model.StrawberreyFruit;
import Model.OrangeFruit;
import Model.SaverLoaderController;
import Model.SaverLoader;

public class Ninja extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        Game game = new Game();
        Player player = Player.getInstance();
        DeadScene deadScene = new DeadScene();
        LevelsChoice levels = new LevelsChoice();
        StrategyOne strategyOne = new StrategyOne();
        StrategyTwo strategyTwo = new StrategyTwo();
        StrategyThree strategyThree = new StrategyThree();
        HighestScore highestScore = new HighestScore();
        Save save = new Save();
        //Load load = new Load();
        Menu menu = new Menu();
        FruitsFactory factory = new FruitsFactory();
        SaverLoaderController controller = new SaverLoaderController();
        SaverLoader saverLoader = new SaverLoader();
        Load load = new Load();
//        BananaClass bananaClass = new BananaClass();
//        WatermelonCLass watermelonCLass = new WatermelonCLass();
//        StrawberreyFruit strawberreyFruit = new StrawberreyFruit();
//        BerryFruit berryFruit = new BerryFruit();
//        MangoFruit mangoFruit = new MangoFruit();
        menu.setStage(primaryStage);
        menu.prepareScene();

        game.setStage(primaryStage);
        player.setStage(primaryStage);
        levels.setStage(primaryStage);
        highestScore.setStage(primaryStage);
        game.setPlayer(player);
        game.setDeadScene(deadScene);
        game.setMenu(menu);
        game.setFactory(factory);
        game.setController(controller);
        game.setSaverLoader(saverLoader);

        player.setDeadScene(deadScene);
        player.setSave(save);
        deadScene.setStage(primaryStage);
        deadScene.setMenu(menu);
        levels.setLevelOne1(game);
        levels.setStrategyOne(strategyOne);
        levels.setStrategyTwo(strategyTwo);
        levels.setStrategyThree(strategyThree);
        levels.setSave(save);
        highestScore.setPlayer(player);
        highestScore.setMenu1(menu);
        highestScore.setPlayer(player);
        deadScene.prepareScene();
        menu.setLevelsChoice(levels);
        menu.setGame(game);
        menu.setSaverLoader(saverLoader);
        // menu.setLoad(load);
        menu.setPlayer(player);
        menu.setStrategy1(strategyOne);
        menu.setStrategy2(strategyTwo);
        menu.setStrategy3(strategyThree);
        menu.setHighestScore(highestScore);
        menu.setController(controller);
        levels.prepareScene();
        save.setPlayer(player);
        saverLoader.setLoad(load);
        saverLoader.setSave(save);
        saverLoader.setMenu(menu);
        //  loader.setLoad(load);
        primaryStage.setTitle("Fruit Ninja Game");
        primaryStage.setScene(menu.getScene());
        primaryStage.show();
    }

}
