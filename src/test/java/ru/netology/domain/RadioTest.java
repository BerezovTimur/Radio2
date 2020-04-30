package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSwitchChanelUp() {
        Radio radio = new Radio();
        radio.setMaxChanel(9);
        radio.setMinChanel(0);
        radio.setStation(8);
        radio.switchArrowsUp();
        assertEquals(9, radio.getStation());
    }

    @Test
    public void shouldSwitchChanelDown() {
        Radio radio = new Radio();
        radio.setMaxChanel(9);
        radio.setMinChanel(0);
        radio.setStation(2);
        radio.switchArrowsDown();
        assertEquals(1, radio.getStation());
    }


    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);
        radio.volumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(8);
        radio.volumeDown();
        assertEquals(7, radio.getCurrentVolume());
    }



}