package baseball.controller;

import baseball.service.Service;
import baseball.view.OutPut;

public class Controller {
    Service service = new Service();
    OutPut outPut = new OutPut();

    public void start() {
        gameStart();
        gameOn();
        endGame();
        gameRestart();
    }

    public void gameStart() {
        outPut.gameStartMessage();
        service.setGame();
    }

    public void gameOn() {
        service.onGame();
    }

    public void endGame() {
        outPut.GameOverMessage();
    }

    public void gameRestart() {
        service.gameRestart();
    }
}
