package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void increaseCurrentNumberRadio() {
        Radio radio = new Radio(10,10,0,0);
        radio.increaseCurrentNumberRadio();
        assertEquals(radio.getMinNumberRadio(), radio.getCurrentNumberRadio());

    }

    @Test
    void decreaseCurrentNumberRadio() {
        Radio radio = new Radio(0,10,0,0);
        radio.decreaseCurrentNumberRadio();
        assertEquals(radio.getMaxNumberRadio(), radio.getCurrentNumberRadio());
    }

    @Test
    void increaseCurrentVolumeSound() {
        Radio radio = new Radio(0,10,100,100);
        radio.increaseCurrentVolumeSound();
        radio.increaseCurrentVolumeSound();
        assertEquals(radio.getMaxVolumeSound(), radio.getCurrentVolumeSound());
    }
    @Test
    void decreaseCurrentVolumeSound() {
        Radio radio = new Radio(0,10,0,0);
        radio.decreaseCurrentVolumeSound();
        radio.decreaseCurrentVolumeSound();
        assertEquals(radio.getMinVolumeSound(), radio.getCurrentVolumeSound());
    }
}