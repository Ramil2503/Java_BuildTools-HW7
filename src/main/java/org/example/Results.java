package org.example;

public record Results(int cntAll, int cntWon) {
    public void displayStatistics() {
        int cntLost = cntAll - cntWon;

        System.out.println("Total Games: " + cntAll);
        System.out.println("Games Won: " + cntWon);
        System.out.println("Games Lost: " + cntLost);
        System.out.println("Winning Percentage: " + calculateWinningPercentage() + "%");
    }

    private double calculateWinningPercentage() {
        if (cntAll == 0) {
            return 0.0;
        }
        return ((double) cntWon / cntAll) * 100;
    }
}
