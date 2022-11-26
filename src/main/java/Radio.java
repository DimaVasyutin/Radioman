public class Radio {
    private int currentNumberStation;
    private int sizeAmountStation = 10;
    private int currentVolume;

    public Radio() {

    }

    public int getSizeAmountStation() {
        return sizeAmountStation;
    }


    public int setSizeAmountStation(int newSizeAmountStation) {
        if (newSizeAmountStation > 0) {
            sizeAmountStation = newSizeAmountStation;
        }
        return sizeAmountStation;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public int getVolume() {
        return currentVolume;
    }

    public int setCurrentNumberStation(int newCurrentNumberStation) {
        if (newCurrentNumberStation > -1 && newCurrentNumberStation < sizeAmountStation) {
            currentNumberStation = newCurrentNumberStation;
        }
        return currentNumberStation;
    }

    public int setVolume(int newVolume) {
        if (newVolume > -1 && newVolume < 101) {
            currentVolume = newVolume;
        }
        return currentVolume;
    }


    public void nextNumberStation() {
        currentNumberStation = currentNumberStation + 1;
        if (currentNumberStation == sizeAmountStation) {
            currentNumberStation = 0;
        }
    }

    public void prevNumberStation() {
        currentNumberStation = currentNumberStation - 1;
        if (currentNumberStation == -1) {
            currentNumberStation = sizeAmountStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reductionVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
