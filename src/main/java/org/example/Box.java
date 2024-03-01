package org.example;

import lombok.Getter;
import lombok.Setter;

public class Box {
    private boolean prize = false;
    private boolean userChoice = false;
    private boolean opened = false;

    public boolean isPrize() {
        return prize;
    }

    public boolean isUserChoice() {
        return userChoice;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setPrize(boolean prize) {
        this.prize = prize;
    }

    public void setUserChoice(boolean userChoice) {
        this.userChoice = userChoice;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }
}
