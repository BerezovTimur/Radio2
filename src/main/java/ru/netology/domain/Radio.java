package ru.netology.domain;

public class Radio {
    private int station;
    private int maxChanel;
    private int minChanel;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        this.station = station;
    }

    public int getMaxChanel() {
        return maxChanel;
    }

    public void setMaxChanel(int maxChanel) {
        this.maxChanel = maxChanel;
    }

    public int getMinChanel() {
        return minChanel;
    }

    public void setMinChanel(int minChanel) {
        this.minChanel = minChanel;
    }

    //Переключение вверх
    public void switchArrowsUp() {
        int chanelUp = station + 1;
        if (chanelUp > maxChanel) {
            station = 0;
            return;
        }
        this.station = chanelUp;
    }

    //Переключение вниз
    public void switchArrowsDown() {
        int chanelDown = station - 1;
        if (chanelDown < minChanel) {
            station = 9;
            return;
        }
        this.station = chanelDown;
    }

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
        if (currentVolume < minVolume) {
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
