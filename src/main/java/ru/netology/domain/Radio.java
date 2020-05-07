package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Radio {
    private int minChanel;
    private int maxChanel;
    private int minVolume;
    private int maxVolume;
    private int currentVolume;
    private int currentChanel;

    public Radio(int minChanel, int maxChanel, int minVolume, int maxVolume) {
        this.minChanel = minChanel;
        this.maxChanel = maxChanel;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public void setStation(int currentChanel) {
        if (currentChanel > maxChanel){
            return;
        }
        if (currentChanel < minChanel){
            return;
        }
        this.currentChanel = currentChanel;
    }

    //Переключение вверх
    public void switchArrowsUp() {
        if (currentChanel == maxChanel) {
            currentChanel = minChanel;
            return;
        }
        this.currentChanel ++;
    }

    //Переключение вниз
    public void switchArrowsDown() {
        if (currentChanel == minChanel){
            currentChanel = maxChanel;
            return;
        }
        this.currentChanel --;
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
        if (currentVolume == maxVolume){
            return;
        }
        this.currentVolume ++;
    }

    //Уменьшить громкость
    public void volumeDown() {
        if (currentVolume == minVolume){
            return;
        }
        this.currentVolume --;
    }
}


