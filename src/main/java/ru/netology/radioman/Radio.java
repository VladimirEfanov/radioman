package ru.netology.radioman;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentStation;
    static int minStation = 0;
    private int currentVolume;
    static int minVolume = 0;
    static int maxVolume = 100;

    private int countStation = 10;

  /*  public Radio() {
    } */

    public Radio(int countStation) {
        this.countStation = countStation;
    }

 /*   public int getCurrentStation() {
        return currentStation;
    } */

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation || currentStation > countStation - 1) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (countStation - 1 <= currentStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void previousStation() {
        if (currentStation <= minStation) {
            setCurrentStation(countStation - 1);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

 /*   public int getCurrentVolume() {
        return currentVolume;
    } */

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume || currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

}