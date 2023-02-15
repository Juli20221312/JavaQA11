package ru.netology.javaqa;

public class Radio {
    private int currentWave;

    public int getCurrentWave() {
        return currentWave;
    }

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave < 0) {
            return;
        }
        if (newCurrentWave > 9) {
            return;
        }
        currentWave = newCurrentWave;
    }

    public void setNumberWave(int newNumberWave) {
        if (newNumberWave < 0) {
            return;
        }
        if (newNumberWave > 9) {
            return;
        }
        currentWave = newNumberWave;
    }

    public void setNextWave() {
        int target = currentWave + 1;
        if (currentWave == 9) {
            target = 0;
        }
        setCurrentWave(target);
    }

    public void setPrevWave() {
        int target = currentWave - 1;
        if (currentWave == 0) {
            target = 9;
        }
        setCurrentWave(target);
    }


    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}

