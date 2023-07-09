package ru.netology.radioman;

public class Radio {
    private int currentStation;
    static final int minStation = 0;
    static final int maxStation = 9;
    private int currentVolume;
    static int minVolume = 0;
    static int maxVolume = 10;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation || currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (maxStation <= currentStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void previousStation() {
        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume || currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++; //Инкремент, увеличивает значение целочисленной переменной на единицу.
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--; //Декремент, увеличивает значение целочисленной переменной на единицу.
        }
    }

}