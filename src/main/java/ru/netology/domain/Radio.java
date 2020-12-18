package ru.netology.domain;

public class Radio {
    private int maxNumberRadio;
    private int minNumberRadio;
    private int currentNumberRadio;

    private int maxVolumeSound;
    private int minVolumeSound;
    private int currentVolumeSound;

    public int getMaxNumberRadio() {
        return maxNumberRadio;
    }

    public void setMaxNumberRadio(int maxNumberRadio) {

        this.maxNumberRadio = maxNumberRadio;
    }

    public int getMinNumberRadio() {

        return minNumberRadio;
    }

    public void setMinNumberRadio(int minNumberRadio) {

        this.minNumberRadio = minNumberRadio;
    }

    public int getCurrentNumberRadio() {

        return currentNumberRadio;
    }

    public void setCurrentNumberRadio(int currentNumberRadio) {
        if (currentNumberRadio > maxNumberRadio) {
            setCurrentNumberRadio(getMinNumberRadio());
            return;
        }

        if (currentNumberRadio < minNumberRadio) {
            setCurrentNumberRadio(getMaxNumberRadio());
            return;
        }

        this.currentNumberRadio = currentNumberRadio;
    }


    public int getMaxVolumeSound() {

        return maxVolumeSound;
    }

    public void setMaxVolumeSound(int maxVolumeSound) {

        this.maxVolumeSound = maxVolumeSound;
    }

    public int getMinVolumeSound() {

        return minVolumeSound;
    }

    public void setMinVolumeSound(int minVolumeSound) {

        this.minVolumeSound = minVolumeSound;
    }

    public int getCurrentVolumeSound() {

        return currentVolumeSound;
    }

    public void setCurrentVolumeSound(int currentVolumeSound) {
        if (currentVolumeSound > maxVolumeSound) {
            return;
        }

        if (currentVolumeSound < minVolumeSound) {
            return;
        }

        this.currentVolumeSound = currentVolumeSound;
    }
    public void increaseCurrentNumberRadio() {
        int increaseStation = getCurrentNumberRadio() + 1;
        setCurrentNumberRadio(increaseStation);
    }

    public void decreaseCurrentNumberRadio() {
        int decreaseStation = getCurrentNumberRadio() - 1;
        setCurrentNumberRadio(decreaseStation);
    }

    public void increaseCurrentVolumeSound() {
        int increaseVolume = getCurrentVolumeSound() + 1;
        setCurrentVolumeSound(increaseVolume);
    }

    public void decreaseCurrentVolumeSound() {
        int decreaseVolume = getCurrentVolumeSound() - 1;
        setCurrentVolumeSound(decreaseVolume);
    }
}