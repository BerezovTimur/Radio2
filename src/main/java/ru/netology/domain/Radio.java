package ru.netology.domain;

public class Radio {
    private int maxVolume;
    private int minVolume;
    private int currentVolume;

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume){
            return;
        }
            this.currentVolume = currentVolume;
    }

    //Увеличить громкость
    public void volumeUp() {
        int increasedVolume = currentVolume + 1;
        if (increasedVolume > maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        this.currentVolume = increasedVolume;
    }

    //Уменьшить громкость
    public void volumeDown() {
        int decreasedVolume = currentVolume - 1;
        if (decreasedVolume < minVolume) {
            currentVolume = minVolume;
            return;
        }
        this.currentVolume = decreasedVolume;
    }
}
