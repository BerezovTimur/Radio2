package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetCurrentStation(){
        Radio radio = new Radio();
        radio.setStation(5);
        assertEquals(5, radio.getStation());
    }

    @Test
    public void shouldSetUnderLimitStation(){
        Radio radio = new Radio();
        radio.setStation(11);
        assertEquals(0, radio.getStation());
    }

    @Test
    public void shouldSetOverLimitStation(){
        Radio radio = new Radio();
        radio.setStation(-1);
        assertEquals(0, radio.getStation());
    }

    @Test
    public void shouldSwitchChanelUp() {
        Radio radio = new Radio();
        radio.setStation(7);
        radio.switchArrowsUp();
        assertEquals(8, radio.getStation());
    }

    @Test
    public void shouldSwitchChanelFromMaxToMin() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.switchArrowsUp();
        assertEquals(0, radio.getStation());
    }

    @Test
    public void shouldSwitchChanelDown() {
        Radio radio = new Radio();
        radio.setStation(8);
        radio.switchArrowsDown();
        assertEquals(7, radio.getStation());
    }

    @Test
    public void shouldSwitchChanelFromMinToMax() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.switchArrowsDown();
        assertEquals(9, radio.getStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.volumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.volumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.volumeDown();
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetUnderLimitVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetOverLimitVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }
}