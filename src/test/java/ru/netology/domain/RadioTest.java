package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void increaseCurrentNumberRadio() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(radio.getMaxNumberRadio() - 1);
        radio.increaseCurrentNumberRadio();
        radio.increaseCurrentNumberRadio();
        assertEquals(radio.getMinNumberRadio(), radio.getCurrentNumberRadio());
    }

    @Test
    void decreaseCurrentNumberRadio() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(radio.getMinNumberRadio());
        radio.decreaseCurrentNumberRadio();
        assertEquals(radio.getMaxNumberRadio(), radio.getCurrentNumberRadio());
    }

    @Test
    void increaseCurrentVolumeSound() {
        Radio radio = new Radio();
        radio.setCurrentVolumeSound(radio.getMaxVolumeSound() - 1);
        radio.increaseCurrentVolumeSound();
        assertEquals(radio.getMaxVolumeSound(), radio.getCurrentVolumeSound());
    }

    @Test
    void decreaseCurrentVolumeSound() {
        Radio radio = new Radio();
        radio.setCurrentVolumeSound(radio.getMinVolumeSound());
        radio.decreaseCurrentVolumeSound();

        assertEquals(radio.getMinVolumeSound(), radio.getCurrentVolumeSound());
    }

}