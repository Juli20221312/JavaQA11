package ru.netology.javaqa;

public class Radio {
    private int maxWave = 9;
    private int minWave = 0;
    private int currentWave = minWave;


    public Radio(int amount) {
        maxWave = minWave + amount - 1;
    }

    public Radio() {
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public int getMaxWave() {
        return maxWave;
    }

    public int getMinWave() {
        return minWave;
    }

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave < minWave) {
            return;
        }
        if (newCurrentWave > maxWave) {
            return;
        }
        currentWave = newCurrentWave;
    }

    public void setNumberWave(int newNumberWave) {
        if (newNumberWave < minWave) {
            return;
        }
        if (newNumberWave > maxWave) {
            return;
        }
        currentWave = newNumberWave;
    }

    public void setNextWave() {
        int target = currentWave + 1;
        if (currentWave == maxWave) {
            target = minWave;
        }
        setCurrentWave(target);
    }

    public void setPrevWave() {
        int target = currentWave - 1;
        if (currentWave == minWave) {
            target = maxWave;
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
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}

