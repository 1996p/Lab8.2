package ru.vorotov.simulationslab82;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

public class HelloController {
    @FXML
    private Label text;
    private final String[] answers = {
            "Определенно, да", // 0.30 // x < 0.3
            "Вероятнее всего", // 0.30 // 0.3 <= x < 0.6
            "Пока не ясно", // 0.20 // 0.6 <= x < 0.8
            "Точно нет" // 0.20 // x >= 0.8
    };

    private final double[] probabilities = {
            0.3,
            0.3,
            0.2,
            0.2
    };

    @FXML
    protected void onHelloButtonClick() {
        Random random = new Random();
        var a = random.nextDouble();
        System.out.println(a);

        if (a < probabilities[0]) {
            text.setText(answers[0]);
        } else if (probabilities[0] <= a && a < probabilities[0] + probabilities[1]) {
            text.setText(answers[1]);
        } else if (probabilities[0] + probabilities[1] <= a && a < probabilities[0] + probabilities[1] + probabilities[2]) {
            text.setText(answers[2]);
        } else {
            text.setText(answers[3]);
        }
    }
}