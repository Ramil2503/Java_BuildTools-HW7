package org.example;

import java.util.Random;

public class Main {
    private static final Box[] boxArray = new Box[]{new Box(), new Box(), new Box()};
    private static final Random random = new Random();
    private static final int cntAll = 1000;
    private static int cntWins = 0;

    public static void main(String[] args) {

        for (int i = 0; i < cntAll; i++) {
            for (int j = 0; j < 3; j++) {
                boxArray[j].setOpened(false);
                boxArray[j].setPrize(false);
                boxArray[j].setUserChoice(false);

            }

            int winningBox = random.nextInt(3);
            boxArray[winningBox].setPrize(true);

            int userChoice = random.nextInt(3);

            boxArray[userChoice].setUserChoice(true);

            for (int j = 0; j < 3; j++) {
                if (!boxArray[j].isPrize() && !boxArray[j].isUserChoice()) {
                    boxArray[j].setOpened(true);
                    break;
                }
            }
            for (int j = 0; j < 3; j++) {
                if (!boxArray[j].isOpened() && !boxArray[j].isUserChoice()) {
                    boxArray[userChoice].setUserChoice(false);
                    userChoice = j;
                    boxArray[userChoice].setUserChoice(true);
                    break;
                }
            }
            if (userChoice == winningBox) {
                cntWins++;
            }
        }
        Results results = new Results(cntAll, cntWins);
        results.displayStatistics();
    }
}
